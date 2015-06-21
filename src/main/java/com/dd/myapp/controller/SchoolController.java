package com.dd.myapp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dd.myapp.modules.base.dto.SchoolList;
import com.dd.myapp.modules.base.entity.School;
import com.dd.myapp.modules.base.service.SchoolService;

/**
 * 驾校相关操作
 * 
 * @author duanqi25@gmail.com
 * @createDate 2015年6月17日
 * 
 */
@Controller
public class SchoolController {

    Logger logger = Logger.getLogger(SchoolController.class);

    @Resource
    private SchoolService schoolService;

    /**
     * 获取驾校列表
     * 
     * @param page
     * @param count
     */
    @RequestMapping(value = "/slist", method = RequestMethod.GET)
    public @ResponseBody List<SchoolList> getSchoolsList(Integer page, Integer count) {
        return schoolService.getSchoolsList(page, count);
    }

    /**
     * 通过ID找到驾校详情信息
     * 
     * @param id
     */
    @RequestMapping(value = "/sdetail", method = RequestMethod.GET)
    public @ResponseBody School getDetailById(Long id) {
        School school = schoolService.getById(id);
        return school;
    }

}
