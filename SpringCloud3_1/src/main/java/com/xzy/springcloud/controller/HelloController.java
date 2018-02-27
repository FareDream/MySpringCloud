package com.xzy.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringCloud3_1
 * @package 包名：com.xzy.springcloud.controller
 * @data 创建时间：2018-2-26 15:39
 * @description 描述：
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/")
    public String hello(){
        return "Hello World!";
    }
}
