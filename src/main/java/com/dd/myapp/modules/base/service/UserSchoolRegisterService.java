/*
 * Copyright (c) 2004-2015 by UCweb All rights reserved
 */
package com.dd.myapp.modules.base.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.ListUtils;
import org.springframework.stereotype.Service;

import com.dd.myapp.modules.base.dao.UserSchoolRegisterMapper;
import com.dd.myapp.modules.base.entity.User;

/**
 * 用户关联驾校信息
 * 
 * @author duanqi25@gmail.com
 * @createDate 2015年6月19日
 * 
 */
@Service("userSchoolRegisterService")
public class UserSchoolRegisterService {

    @Resource
    private UserSchoolRegisterMapper userSchoolRegisterMapper;

    @Resource
    private UserService userService;

    /**
     * 根据类型查找关联某个驾校的人数
     * 
     * @param schoolId 驾校ID
     * @param type 用户类型（0：学员；1：教练）
     * @return
     */
    public Integer getRegisterCount(Long schoolId, Integer type) {
        Integer result = 0;
        if (null != schoolId && null != type) {
            result = this.userSchoolRegisterMapper.getRegisterCount(schoolId, type);
        }
        return result;
    }

    /**
     * 根据类型查找关联某个驾校的人员信息
     * 
     * @param type
     * @return
     */
    public List<User> getUserLists(Integer type, Integer page, Integer count) {
        List<User> result = ListUtils.EMPTY_LIST;
        if (null != type) {
            User user = new User();
            user.setType(type);
            result = userService.getUserList(user, page, count);
        }
        return result;
    }

}
