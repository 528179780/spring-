package com.sufu.spring.ioc.dao.impl;

import com.sufu.spring.ioc.dao.UserDao;

/**
 * 这是新增的一个实现类，传统编码方式如果要修改测试类中dao的实现，必须修改测试代码中的new出来的对象
 * 传统方式耦合性较大，不适合版本迭代等等。
 * @author sufu
 * @date 2020/7/28
 */
public class UserDaoMySqlImpl implements UserDao {
    public void getUser() {
        System.out.println("通过 mysql 接口实现类获取用户");
    }
}
