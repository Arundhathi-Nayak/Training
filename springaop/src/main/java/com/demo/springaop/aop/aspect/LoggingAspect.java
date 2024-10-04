package com.demo.springaop.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.demo.springaop.aop.repository.BankRepository.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Executing before method: "+joinPoint.getSignature().getName());
    }

    @After("execution(* com.demo.springaop.aop.service.*.*(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("Executing after method: "+joinPoint.getSignature().getName());
    }

}
