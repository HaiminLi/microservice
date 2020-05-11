package com.rain.cloud.order.controller;


import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class OrderController {

    @Value("${user.names}")
    private String userName;
    @Value("${user.age}")
    private int age;

    @ApiOperation(value="获取订单详情", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "orderId", required = false, dataType = "String", paramType = "query", value = "订单id")
    })
    @GetMapping("/get")
    public String get(@RequestParam("orderId") String orderId) {
        return userName + "###" + age + orderId;
    }
}
