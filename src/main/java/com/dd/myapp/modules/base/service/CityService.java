/*
 * Copyright (c) 2004-2015 by UCweb All rights reserved
 */
package com.dd.myapp.modules.base.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dd.myapp.modules.base.dao.CityMapper;
import com.dd.myapp.modules.base.entity.City;

/**
 * @description
 * @author <a href="mailto:duanqi@ucweb.com">DUAN QI</a>
 * @since 2015年6月16日
 * @version 1.0.0
 */
@Service("cityService")
public class CityService {

	@Resource
	private CityMapper cityMapper;

	public City getCityById(Long id) {
		return this.cityMapper.selectByPrimaryKey(id);
	}
}
