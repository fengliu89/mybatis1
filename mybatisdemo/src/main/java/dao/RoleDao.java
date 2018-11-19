package dao;

import com.aaa.mb.entity.Role;

import java.util.List;

/**
 * className:RoleDao
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-07 08:59
 */
public interface RoleDao {
    /**
     * 多对多
     * @return
     */
    List<Role> manyToMany();
}
