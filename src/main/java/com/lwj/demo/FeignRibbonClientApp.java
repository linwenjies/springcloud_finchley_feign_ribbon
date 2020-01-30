package com.lwj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 各个服务实例
 * @author linwenjie
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//开启feign客户端调用
@EnableHystrix
@EnableHystrixDashboard//开启断路监控面板
public class FeignRibbonClientApp 
{
    public static void main( String[] args ){
        SpringApplication.run(FeignRibbonClientApp.class, args);
    }
}
