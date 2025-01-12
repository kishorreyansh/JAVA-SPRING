package org.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationsLifeCycle {

    public static void main(String[] args){

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleannotationsconfig.xml");
        context.registerShutdownHook();

        Airpods a = (Airpods) context.getBean("airpods");
        System.out.println(a.getPrice());
    }
}
