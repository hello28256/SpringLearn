import com.yangq.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/26 15:51
 */

public class MyTest {

    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //我们的对象现在都在spring中管理，我们要使用，直接去里面取出来
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
        }
}

