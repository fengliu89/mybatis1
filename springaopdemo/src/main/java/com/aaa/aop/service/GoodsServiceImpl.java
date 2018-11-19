package com.aaa.aop.service;

import org.springframework.stereotype.Service;

/**
 * className:GoodsServiceImpl
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-08 16:08
 */
@Service
public class GoodsServiceImpl {
    /**
     * 模拟商品添加
     */
    public void addGoods(){
        System.out.println("模拟商品添加");
        //System.out.println("模拟日志记录");
        //System.out.println(1/0);
    }
    /**
     * 修改
     */
    public void update(){
        System.out.println("模拟商品修改");
        // System.out.println("模拟日志记录");
    }
    /**
     * 删除
     */
    public void delete(){
        System.out.println("模拟商品删除");
        // System.out.println("模拟日志记录");
    }
}
