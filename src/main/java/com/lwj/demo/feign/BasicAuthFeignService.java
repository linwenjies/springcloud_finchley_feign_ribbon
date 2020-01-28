package com.lwj.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lwj.demo.configuration.FeignConfiguration;

/**
 * 测试feign的basic的验证方式，此种验证方式安全系数不高
 * @author linwenjie
 *
 */
@FeignClient(value = "eureka-client", configuration = FeignConfiguration.class)
public interface BasicAuthFeignService {

	@GetMapping("/basicAuth/testBasicAuth")
	public boolean testBasicAuth();
	
}
