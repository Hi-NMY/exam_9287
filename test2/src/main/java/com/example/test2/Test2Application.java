package com.example.test2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.test2.mapper")
@SpringBootApplication
public class Test2Application {

    public static void main(String[] args) {
        SpringApplication.run(Test2Application.class, args);
        System.out.println("已启动.......");
    }

}
