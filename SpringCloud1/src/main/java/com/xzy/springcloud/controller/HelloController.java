package com.xzy.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：SpringCloud1
 * 包名：com.xzy.springcloud.controller
 * 作者：X-Z-Y
 * 时间：2018-2-24  22:41
 * 描述：控制器s
 */
@RestController
public class HelloController {
    /**
     * 设置访问url
     * @return
     */
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello World!";
    }
}
