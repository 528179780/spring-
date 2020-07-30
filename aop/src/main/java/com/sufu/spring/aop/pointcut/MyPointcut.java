package com.sufu.spring.aop.pointcut;

/**
 * 自定义切面类
 * @author sufu
 * @date 2020/7/30
 */
public class MyPointcut {
    public void before(){
        System.out.println("================方法执行前==================");
    }
    public void after(){
        System.out.println("================方法执行后==================");
    }
}
