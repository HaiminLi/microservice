package com.rain.cloud.order.service;

import com.rain.cloud.common.entity.product.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("rain-product-service")
public interface IProductService {

    @GetMapping("/product/creatProduct")
    String creatProduct(ProductDto productDto);
}
