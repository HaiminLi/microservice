package com.rain.cloud.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class OrderController {

    @Value("${user.names}")
    private String userName;
    @Value("${user.age}")
    private int age;

    @RequestMapping("/get")
    public String get() {
        return userName + "###" + age;
    }
}
