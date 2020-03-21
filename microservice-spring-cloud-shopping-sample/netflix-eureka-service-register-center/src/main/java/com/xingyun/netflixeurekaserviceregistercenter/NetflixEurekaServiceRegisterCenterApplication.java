package com.xingyun.netflixeurekaserviceregistercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 将当前应用程序作为Netflix Eureka Service Register Center
 * 服务注册中心
 * 只需要添加@EnableEurekaServer注解就可以启动Eureka 服务器的相关功能
 */
@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaServiceRegisterCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaServiceRegisterCenterApplication.class, args);
    }
}
