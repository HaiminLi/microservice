package com.rain.cloud.product.service.impl;

import com.rain.cloud.common.entity.product.dto.ProductDto;
import com.rain.cloud.product.dao.IProductInfoDao;
import com.rain.cloud.product.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("All")
@Slf4j
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductInfoDao productInfoDao;
    @Override
    public int creatProduct(ProductDto productDto) {
        return productInfoDao.insertSelective(productDto);
    }
}
