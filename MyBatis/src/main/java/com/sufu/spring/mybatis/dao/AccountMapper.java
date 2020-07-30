package com.sufu.spring.mybatis.dao;

import com.sufu.spring.mybatis.entity.Account;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @author sufu
 * @date 2020/7/30
 */
public interface AccountMapper {
    /**
     * 查询所有账户
     * @author sufu
     * @date 2020/7/30 11:35
     * @return java.util.List<com.sufu.spring.mybatis.entity.Account>
     **/
    List<Account> selectAll();
    /**
     * 添加一个用户
     * @author sufu
     * @date 2020/7/30 14:15
     * @param a 要添加的用户
     * @return int 受影响的行数，判断是否添加成功
     **/
    int insertAccount(Account a);
    /**
     * 删除指定id的用户
     * @author sufu
     * @date 2020/7/30 14:21
     * @param id 要删除的用户的id
     * @return int 受影响的行数，判断是否删除成功。
     **/
    int deleteAccount(int id);
    /**
     * 根据姓名查询
     * @author sufu
     * @date 2020/7/30 14:43
     * @param name 要查询的用户的名字
     * @return com.sufu.spring.mybatis.entity.Account
     **/
    Account selectOneByName(String name);

}
