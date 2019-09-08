package com.xingyun.springcloud.netflixeurekadiscoveryclientprovidersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 星云
 * @功能
 * @日期和时间 9/8/2019 1:37 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixEurekaDiscoveryClientProviderSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaDiscoveryClientProviderSampleApplication.class, args);
    }
}
