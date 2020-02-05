package com.xingyun.singlearchitecturespringbootshoppingsample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/5 9:31
 */
@EnableSwagger2
@Configuration
public class SpringFoxSwaggerConfig {

	@Bean
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Swagger Restful API")
				.description("this is swagger restful api")
				.termsOfServiceUrl("https://xingyun.blog.csdn.net")
				.contact(new Contact("星云","https://xingyun.blog.csdn.net/column/info/33374","fairy_xingyun@hotmail.com"))
				.version("1.0")
				.build();
	}

	@Bean
	public Docket createRestApi(ApiInfo apiInfo) {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo)
				.groupName("SwaggerGroupOneAPI")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.xingyun.singlearchitecturespringbootshoppingsample.controller.api"))
				.paths(PathSelectors.any())
				.build();
	}
}
