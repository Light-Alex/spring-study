package com.yan.config;

import com.yan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 这个也会被Spring容器托管，注册到容器中，因为他本身就是一个@Component
// @Configuration代表这是一个配置类，就如之前的beans.xml
// 这里同时使用了@Configuration、@ComponentScan 和 @Bean，容器中有两个User对象, 一个id为getUser，另一个id为user
@Configuration
@ComponentScan("com.yan.pojo")
@Import(YanConfig2.class) // 导入配置类
public class YanConfig {

    // 注册一个bean, 相当于我们之前写的一个bean标签
    // 这个方法的名字，相当于bean标签中的id属性
    // 这个方法的返回值，相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User(); // 返回注入到bean的对象！
    }
}
