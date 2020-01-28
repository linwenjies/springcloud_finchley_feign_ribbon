package com.lwj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 各个服务实例
 * @author linwenjie
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//开启feign客户端调用
public class FeignRibbonClientApp 
{
    public static void main( String[] args ){
        SpringApplication.run(FeignRibbonClientApp.class, args);
    }
}
