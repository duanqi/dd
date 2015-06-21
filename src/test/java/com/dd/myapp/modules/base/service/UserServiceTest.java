package com.dd.myapp.modules.base.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dd.myapp.modules.base.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void test1() {
        User user = new User();
        user.setType(1);
        System.out.println("----" + userService.getUserList(user, 0, 3));
    }
}