package com.lwj.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lwj.demo.interceptor.FeignBasicAuthRequestInterceptor;

import feign.Logger;

/**
 * Feign的一些相关配置
 * @author linwenjie
 *
 */
@Configuration
public class FeignConfiguration {

	/**
	 * 定义feign输出日志
	 * @return
	 */
	@Bean
	Logger.Level feignLoggerLevel(){
		return Logger.Level.FULL;
	}
	
	@Bean
	public FeignBasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		return new FeignBasicAuthRequestInterceptor();
	}
	
}
