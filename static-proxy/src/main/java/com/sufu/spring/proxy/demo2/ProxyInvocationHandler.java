package com.sufu.spring.proxy.demo2;

import com.sufu.spring.proxy.demo1.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用这个类自动生成一个 代理类
 * @author sufu
 * @date 2020/7/29
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    /**
     * 得到代理对象
     * @author sufu
     * @date 2020/7/29 17:20
     * @return java.lang.Object
     **/
    public Object getProxy(){
        // 这里的 rent.getClass().getInterfaces() 的rent不是接口对象，而是一个接口的实现类的对象，这个方法是得到这个类实现的接口
        // 第二个参数穿进去的是要代理的类所实现的接口，也就是代理中的抽象角色，实际上也可以传一个 Class[] c = {Rent.class} 的 c 对象
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    /**
     * 处理代理类实例，并且返回结果，在这里增加操作。
     * @author sufu
     * @date 2020/7/29 17:15
     * @param proxy 代理类
     * @param method 代理的方法
     * @param args 代理的方法的参数
     * @return java.lang.Object
     **/
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 其他操作
        System.out.println("执行了 "+method.getName()+" 方法");
        // 这里才是执行代理类中要执行的方法，也就是在Client中调用的代理类的方法，参数是指定的参数
        return method.invoke(rent, args);
    }
}
