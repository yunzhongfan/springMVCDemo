package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix//开启Hystrix断路处理
@EnableHystrixDashboard
public class SericeFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(SericeFeignApplication.class, args);
	}
}
