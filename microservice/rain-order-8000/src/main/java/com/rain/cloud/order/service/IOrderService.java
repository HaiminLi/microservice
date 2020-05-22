package com.rain.cloud.order.service;

import com.rain.cloud.common.entity.order.dto.OrderDto;

public interface IOrderService {

    int creatOrder(OrderDto orderDto);
}
