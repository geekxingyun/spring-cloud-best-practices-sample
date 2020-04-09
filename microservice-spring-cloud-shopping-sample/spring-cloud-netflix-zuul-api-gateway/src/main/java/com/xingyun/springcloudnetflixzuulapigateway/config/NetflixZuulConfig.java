package com.xingyun.springcloudnetflixzuulapigateway.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.xingyun.springcloudnetflixzuulapigateway.filter.SimpleFilter;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @EnableHystrix 是@EnableCircuitBreaker 互为别名 不管两者使用哪个注解都是相同的效果 开启容错保护功能
 * @EnableDiscoveryClient 开启注册到Eureka Server 的功能
 * 注解一: @EnableZuulServer
 * 注解二: @EnableZuulProxy 包括了@EnableZuulServer 和断路器等功能
 * 使用@EnableZuulProxy注解告诉Spring Boot 应用程序框架启动 Zuul 路由服务器
 * @EnableZuulProxy是一个组合注解,包括@EnableCircuitBreaker+@EanbleDiscoveryClient
 * 也就是说当使用了@EnableZuulProxy 就自动为我们的程序启用了容错保护功能
 * 同时也将@EnableZuulProxy作为一个服务注册到服务治理服务器中。
 *  @author qing-feng.zhao
 */
@EnableZuulProxy
@Configuration
public class NetflixZuulConfig {
    @Bean
    public SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }

    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
