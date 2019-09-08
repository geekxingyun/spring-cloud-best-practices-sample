package com.xingyun.springcloud.netflixeurekadiscoveryclientconsumerfeignsample.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 星云
 * @功能
 * @日期和时间 9/9/2019 12:35 AM
 */
@FeignClient(value = "netflix-eureka-client-service-provider")
public interface ConsumerService {
    /**
     *  消费生产者提供的服务
     * @return
     */
    @GetMapping("/service-instances/netflix-eureka-discovery-client-consumer-with-ribbon")
    String consumer();
}
