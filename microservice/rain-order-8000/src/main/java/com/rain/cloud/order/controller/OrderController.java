package com.rain.cloud.order.controller;


import com.rain.cloud.common.entity.order.dto.OrderDto;
import com.rain.cloud.order.service.IOrderService;
import com.rain.cloud.order.service.IProductService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/order")
@RefreshScope
@SuppressWarnings("All")
@Slf4j
public class OrderController {

    @Value("${user.names}")
    private String userName;
    @Value("${user.age}")
    private int age;

    @Autowired
    private IProductService productService;
    @Autowired
    private IOrderService orderService;

    @ApiOperation(value="创建", response = OrderDto.class)
    @ApiImplicitParam(name = "orderDto", required = false, dataType = "OrderDto", value = "订单")
    @ApiResponse(code = 1, message = "返回类型", response = OrderDto.class)
    @PostMapping("/creatOrder")
    public String creatOrder(@RequestBody @Valid OrderDto orderDto) {
        ThreadLocal<OrderDto> threadLocal = new ThreadLocal<>();
        orderService.creatOrder(orderDto);
        return userName + "###" + age;
    }
}
