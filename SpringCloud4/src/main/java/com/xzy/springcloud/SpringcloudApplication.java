package com.xzy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer通过注解启动一个服务注册中心提供给其他应用进行对话
 * 默认情况下该服务注册中心会将自己作为客户端来尝试注册自己，所以我们需要禁用它的客户端注册行为
 * 需要在application.properties中添加配置
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringcloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}
}
