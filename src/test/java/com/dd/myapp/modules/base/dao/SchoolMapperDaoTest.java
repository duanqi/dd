package com.dd.myapp.modules.base.dao;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dd.myapp.modules.base.entity.School;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class SchoolMapperDaoTest {

    @Resource
    private SchoolMapper schoolMapper;

//    @Test
    public void testAdd() {
        School school = new School();
        school.setAddress("湖北武汉");
        school.setBanner("http://www.baidu.com");
        school.setCityId(1l);
        school.setFeatures("ddddd");
        school.setIsPrivateTrain(true);
        school.setName("test");
        school.setDeleted(true);
        int id = schoolMapper.insert(school);
        System.out.println("--------id:" + id);
    }
    
    @Test
    public void testModify(){
        School school = schoolMapper.selectByPrimaryKey(1l);
        school.setModifyTime(new Date());
        schoolMapper.updateByPrimaryKey(school);
    }
}