package com.sufu.spring.ioc.entity;

/**
 * user实体类
 * @author sufu
 * @date 2020/7/28
 */
public class User {
    private String name;
    private int age;

    public User() {
        System.out.println("user的无参构造");
    }

    public User(String name, int age) {
        System.out.println("user的全参构造");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void showInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
