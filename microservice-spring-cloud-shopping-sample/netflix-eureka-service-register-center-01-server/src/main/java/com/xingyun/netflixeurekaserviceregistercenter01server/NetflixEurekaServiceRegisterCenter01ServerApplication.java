package com.xingyun.netflixeurekaserviceregistercenter01server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 * Eureka 服务注册中心 将当前应用程序作为Netflix Eureka Service Register Center
 * 只需要添加@EnableEurekaServer注解就可以启动Eureka 服务器的相关功能
 * 这个服务器包含一个带有UI 和Restful API 功能的首页,请求路径是/eureka/*
 * 微服务的注册信息全部保存在内存中
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaServiceRegisterCenter01ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaServiceRegisterCenter01ServerApplication.class, args);
    }

}
