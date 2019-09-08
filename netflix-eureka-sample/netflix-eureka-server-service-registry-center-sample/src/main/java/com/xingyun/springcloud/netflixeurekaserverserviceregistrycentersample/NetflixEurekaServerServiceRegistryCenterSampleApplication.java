package com.xingyun.springcloud.netflixeurekaserverserviceregistrycentersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaServerServiceRegistryCenterSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaServerServiceRegistryCenterSampleApplication.class, args);
    }

}
