package com.lwj.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwj.demo.feign.BasicAuthFeignService;
import com.lwj.demo.feign.FeignConfigService;
import com.lwj.demo.feign.FeignService;

/**
 * 通过feign去调用各个服务
 * @author linwenjie
 *
 */
@RestController
@RequestMapping("/feign/ribbon")
public class FeignRibbonController {

	@Autowired
	private FeignService feignService;
	
	@Autowired
	private FeignConfigService feignConfigService;
	
	@Autowired
	private BasicAuthFeignService basicAuthFeignService;
	
	/**
	 * 测试普通接口调用，重试等
	 * @return
	 */
	@GetMapping("/testFeignRibbon")
	public String testFeignRibbon() {
		return feignService.testRetry();
	}
	
	/**
	 * 测试普通接口调用，重试等
	 * @return
	 */
	@GetMapping("/testFeignRibbonConfig")
	public String testFeignRibbonConfig() {
		return feignConfigService.testRetry();
	}
	
	/**
	 * 测试basic认证
	 * @return
	 */
	@GetMapping("/testBasicAuth")
	public boolean testBasicAuth() {
		return basicAuthFeignService.testBasicAuth();
	}
	
	
	
}
