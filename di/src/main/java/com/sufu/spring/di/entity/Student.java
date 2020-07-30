package com.sufu.spring.di.entity;

import java.util.*;

/**
 * 学生实体类,不用写无参构造方法，有默认的。本实例通过xml注入该类
 * @author sufu
 * @date 2020/7/28
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private Properties info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", books=" + Arrays.toString(books) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", info=" + info +
                '}';
    }
}
