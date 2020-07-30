package com.sufu.spring.ioc.dao.impl;

import com.sufu.spring.ioc.dao.UserDao;

/**
 * @author sufu
 * @date 2020/7/28
 */
public class UserDaoImpl implements UserDao {
    public void getUser() {
        System.out.println("获取用户");
    }
}
