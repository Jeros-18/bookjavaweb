package com.jh.test;

import com.jh.dao.UserDao;
import com.jh.dao.impl.UserDaoImpl;
import com.jh.pojo.User;
import org.junit.Test;

public class UserDaomplTest {

    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername() {
        if(userDao.queryUserByUsername("jiahui")==null){
            System.out.println("用户名可用");
        }else{
            System.out.println("用户名不可用");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        if(userDao.queryUserByUsernameAndPassword("admin","admin")==null){
            System.out.println("用户名或密码错误，登录失败");
        }else {
            System.out.println("潮汛 成功");
        }
    }

    @Test
    public void saveUser() {
        System.out.println(userDao.saveUser(new User(null,"hg168","123456","jh168@qq.com")));
    }
}