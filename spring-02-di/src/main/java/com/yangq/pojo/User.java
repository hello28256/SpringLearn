package com.yangq.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.lang.Nullable;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 14:36
 */
//@Component 等价于<bean id="user" class="com.yang.entity.User"/>
//@Component
@Configuration
public class User {
    @Nullable
    private String name;
    //@Value("yang") 相当于<property name="name" value="yang"/>
    @Value("yangqq")
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
