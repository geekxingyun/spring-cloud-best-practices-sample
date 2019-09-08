package com.xingyun.springcloud.netflixeurekaserviceregisterdiscoveryserversample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 星云
 * @功能
 * @日期和时间 9/8/2019 10:53 AM
 */
@EnableEurekaServer
@SpringBootApplication
public class NetflixEurekaServiceRegisterDiscoveryServerSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaServiceRegisterDiscoveryServerSampleApplication.class, args);
    }

}
