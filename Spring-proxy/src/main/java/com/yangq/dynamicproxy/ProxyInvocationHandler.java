package com.yangq.dynamicproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 19:57
 */

public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }
    //重写的InvocationHandler中的invoke方法
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;
    }
    //生成得到代理类
    public Object getProxy () {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }
    public void log (String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}
