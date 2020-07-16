package com.yan.demo04;

import com.yan.demo02.UserService;
import com.yan.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();

        // 调用处理类
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 传入被代理的对象
        pih.setTarget(userService);

        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
