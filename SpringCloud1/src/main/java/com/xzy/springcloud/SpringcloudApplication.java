package com.xzy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Cloud 入口类
 * 注意：入口类只可以存在于其他类的父级package或者子级package中。如果入口类和其他类在同级package中，则该其他类无效
 */
@SpringBootApplication
public class SpringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudApplication.class, args);
	}
}
