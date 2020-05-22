package com.rain.cloud.user.service.impl;

import com.rain.cloud.common.entity.user.dto.UserInfoDto;
import com.rain.cloud.user.dao.IUserDao;
import com.rain.cloud.user.dao.IUserInfoDao;
import com.rain.cloud.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings(("All"))
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public int creatUser(UserInfoDto userInfoDto) {
        return userInfoDao.insertSelective(userInfoDto);
    }
}
