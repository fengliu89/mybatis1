import com.aaa.mb.until.SqlSessionFactoryUntil;
import dao.EmpDao;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * className:EmpDaoTest
 * discriptoin:
 * author:FLZ
 * createTime:2018-11-05 16:49
 */
public class EmpDaoTest {
    @Test
    public void testGetList(){
        SqlSession sqlSession =null;
        try {
            sqlSession = SqlSessionFactoryUntil.createSqlSession();
            EmpDao empDao = sqlSession.getMapper(EmpDao.class);
            Map paramMap = new HashMap();
            paramMap.put("job","CLERK");
            paramMap.put("startDate","1981-01-01");
            paramMap.put("endDate","1987-01-01");
            List<Map> list = empDao.getList(paramMap);
            for (Map map : list) {
                System.out.println("名称："+map.get("ENAME")+"--"+map.get("JOB"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


    @Test
    public void testGetListByParam(){
        SqlSession sqlSession =null;
        try {
            sqlSession = SqlSessionFactoryUntil.createSqlSession();
            EmpDao empDao = sqlSession.getMapper(EmpDao.class);
            Map paramMap = new HashMap();
            paramMap.put("empNo",7369);
            paramMap.put("job","CLERK");
            paramMap.put("startDate","1981-01-01");

            List<Map> list = empDao.getListByParam(paramMap);
            for (Map map : list) {
                System.out.println("名称："+map.get("ENAME")+"--"+map.get("JOB"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void testGetListByList(){
        SqlSession sqlSession =null;
        try {
            sqlSession = SqlSessionFactoryUntil.createSqlSession();
            EmpDao empDao = sqlSession.getMapper(EmpDao.class);
            List paramList = new ArrayList();
            paramList.add(7369);
            paramList.add(7900);
            List<Map> list = empDao.getListByList(paramList);
            for (Map map : list) {
                System.out.println("名称："+map.get("ENAME")+"--"+map.get("JOB"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
