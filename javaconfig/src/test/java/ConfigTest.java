import com.sufu.spring.javaconfig.config.MyConfig;
import com.sufu.spring.javaconfig.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 这是通过java代码配置的一个实例，这里getBean的name属性应该是配置中@bean注解的方法的名称。
 * @author sufu
 * @date 2020/7/29
 */
public class ConfigTest {
    public static void main(String[] args) {
        ApplicationContext a = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = a.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
