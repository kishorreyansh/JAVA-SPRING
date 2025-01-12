package org.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXMLLifeCycle {

    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclexmlconfig.xml");
        Phone p = (Phone) context.getBean("phone");
        System.out.println(p.getPrice());
        //Registery shutdown hook
        context.registerShutdownHook();
    }
}
