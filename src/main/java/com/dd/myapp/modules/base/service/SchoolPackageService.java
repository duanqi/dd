/*
 * Copyright (c) 2004-2015 by UCweb All rights reserved
 */
package com.dd.myapp.modules.base.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.ListUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.dd.myapp.modules.base.dao.SchoolPackageMapper;
import com.dd.myapp.modules.base.entity.SchoolPackage;

/**
 * 驾校套餐相关信息
 * 
 * @author duanqi25@gmail.com
 * @createDate 2015年6月19日
 * 
 */
@Service("schoolPackageService")
public class SchoolPackageService {

    @Resource
    private SchoolPackageMapper schoolPackageMapper;

    /**
     * 通过驾校ID获取对应的套餐信息
     * 
     * @param schoolId
     * @return
     */
    public List<SchoolPackage> getListsBySchoolId(Long schoolId) {
        List<SchoolPackage> result = ListUtils.EMPTY_LIST;
        if (null != schoolId) {
            result = new ArrayList<SchoolPackage>();
            result = schoolPackageMapper.getListsBySchoolId(schoolId);
        }
        return result;
    }

    /**
     * 获取驾校套餐中最低价格
     * 
     * @param schoolId
     * @return
     */
    public Double getMinValue(Long schoolId) {
        Double result = 0d;
        if (null != schoolId) {
            List<SchoolPackage> schoolPackages = getListsBySchoolId(schoolId);
            if (!CollectionUtils.isEmpty(schoolPackages)) {
                for (SchoolPackage schoolPackage : schoolPackages) {
                    if (result.compareTo(schoolPackage.getPrice()) < 0) {
                        result = schoolPackage.getPrice();
                    }
                }
            }
        }
        return result;
    }
}
