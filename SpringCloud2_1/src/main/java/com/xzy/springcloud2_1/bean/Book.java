package com.xzy.springcloud2_1.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author 项目作者：XuZiyu
 * @project 项目名称：SpringCloud2_1
 * @package 包名：com.xzy.springcloud2_1.bean
 * @data 创建时间：2018-2-24 17:22
 * @description 描述：图书beanescription 描述
 * PS:新版本的ConfigurationProperties中取消了location的用法
 */
@Component
@ConfigurationProperties(prefix = "book")
@PropertySource("classpath:book.properties")
public class Book {
    private String name;
    private String author;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
