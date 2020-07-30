package com.sufu.spring.aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 测试日志类
 * @author sufu
 * @date 2020/7/30
 */
public class Log implements MethodBeforeAdvice {
    /**
     * 前置增强，因为这个是执行前织入，所以不能获得返回值，返回值也还不能用。
     * @author sufu
     * @date 2020/7/30 9:20
     * @param method 要执行的方法
     * @param objects 要执行的方法参数
     * @param o 目标对象
     **/
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+" 类执行了 "+method.getName()+"方法");
    }
}
