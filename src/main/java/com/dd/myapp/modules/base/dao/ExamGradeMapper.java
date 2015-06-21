package com.dd.myapp.modules.base.dao;

import com.dd.myapp.modules.base.entity.ExamGrade;

public interface ExamGradeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ExamGrade record);

    int insertSelective(ExamGrade record);

    ExamGrade selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ExamGrade record);

    int updateByPrimaryKey(ExamGrade record);
}