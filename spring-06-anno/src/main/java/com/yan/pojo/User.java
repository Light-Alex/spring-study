package com.yan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于<bean id="user" class="com.yan.pojo.User"/>
// @Component: 组件
@Component
@Scope("singleton") //单例模式
public class User {

    // 相当于<property name="name" value="张武"/>
    @Value("张武")
    public String name;

    @Value("张武3")
    public void setName(String name) {
        this.name = name;
    }
}
