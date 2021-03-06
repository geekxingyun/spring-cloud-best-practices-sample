package com.xingyun.springcloud.netflixeurekadiscoveryclientserviceprovidersample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 星云
 * @功能
 * @日期和时间 9/8/2019 6:29 PM
 */
@Slf4j
@RestController
public class ProviderController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        log.info("Hi I am {},Hello World Method have been called!!!", applicationName);
        return this.discoveryClient.getInstances(applicationName);
    }
}
