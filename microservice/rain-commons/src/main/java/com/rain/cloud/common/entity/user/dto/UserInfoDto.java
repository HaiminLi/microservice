package com.rain.cloud.common.entity.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("UserInfoDto")
public class UserInfoDto {

    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("用户余额")
    private Integer total;
    @ApiModelProperty("用户姓名")
    private String userName;
}