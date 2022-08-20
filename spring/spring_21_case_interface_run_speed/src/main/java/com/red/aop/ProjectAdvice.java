package com.red.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    /**
     * 匹配业务层的所有方法
     */
    @Pointcut("execution(* com.red.service.*Service.*(..))")
    private void servicePt() {
    }

    @Around("servicePt()")
    public void runSpeed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Signature signature = proceedingJoinPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        
        long beforeTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            proceedingJoinPoint.proceed();
        }
        long afterTime = System.currentTimeMillis();
        long time = afterTime - beforeTime;
        System.out.println("万次执行" + className + "." + methodName + "方法耗时" + time + "ms");
    }
}
