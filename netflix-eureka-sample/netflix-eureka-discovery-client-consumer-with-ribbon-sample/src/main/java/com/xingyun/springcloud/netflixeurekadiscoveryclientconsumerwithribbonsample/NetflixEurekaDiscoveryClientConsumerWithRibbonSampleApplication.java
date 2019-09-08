package com.xingyun.springcloud.netflixeurekadiscoveryclientconsumerwithribbonsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 星云
 * @功能
 * @日期和时间 9/8/2019 9:26 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixEurekaDiscoveryClientConsumerWithRibbonSampleApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(NetflixEurekaDiscoveryClientConsumerWithRibbonSampleApplication.class, args);
    }

}
