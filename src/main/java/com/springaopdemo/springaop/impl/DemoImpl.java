package com.springaopdemo.springaop.impl;

import com.springaopdemo.springaop.interfaces.DemoInterface;
import org.springframework.stereotype.Service;

@Service
public class DemoImpl implements DemoInterface {

    @Override
    public String doSomething() {
        System.out.println("Hellooooooooooo");
        return "Hello Spring AOP";
    }
}
