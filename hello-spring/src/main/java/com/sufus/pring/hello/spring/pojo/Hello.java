package com.sufus.pring.hello.spring.pojo;

/**
 * 一个pojo示例
 * @author sufu
 * @date 2020/7/28
 */
public class Hello {
    private  String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Hello() {
    }

    public Hello(String string) {
        this.string = string;
    }
}
