package com.sufu.spring.proxy.demo1;

/**
 * 客户要租房子
 * @author sufu
 * @date 2020/7/29
 */
public class Client {
    public static void main(String[] args) {
        // 直接找房东租房子,这种方式就只能租房子，不能干其他的
        Host h = new Host();
//        h.rent();

        // 代理的方式获取Host,这样执行业务逻辑，可以加一些自己想要的操作
        Proxy proxy = new Proxy(h);
        proxy.rent();
    }
}
