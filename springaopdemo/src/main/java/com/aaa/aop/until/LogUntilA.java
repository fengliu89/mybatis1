package com.aaa.aop.until;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * className:LogUntil
 * discriptoin: 通知 是切面（日志记录功能） 的具体实现类，是放置切面代码的地方
 * author:FLZ
 * createTime:2018-11-08 14:07
 */
@Component //三个分层之外，用该注解
@Aspect //通知类的注解
public class LogUntilA {
    @Pointcut(value = "execution(void add*(..)) || execution(void update*(..))")
    public void pointa(){
    }
    /**
     * 记录日志功能
     */
   @AfterReturning(value = "pointa()")
    public void saveLog(){
        System.out.println("模拟日志记录");
    }

    /**
     * 前置通知
     */
    public void beforeOpt(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("执行业务方法"+name+"之前的操作");
    }
    public void exceptionAdivce(JoinPoint joinPoint,Exception ex){
        //获取连接点名称
        String name = joinPoint.getSignature().getName();
        System.out.println("执行业务方法"+name+"时候，发生了名为"+ex.getClass().getName()+"的异常，异常描述为"+ex.getMessage());
    }

    /**
     * 最终通知
     * @param joinPoint
     */
    //@After(value = "pointa()")
    public void fianlAdvice(JoinPoint joinPoint){
        System.out.println("无论连接点方法执行过程是否有异常都会执行");
    }

    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println(System.currentTimeMillis()+"在业务方法执行之前操作");
        Object o=null;
        try {
            o=proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println(System.currentTimeMillis()+"在业务方法执行之前操作");
        return o;
    }
}
//切面 通知 切入点 连接点 织入 目标对象
