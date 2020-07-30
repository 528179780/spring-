import com.sufu.spring.ioc.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sufu
 * @date 2020/7/28
 */
public class IOCTest {
    public static void main(String[] args) {
        // new一个 UserService的实现类，这里需要自己 new，也就是硬编码在文件里，实际调用的是业务层
//        UserServiceImpl u = new UserServiceImpl();
//        u.setUserDao(new UserDaoMySqlImpl());

        // 不用自己new对象了，这一步相当于相当于拿到容器。这样修改程序只需要修改xml就可以了。
        ApplicationContext a = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        UserServiceImpl u = (UserServiceImpl)a.getBean("userServiceImpl");
//        u.getUser();

        // Spring默认配置调用无参构造方法创建对象，如果没有无参构造，就会报错
        User user = (User) a.getBean("user");
        user.showInfo();
    }
}
