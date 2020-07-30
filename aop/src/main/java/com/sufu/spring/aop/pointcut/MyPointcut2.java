package com.sufu.spring.aop.pointcut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 使用注解的方式实现AOP @Aspect注解标注这个类是一个切面
 * @author sufu
 * @date 2020/7/30
 */
@Aspect
public class MyPointcut2 {
    @Before("execution(* com.sufu.spring.aop.service.impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=======方法执行前==========");
    }
    @After("execution(* com.sufu.spring.aop.service.impl.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=======方法执行后==========");
    }
    @Around("execution(* com.sufu.spring.aop.service.impl.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint p) throws Throwable {

        System.out.println("===环绕====方法执行前==========");
        Object proceed = p.proceed();
        System.out.println("===环绕====方法执行后==========");
        System.out.println(p.getSignature());
    }
}
