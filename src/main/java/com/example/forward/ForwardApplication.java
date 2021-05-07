package com.example.forward;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.mybatisCache.service", "com.example.mybatisCache.dao"})
@MapperScan(basePackages = {"com.porsche.panamera.core.dal.dao"})
@SpringBootApplication
public class ForwardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForwardApplication.class, args);
    }

}
