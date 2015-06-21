/*
 * Copyright (c) 2004-2015 by UCweb All rights reserved
 */
package com.dd.myapp.modules.base.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dd.myapp.modules.base.dao.SchoolMapper;
import com.dd.myapp.modules.base.dto.SchoolList;
import com.dd.myapp.modules.base.entity.School;

/**
 * 
 * @author duanqi25@gmail.com
 * @createDate 2015年6月17日
 * 
 */
@Service("schoolService")
public class SchoolService {

    @Resource
    private SchoolMapper schoolMapper;
    
    @Resource
    private SchoolList schoolList;

    /**
     * 驾校列表信息
     * 
     * @param page
     * @param count
     * @return
     */
    public List<SchoolList> getSchoolsList(Integer page, Integer count) {
        List<School> schools = this.schoolMapper.findSchools(page, count);
        return schoolList.ofList(schools);
    }
    
    /**
     * 驾校详情信息
     * 
     * @param id
     * @return
     */
    public School getById(Long id) {
        return this.schoolMapper.selectByPrimaryKey(id);
    }
}
