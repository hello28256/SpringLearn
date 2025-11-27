package com.yangq.static_proxy02;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 20:49
 */

public class Client {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
