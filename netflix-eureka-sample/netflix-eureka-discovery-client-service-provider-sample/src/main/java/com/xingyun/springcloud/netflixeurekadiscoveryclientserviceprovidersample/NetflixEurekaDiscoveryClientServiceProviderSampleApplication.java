package com.xingyun.springcloud.netflixeurekadiscoveryclientserviceprovidersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 星云
 * @功能
 * @日期和时间 9/8/2019 6:29 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixEurekaDiscoveryClientServiceProviderSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaDiscoveryClientServiceProviderSampleApplication.class, args);
    }

}
