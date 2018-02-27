package com.xzy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}
}
