package org.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterfaceLifeCycle {

    public  static void main(String[] args){

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleinterfaceconfig.xml");
        context.registerShutdownHook();

        Tablet t = (Tablet) context.getBean("tablet");
        System.out.println(t.getPrice());
    }
}
