package dao;

import java.util.List;
import java.util.Map;

/**
 * className:EmpDao
 * discriptoin:雇员数据访问类
 * author:zz
 * createTime:2018-11-05 16:40
 */
public interface EmpDao {
    /**
     * 获取雇员列表(if)
     * @param map
     * @return
     */
    List<Map> getList(Map map);

    /**
     * 获取雇员列表(choose when otherwise)
     * @param map
     * @return
     */
    List<Map>  getListByParam (Map map);

    /**
     * 获取雇员列表（foreach）
     * @param list
     * @return
     */
    List<Map> getListByList(List list);
}
