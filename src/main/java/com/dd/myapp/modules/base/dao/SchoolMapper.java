package com.dd.myapp.modules.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dd.myapp.modules.base.entity.School;

public interface SchoolMapper {
    int deleteByPrimaryKey(Long id);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);

    List<School> findSchools(@Param(value = "offset") Integer offset, @Param(value = "count") Integer count);
}