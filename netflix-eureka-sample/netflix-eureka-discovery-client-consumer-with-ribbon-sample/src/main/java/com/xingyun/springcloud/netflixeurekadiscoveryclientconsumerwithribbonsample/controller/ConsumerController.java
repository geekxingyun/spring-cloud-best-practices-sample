package com.xingyun.springcloud.netflixeurekadiscoveryclientconsumerwithribbonsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 星云
 * @功能
 * @日期和时间 9/8/2019 9:26 PM
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://netflix-eureka-client-service-provider/service-instances/netflix-eureka-discovery-client-consumer-with-ribbon", String.class);
    }
}
