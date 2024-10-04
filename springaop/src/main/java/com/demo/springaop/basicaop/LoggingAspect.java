package com.demo.springaop.basicaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.demo.springaop.basicaop.UserService.*(..))")
    public void logBefore() {
        System.out.println("Executing before method");
    }
    @After("execution(* com.demo.springaop.basicaop.UserService.*(..))")
    public void logAfter() {
        System.out.println("Executing after method");
    }

}
