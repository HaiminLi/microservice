package com.rain.cloud.product.controller;

import com.rain.cloud.common.entity.order.dto.OrderDto;
import com.rain.cloud.common.entity.product.dto.ProductDto;
import com.rain.cloud.product.service.IProductService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
@RefreshScope
@SuppressWarnings("All")
@Slf4j
public class ProductController {

    @Autowired
    private IProductService productService;

    @ApiOperation(value="创建", response = ProductDto.class)
    @ApiImplicitParam(name = "productDto", required = false, dataType = "ProductDto", value = "商品")
    @ApiResponse(code = 1, message = "返回类型", response = ProductDto.class)
    @PostMapping("/creatProduct")
    public String creatProduct(@RequestBody @Valid ProductDto productDto) {
        ThreadLocal<OrderDto> threadLocal = new ThreadLocal<>();
        productService.creatProduct(productDto);
        return "1";
    }
}
