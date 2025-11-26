
import com.yangq.Address;
import com.yangq.People;
import com.yangq.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/24 21:30
 */

public class SpringTest {
    public static void main(String[] args) {
        //容器中所有对象获取上下文创建时 被全部创建了
        ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        People people= context.getBean("people", People.class);
        people.getCat().Shout();
        people.getDog().Shout();
    }
}
