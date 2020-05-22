package com.rain.cloud.common.entity.order.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("OrderDto")
public class OrderDto {

    @ApiModelProperty("订单id")
    private Integer orderId;
    @ApiModelProperty("价格")
    private Integer price;
    @ApiModelProperty("商品id")
    private Integer productId;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("商品名称")
    private String productName;
}