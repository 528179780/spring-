package com.sufu.spring.proxy.demo1;

/**
 * 房东
 * @author sufu
 * @date 2020/7/29
 */
public class Host implements Rent{
    public void rent() {
        System.out.println("房东出租房子");
    }
}
