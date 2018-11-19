package com.aaa.aop.test;

import com.aaa.aop.service.DeptServiceImpl;
import com.aaa.aop.service.GoodsServiceImpl;
import com.aaa.aop.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * className:AopTest
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-08 14:28
 */
public class AopTestA {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springaop-annotation-config.xml");
        //使用BeanFactory接口中提供的getBean方法获取对象
        GoodsServiceImpl goodsService = (GoodsServiceImpl) applicationContext.getBean("goodsServiceImpl");
        //GoodsServiceImpl goodsService = (GoodsServiceImpl) applicationContext.getBean("goodsService");
        goodsService.addGoods();
        goodsService.update();

    }
}
