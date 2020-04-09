package com.xingyun.springcloudnetflixzuulapigateway.config;

import com.xingyun.springcloudnetflixzuulapigateway.filter.SimpleFilter;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qing-feng.zhao
 */
/**
 * 使用@EnableZuulProxy注解告诉Spring Boot 应用程序框架启动运行Zuul 服务
 * @EnableZuulProxy是一个组合注解,包括@EnableCircuitBreaker+@EanbleDiscoveryClient
 * 也就是说当使用了@EnableZuulProxy 就自动为我们的程序启用了容错保护功能
 * 同时也将@EnableZuulProxy作为一个服务注册到服务治理服务器中。
 */
@EnableZuulProxy
@Configuration
public class NetflixZuulConfig {
    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }
}
