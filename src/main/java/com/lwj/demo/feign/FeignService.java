package com.lwj.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lwj.demo.configuration.FeignConfiguration;

/**
 * feign调用
 * 其实正规的feign调用应该是每个服务提供方自己提供一个jar包，里面封装了各个接口的feign调用模式，上层哪个服务引用就自己引用jar即可
 * @author linwenjie
 *
 */
@FeignClient(value = "eureka-client", configuration = FeignConfiguration.class)
public interface FeignService {

	/**
	 * 下面是一个简单的调用，具体的接口的入参协议，返回值协议，可以自定义设置consumes与produces
	 * @return
	 */
	@GetMapping(value = "/ribbonTest/testRetry")
	public String testRetry();
	
}
