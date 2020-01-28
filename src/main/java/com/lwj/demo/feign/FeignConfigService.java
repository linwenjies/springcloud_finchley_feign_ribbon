package com.lwj.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lwj.demo.configuration.FeignConfiguration;

/**
 * feign调用
 * 测试一些feign的自己的配置
 * @author linwenjie
 *
 */
@FeignClient(value = "eureka-client", configuration = FeignConfiguration.class)
public interface FeignConfigService {

	/**
	 * 下面是一个简单的调用，具体的接口的入参协议，返回值协议，可以自定义设置consumes与produces
	 * @return
	 */
	@GetMapping(value = "/ribbonTest/testRetry")
	public String testRetry();
	
}
