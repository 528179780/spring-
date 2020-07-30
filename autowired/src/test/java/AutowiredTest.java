import com.sufu.spring.auto.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sufu
 * @date 2020/7/28
 */
public class AutowiredTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        // 这里的cat dog 两个对象都是自动装配的
        person.getCat().eat();
        person.getDog().eat();
    }
}
