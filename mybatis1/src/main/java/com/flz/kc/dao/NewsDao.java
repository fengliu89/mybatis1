package com.flz.kc.dao;

import java.util.List;
import java.util.Map;

/**
 * className:NewsDao
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-06 09:31
 */
public interface NewsDao {
    /**
     * 获取新闻列表
     * @return
     */
    List<Map> getList();

    /**
     * 新闻添加
     * @param map
     * @return
     */
    int add(Map map);

    /**
     * 根据id查询信息
     * @param newsId
     * @return
     */
    Map  getById(int newsId);

    /**
     * 更新
     * @param map
     * @return
     */
    int update(Map map);

    /**
     * 删除
     * @param map
     * @return
     */
    int delete(int newsId);

}
