package com.dd.myapp.modules.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dd.myapp.common.utils.PagerUtils.Pager;
import com.dd.myapp.modules.base.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selects(@Param(value = "user") User user, @Param(value = "pager") Pager pager);
}