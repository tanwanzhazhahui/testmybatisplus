package com.testmybatisplus;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.testmybatisplus.mapper")
@SpringBootApplication
public class TestmybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmybatisplusApplication.class, args);
    }

}
