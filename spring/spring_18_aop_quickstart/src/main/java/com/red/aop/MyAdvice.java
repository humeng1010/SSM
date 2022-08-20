package com.red.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.red.dao.BookDao.update())")
    private void pointCut(){}

    @Before("pointCut()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
    @Around("pointCut()")
    public Object method2(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before");
        Object proceed = joinPoint.proceed();
        System.out.println("after");
        return proceed;
    }
}
