package com.zhsw.securitydemo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.zhsw.securitydemo4.service")
@SpringBootApplication
public class SecurityDemo4Application {

    public static void main(String[] args) {
        SpringApplication.run(SecurityDemo4Application.class, args);
    }

}
