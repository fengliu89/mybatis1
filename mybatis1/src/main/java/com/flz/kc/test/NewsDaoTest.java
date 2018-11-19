package com.flz.kc.test;


import com.flz.kc.dao.NewsDao;
import com.flz.kc.until.SqlSessionFactoryUntil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * className:NewsDaoTest
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-06 10:06
 */
public class NewsDaoTest {
    @Test
    public void TestSelect(){
         //查询方法
        //使用工具类获取SqlSession
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUntil.createSqlSession();
            //利用SqlSession提供的方法获取接口的实现类   getMapper使用接口和配置文件实例化接口的实现类
            NewsDao newsDao=sqlSession.getMapper(NewsDao.class);
            List<Map> list = newsDao.getList();
            for (Map map : list) {
                System.out.println(map);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }

    }

    //添加
    @Test
    public void TestAdd(){
        //使用工具类获取SqlSession
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUntil.createSqlSession();
            //利用SqlSession提供的方法获取接口的实现类   使用接口和配置文件实例化接口的实现类
            NewsDao newsDao = sqlSession.getMapper(NewsDao.class);
            HashMap map = new HashMap();
            map.put("newsId",9);
            map.put("title","SB87");
            map.put("content","有个傻逼");
            map.put("typeid",1);
            //调用添加方法
            int result = newsDao.add(map);
            //提交事务
            sqlSession.commit();
            if (result>0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
    //修改
    @Test
    public void TestUpdate(){
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUntil.createSqlSession();
            //利用SqlSession提供的方法获取接口的实现类   使用接口和配置文件实例化接口的实现类
            NewsDao newsDao = sqlSession.getMapper(NewsDao.class);
            Map map = newsDao.getById(9);
            map.put("newsId",9);
            map.put("title","87sb");
            map.put("content","一群傻逼");
            map.put("typeid","2");


            int result = newsDao.update(map);
            //提交事务
            sqlSession.commit();
            if (result>0){
                System.out.println("更新成功");
            }else{
                System.out.println("更新失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }

    }
    //删除
    @Test
    public void testDelete() {
        //使用工具类获取SqlSession
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUntil.createSqlSession();
            //利用SqlSession提供的方法获取接口的实现类   使用接口和配置文件实例化接口的实现类
            NewsDao newsDao = sqlSession.getMapper(NewsDao.class);
            int result = newsDao.delete(9);
            //提交事务
            sqlSession.commit();
            if (result > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }

    }

}

