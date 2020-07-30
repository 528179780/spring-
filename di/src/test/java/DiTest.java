import com.sufu.spring.di.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sufu
 * @date 2020/7/28
 */
public class DiTest {
    public static void main(String[] args) {
        ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) a.getBean("student");
        System.out.println(student.toString());
    }
}
