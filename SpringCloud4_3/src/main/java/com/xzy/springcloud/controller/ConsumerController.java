package com.xzy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringCloud4_3
 * @package 包名：com.xzy.springcloud.controller
 * @data 创建时间：2018-2-27 16:02
 * @description 描述：创建RestTemple来实现对HELLO-SERVER服务提供的/hello接口进行调用
 */
@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConstumer(){
        return restTemplate.getForEntity("http://HELLO-SERVER/hello",String.class).getBody();
    }
}
