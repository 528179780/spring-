package com.sufu.spring.javaconfig.config;

import com.sufu.spring.javaconfig.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sufu
 * @date 2020/7/29
 */
@Configuration
@ComponentScan(basePackages = "com.sufu")
public class MyConfig {

    public User user(){
        return new User();
    }
}
