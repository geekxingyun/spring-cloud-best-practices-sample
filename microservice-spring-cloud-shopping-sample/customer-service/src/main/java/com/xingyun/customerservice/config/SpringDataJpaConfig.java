package com.xingyun.customerservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/1 8:45
 */
@EnableJpaRepositories(basePackages = {
        "com.xingyun.customerservice.dao.jpa",
})
@Configuration
public class SpringDataJpaConfig {
}
