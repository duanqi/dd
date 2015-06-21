package com.dd.myapp.modules.base.service;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class UserSchoolRegisterServiceTest {

	@Resource
	private UserSchoolRegisterService userSchoolRegisterService;

	@Test
	public void test1() {
		System.out.println("----"+ userSchoolRegisterService.getRegisterCount(1l, 0));
	}
}