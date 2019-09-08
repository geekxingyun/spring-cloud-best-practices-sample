package com.xingyun.springcloud.netflixeurekadiscoveryclientconsumerfeignsample.controller;

import com.xingyun.springcloud.netflixeurekadiscoveryclientconsumerfeignsample.interfaces.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 星云
 * @功能
 * @日期和时间 9/9/2019 12:36 AM
 */
@RestController
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }
}
