package com.jawa.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    @Pointcut("execution(* com.jawa.springaop.dao.*.*(..))")
    public void poinCutAll() {}

    @Before("execution(public void addAccount())")
    public void beforeAspectTest() {
        System.out.println("Executing the before advice for the dao call");
    }

    @Before("poinCutAll()")
    public void beforeIntTest() {
        System.out.println("Executing the before advice for all method in package");
    }
}
