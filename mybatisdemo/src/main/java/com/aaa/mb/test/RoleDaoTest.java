import com.aaa.mb.entity.Role;
import com.aaa.mb.entity.power;
import com.aaa.mb.until.SqlSessionFactoryUntil;
import dao.RoleDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * className:RoleDaoTest
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-07 09:08
 */
public class RoleDaoTest {
    @Test
    public void testManyToMany(){
        SqlSession sqlSession = null;
        try {
            //使用工具类获取SqlSession
            sqlSession = SqlSessionFactoryUntil.createSqlSession();
            //利用SqlSession提供的方法获取接口的实现类    getMapper 使用接口和配置文件实例化接口的实现类
            RoleDao roleDao = sqlSession.getMapper(RoleDao.class);
            List<Role> roles =  roleDao.manyToMany();

            if(roles!=null&&roles.size()>0){
                for (Role role : roles) {
                    System.out.println("角色:"+role.getName());
                    List<power> powerList = role.getPowerList();
                    if(powerList!=null&&powerList.size()>0){
                        System.out.println("角色看到的权限有"+powerList.size()+"个,分别为:");
                        for (power power : powerList) {
                            System.out.println("----权限名称:"+power.getName()+",url:"+power.getUrl()+",父ID:"+power.getPid());
                        }
                    }else {
                        System.out.println("该角色看不到任何权限!!!");
                    }
                    System.out.println("----------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(sqlSession!=null)
                sqlSession.close();
        }
    }

}
