
import com.yangq.config.YangqConfig;
import com.yangq.config.YangqConfig2;
import com.yangq.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/24 21:30
 */

public class SpringTest {
    public static void main(String[] args) {
//        //容器中所有对象获取上下文创建时 被全部创建了
//        ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        User user= context.getBean("user", User.class);
//        System.out.println(user);
//        people.getCat().Shout();
//        people.getDog().Shout();
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(YangqConfig.class);
        User getUser = (User)annotationConfigApplicationContext.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
