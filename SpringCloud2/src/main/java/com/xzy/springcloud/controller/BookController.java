package com.xzy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：SpringCloud2
 * 包名：com.xzy.springcloud.controller
 * 作者：X-Z-Y
 * 时间：2018-2-24  23:29
 * 描述：可以直接使用@Value注解来从配置文件中解析属性内容
 */
@RestController
public class BookController {
    @Value("${book.name}")
    private String name;
    @Value("${book.price}")
    private String price;

    @RequestMapping(value = "/book")
    public String book(){
        return "BookName:" + name + "BookPrice:" + price;
    }

}
