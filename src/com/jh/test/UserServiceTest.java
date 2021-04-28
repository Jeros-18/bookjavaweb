package com.jh.test;

import com.jh.pojo.User;
import com.jh.service.UserService;
import com.jh.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {

   UserService userService =  new UserServiceImpl();

    @Test
    public void registUser() {
        userService.registUser(new User(null,"bbj168","666666","bbj168@qq.com"));
        userService.registUser(new User(null,"abc168","666666","abc168@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User(null,"wzg168","123456","wzg168@qq.com")));
    }

    @Test
    public void existsUsername() {
        if(userService.existsUsername("wzg1168")){
            System.out.println("用户名已存在");
        }else{
            System.out.println("用户名可用");
        }
    }
}