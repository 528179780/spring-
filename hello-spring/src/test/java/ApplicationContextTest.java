import com.sufus.pring.hello.spring.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试使用ApplicationContext来获取对象
 * @author sufu
 * @date 2020/7/28
 */
public class ApplicationContextTest {
    public static void main(String[] args) {
        // 获取Spring的上下文对象，我们的对象现在都由Spring管理了，使用的话就直接使用就行了。
        ApplicationContext a =new  ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) a.getBean("hello");
        System.out.println(hello.getString());
    }

}
