package com.zuul;

import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by progr on 2019/8/20.
 */
@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
public class UserZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserZuulApplication.class);
    }
}
