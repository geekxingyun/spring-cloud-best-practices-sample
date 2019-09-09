package com.xingyun.springcloud.netflixeurekaserverserviceregistrycentersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 星云
 * @功能 Netflix Eureka 服务端 服务注册中心
 * @日期和时间 9/9/2019 8:04 AM
 */
@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaServerServiceRegistryCenterSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaServerServiceRegistryCenterSampleApplication.class, args);
    }
}
