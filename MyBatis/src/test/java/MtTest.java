import com.sufu.spring.mybatis.dao.AccountMapper;
import com.sufu.spring.mybatis.entity.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author sufu
 * @date 2020/7/30
 */
public class MtTest {
    /**
     * 原生mybatis写法，需要两个配置文件：
     * 一个是mybatis的配置，配置数据库地址等等
     * 另一个是mapper，写sql
     * @author sufu
     * @date 2020/7/30 12:06
     **/
    @Test
    public void oldMybatisTest() throws IOException {
        String resources = "MyBatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 自动提交事务
        SqlSession sqlSession = sf.openSession(true);
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accounts = mapper.selectAll();
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
        sqlSession.close();
        resourceAsStream.close();
    }
    @Test
    public void newMybatisTest(){
        ClassPathXmlApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
        SqlSessionFactory sqlSessionFactory = a.getBean("sqlSessionFactory", SqlSessionFactory.class);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accounts = mapper.selectAll();
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
        sqlSession.close();
    }
    @Test
    public void sqlSessionTemplateTest(){
        ClassPathXmlApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
        SqlSessionTemplate sqlSessionTemplate = a.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
        AccountMapper mapper = sqlSessionTemplate.getMapper(AccountMapper.class);
        List<Account> accounts = mapper.selectAll();
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }
    @Test
    public void testInsert(){
        ClassPathXmlApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
        SqlSessionTemplate sqlSessionTemplate = a.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
        AccountMapper mapper = sqlSessionTemplate.getMapper(AccountMapper.class);
        int i = mapper.insertAccount(new Account("张三","男",30,1802.54));
        System.out.println(i);
    }
    @Test
    public void testDelete(){
        ClassPathXmlApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
        SqlSessionTemplate sqlSessionTemplate = a.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
        AccountMapper mapper = sqlSessionTemplate.getMapper(AccountMapper.class);
        int i = mapper.deleteAccount(4);
        if(i>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
    @Test
    public void testTransactional(){
        ClassPathXmlApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
        SqlSessionTemplate sqlSessionTemplate = a.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
        AccountMapper mapper = sqlSessionTemplate.getMapper(AccountMapper.class);
        int i = mapper.insertAccount(new Account("苏伏", "男", 20, 9999.54));
        Account account = mapper.selectOneByName("苏伏");
        int i1 = mapper.deleteAccount(account.getId());
        if(i1>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}
