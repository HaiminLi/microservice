package com.rain.cloud.common.entity.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("ProductDto")
public class ProductDto {

    @ApiModelProperty("商品id")
    private Integer productId;
    @ApiModelProperty("商品价格")
    private Integer price;
    @ApiModelProperty("商品名称")
    private String productName;
}