package com.sufu.spring.proxy.demo2;

import com.sufu.spring.proxy.demo1.Host;
import com.sufu.spring.proxy.demo1.Rent;

/**
 * @author sufu
 * @date 2020/7/29
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色，无论如何都是需要，只是横向扩展不需要修改而已
        Host host= new Host();
        // 创建代理角色生成器
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        // 指定要生成的代理类代理的接口
        proxyInvocationHandler.setRent(host);
        // 得到代理角色，这个代理类是动态生成的，这里的rent实际上是一个代理类
        Rent rentProxy = (Rent) proxyInvocationHandler.getProxy();
        // 通过执行类代理执行方法
        rentProxy.rent();

    }
}
