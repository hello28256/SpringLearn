/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/28 14:12
 */

import com.yangq.pojo.User;
import com.yangq.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class MyTest {
    @Test
    public void test () throws IOException {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserMapper userMapper = classPathXmlApplicationContext.getBean("userMapper", UserMapper.class);
        List<User> userList = userMapper.selectUser();

        for (User user : userList) {
            System.out.println(user);
        }
    }
}
