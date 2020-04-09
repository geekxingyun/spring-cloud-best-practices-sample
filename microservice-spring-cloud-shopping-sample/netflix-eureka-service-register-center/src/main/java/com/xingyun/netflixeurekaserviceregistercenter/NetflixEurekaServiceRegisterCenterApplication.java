package com.xingyun.netflixeurekaserviceregistercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaServiceRegisterCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaServiceRegisterCenterApplication.class, args);
    }

}
