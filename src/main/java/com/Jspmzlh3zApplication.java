package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.dao")
@SpringBootApplication
@ServletComponentScan
public class Jspmzlh3zApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Jspmzlh3zApplication.class, args);
    }
}
