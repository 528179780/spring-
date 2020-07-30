package com.sufu.spring.di.entity;

/**
 * 地址类
 * @author sufu
 * @date 2020/7/28
 */
public class Address {
    String addr;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Address(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                '}';
    }
}
