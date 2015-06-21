package com.dd.myapp.modules.base.dao;

import org.apache.ibatis.annotations.Param;

import com.dd.myapp.modules.base.entity.UserSchoolRegister;

public interface UserSchoolRegisterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserSchoolRegister record);

    int insertSelective(UserSchoolRegister record);

    UserSchoolRegister selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserSchoolRegister record);

    int updateByPrimaryKey(UserSchoolRegister record);

    int getRegisterCount(@Param(value = "id") Long id, @Param(value = "type") Integer type);
}