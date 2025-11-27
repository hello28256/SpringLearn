package com.yangq.dynamicproxy;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 20:02
 */

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //设置要代理的对象
        proxyInvocationHandler.setTarget(userService);
        //注意要用接口强转，否则会报异常
        UserService proxy = (UserService)proxyInvocationHandler.getProxy();
        proxy.delete();
    }

}
