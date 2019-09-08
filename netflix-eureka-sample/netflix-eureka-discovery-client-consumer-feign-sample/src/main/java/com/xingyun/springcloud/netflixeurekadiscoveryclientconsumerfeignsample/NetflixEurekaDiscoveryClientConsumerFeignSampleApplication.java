package com.xingyun.springcloud.netflixeurekadiscoveryclientconsumerfeignsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 星云
 * @功能
 * @日期和时间 9/9/2019 12:36 AM
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixEurekaDiscoveryClientConsumerFeignSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaDiscoveryClientConsumerFeignSampleApplication.class, args);
    }

}
