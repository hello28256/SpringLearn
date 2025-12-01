package com.yangq.log;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/28 09:37
 */

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;
public class Log implements MethodBeforeAdvice, AfterReturningAdvice {
    //method:要执行的目标对象的方法（method being invoked）
    //object:参数（args: arguments to the method）
    //o:目标对象 （target：target of the method invocation）
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
    //returnValue:返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回值为" + returnValue);
    }

}

