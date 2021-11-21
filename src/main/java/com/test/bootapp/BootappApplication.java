package com.test.bootapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.test.*")
@MapperScan(basePackages = "com.test.mapper")
public class BootappApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootappApplication.class, args);
    }

}
