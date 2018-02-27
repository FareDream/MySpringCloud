package com.xzy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringCloud4_1
 * @package 包名：com.xzy.springcloud.controller
 * @data 创建时间：2018-2-27 11:33
 * @description 描述：
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(String.valueOf(getClass()));
    /**
     * client：从注册中心获取服务相关信息
     */
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host"+instance.getHost()+",service_id"+instance.getServiceId());
        return "Hello World!";
    }
}
