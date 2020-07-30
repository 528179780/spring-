import com.sufu.spring.aop.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sufu
 * @date 2020/7/30
 */
public class AopTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 动态代理代理的是接口，不能是一个实现类,相当于这里返回的是一个代理类，不是真正的UserService的实现类，经过了一层代理，因为被代理的类也实现了相应的接口
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
