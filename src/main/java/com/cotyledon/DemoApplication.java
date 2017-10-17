package com.cotyledon;

import org.springframework.boot.SpringApplication;
//如果使用SpringBootApplication需要加载此类
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableEurekaClient使用
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
