/*
 * Copyright (c) 2004-2015 by UCweb All rights reserved
 */
package com.dd.myapp.modules.base.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dd.myapp.common.utils.PagerUtils;
import com.dd.myapp.modules.base.dao.UserMapper;
import com.dd.myapp.modules.base.entity.User;

/**
 * 用户相关信息
 * 
 * @author duanqi25@gmail.com
 * @createDate 2015年6月20日
 * 
 */
@Service("userService")
public class UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> getUserList(User user, Integer page, Integer count) {
        if (null == user)
            return null;
        return this.userMapper.selects(user, PagerUtils.getPager(page, count));
    }
}
