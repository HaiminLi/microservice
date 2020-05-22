package com.rain.cloud.user.controller;

import com.rain.cloud.common.entity.order.dto.OrderDto;
import com.rain.cloud.common.entity.product.dto.ProductDto;
import com.rain.cloud.common.entity.user.dto.UserInfoDto;
import com.rain.cloud.user.service.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@RefreshScope
@SuppressWarnings("All")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value="创建", response = UserInfoDto.class)
    @ApiImplicitParam(name = "userInfoDto", required = false, dataType = "UserInfoDto", value = "用户")
    @ApiResponse(code = 1, message = "返回类型", response = UserInfoDto.class)
    @PostMapping("/creatUser")
    public String creatUser(@RequestBody @Valid UserInfoDto userInfoDto) {
        userService.creatUser(userInfoDto);
        return "1";
    }
}
