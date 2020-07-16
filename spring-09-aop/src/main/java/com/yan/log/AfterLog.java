package com.yan.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

    // 要代理对象的方法成功调用后，做一些处理
    // returnValue: 要代理对象的方法的返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "执行了" + method.getName() + "方法，返回结果为: " + returnValue);
    }
}
