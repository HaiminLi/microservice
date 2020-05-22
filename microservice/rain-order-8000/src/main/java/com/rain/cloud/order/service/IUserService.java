package com.rain.cloud.order.service;

import com.rain.cloud.common.entity.user.dto.UserInfoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("rain-user-service")
public interface IUserService {

    @PostMapping("/user/creatUser")
    String creatUser(UserInfoDto userInfoDto);
}
