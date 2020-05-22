package com.rain.cloud.order.service.impl;

import com.rain.cloud.common.entity.order.dto.OrderDto;
import com.rain.cloud.common.entity.product.dto.ProductDto;
import com.rain.cloud.common.entity.user.dto.UserInfoDto;
import com.rain.cloud.order.dao.IOrderDao;
import com.rain.cloud.order.service.IOrderService;
import com.rain.cloud.order.service.IProductService;
import com.rain.cloud.order.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("All")
@Slf4j
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderDao orderDao;

    @Autowired
    private IProductService productService;
    @Autowired
    private IUserService userService;

    @Override
    public int creatOrder(OrderDto orderDto) {
        ProductDto productDto = new ProductDto();
        productDto.setPrice(25426);
        productDto.setProductName(orderDto.getProductName());
        productService.creatProduct(productDto);
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setTotal(10000000);
        userInfoDto.setUserName("tom李");
        userService.creatUser(userInfoDto);
        return orderDao.insertSelective(orderDto);
    }
}
