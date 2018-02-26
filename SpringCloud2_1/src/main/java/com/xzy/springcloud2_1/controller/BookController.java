package com.xzy.springcloud2_1.controller;

import com.xzy.springcloud2_1.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringCloud2_1
 * @package 包名：com.xzy.springcloud2_1.controller
 * @data 创建时间：2018-2-24 17:22
 * @description 描述：book控制器使用@Autowired来接收book对象
 */
@RestController
public class BookController {
    @Autowired
    private Book book;

    @RequestMapping(value = "/book")
    public String book(){
        return "书名:"+book.getName()+"作者:"+book.getAuthor()+"价格:"+book.getPrice();
    }
}
