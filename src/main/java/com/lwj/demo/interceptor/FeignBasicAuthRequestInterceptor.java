package com.lwj.demo.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class FeignBasicAuthRequestInterceptor implements RequestInterceptor {

	/**
	 * apply里面的代码写自己的业务逻辑，可以将一些验证通过一定的手段加密放到header中进行传递
	 */
	@Override
	public void apply(RequestTemplate template) {
		template.header("name", "lwj");
	}

}
