package com.dd.myapp.modules.base.dao;

import java.util.List;

import com.dd.myapp.modules.base.entity.SchoolPackage;

public interface SchoolPackageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SchoolPackage record);

    int insertSelective(SchoolPackage record);

    SchoolPackage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SchoolPackage record);

    int updateByPrimaryKey(SchoolPackage record);

    List<SchoolPackage> getListsBySchoolId(Long id);
}