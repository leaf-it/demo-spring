package com.cotyledon;

import org.springframework.boot.SpringApplication;
//如果使用SpringBootApplication需要加载此类
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
