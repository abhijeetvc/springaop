package com.springaopdemo.springaop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoAop {

//    @After(" execution(* com.springaopdemo.springaop.impl.DemoImpl.doSomething())")
//    public void aopImpl(){
//        System.out.println("Hiiiiiiiiiiii");
//    }

    @Before(" execution(* com.springaopdemo.springaop.impl.DemoImpl.doSomething())")
    public void aopImpl(){
        System.out.println("Hiiiiiiiiiiii");
    }

    @AfterReturning(pointcut = " execution(* com.springaopdemo.springaop.impl.DemoImpl.doSomething())",
    returning = "retValue")
    public void aopImpl1(Object retValue){
        System.out.println("Hiiiiiiiiiiii : "+retValue);
    }

}

//@After : Advice