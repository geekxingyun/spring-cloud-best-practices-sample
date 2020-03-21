package com.xingyun.productcommentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductCommentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCommentServiceApplication.class, args);
    }

}
