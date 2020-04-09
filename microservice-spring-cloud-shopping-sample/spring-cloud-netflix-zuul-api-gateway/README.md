## 1.1 Netflix Zuul as API Gateway


### 1.1.1 added dependency

added dependency
```xml
        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-zuul</artifactId>
		</dependency>
```
### 1.1.2 added @EnableZuulProxy

added @EnableZuulProxy on config class


## Reference
[https://spring.io/guides/gs/routing-and-filtering/](https://spring.io/guides/gs/routing-and-filtering/)