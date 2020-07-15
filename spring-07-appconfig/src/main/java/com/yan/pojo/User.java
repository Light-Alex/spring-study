package com.yan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 这里这个注解，说明这个类被Spring接管了，注册到了容器中
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("张三")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "pojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
