package com.sufu.spring.ioc.service.impl;

import com.sufu.spring.ioc.service.UserService;
import com.sufu.spring.ioc.dao.UserDao;

/**
 * @author sufu
 * @date 2020/7/28
 */
public class UserServiceImpl implements UserService {
    // 这种方式是程序主动new对象，控制权在程序上
    // private UserDao userDao = new UserDaoImpl();

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
