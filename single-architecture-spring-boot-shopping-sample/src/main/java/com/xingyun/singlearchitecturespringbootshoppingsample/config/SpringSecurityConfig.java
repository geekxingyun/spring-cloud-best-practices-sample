package com.xingyun.singlearchitecturespringbootshoppingsample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2020/2/4 17:15
 */
@EnableWebSecurity
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean
	public static PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**
	 * 这个方法定义了哪些URL需要被保护那些URL不需要被保护
	 *
	 * @param http
	 * @throws Exception
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				//config allow include frame page
				.headers().frameOptions().sameOrigin()
				.and()
				.authorizeRequests()
				// swagger access
				.antMatchers("/swagger-ui.html", "/api/v1/**").hasRole("swagger-access-role")
				//db access
				.antMatchers("/h2-console").hasRole("h2-db-access-role")
				// 如果是 / 和/home 请求不进行拦截
				.antMatchers("/", "/home", "/index", "/home.do", "/index.do").permitAll()
				.anyRequest().hasRole("app-role")
				.and()
				//构建一个基本的表单登录后台处理方法
				.formLogin()
				//可以配置使用Spring Security内置的登录页面,但是样式需要外网环境,否则样式会乱码
				.loginProcessingUrl("/login")
				//第一次如果拦截到非法请求,默认重定向到 /login 请求去处理
				//form 表单action配置也提交到这个地址去进行验证是否权限通过,验证过程由Spring Security框架完成
				//.loginPage("/login")
				//不拦截
				.permitAll()
				.and()
				//注销不拦截
				.logout()
				//注销成功后返回首页
				.logoutSuccessUrl("/")
				//清除认证
				.clearAuthentication(true)
				//不拦截
				.permitAll()
				.and()
				.csrf().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//使用密码类型
		auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails userDetailsDev =
				User.builder()
						//账号
						.username("admin")
						//密码 123456
						.password("$2a$10$0BVXV/xzovbD1rKpC.rwnuMCysuvH0llt3y2RLJkgG.9TTZJNPwIa")
						//角色
						.roles("app-role", "swagger-access-role", "h2-db-access-role")
						//账户是否过期
						.accountExpired(false)
						//是否锁定账户
						.accountLocked(false)
						//是否禁用该用户
						.disabled(false)
						//登录凭据已过期
						.credentialsExpired(false)
						.build();
		//内存中保存登录信息
		return new InMemoryUserDetailsManager(userDetailsDev);
	}
}
