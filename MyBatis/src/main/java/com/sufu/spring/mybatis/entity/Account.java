package com.sufu.spring.mybatis.entity;

import lombok.Data;

/**
 * @author sufu
 * @date 2020/7/30
 */
@Data
public class Account {
    private int id;
    private String name;
    private String sex;
    private int age;
    private double balance;

    public Account(int id, String name, String sex, int age, double balance) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.balance = balance;
    }

    public Account(String name, String sex, int age, double balance) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.balance = balance;
    }
}
