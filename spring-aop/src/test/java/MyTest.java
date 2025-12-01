/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/28 09:38
 */

import com.yangq.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = classPathXmlApplicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}

