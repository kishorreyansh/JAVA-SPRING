package org.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefExample {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        A a = (A)context.getBean("aref");
        System.out.println("X Value: "+a.getX());
        System.out.println("Y Value using Reference Type: "+a.getObj().getY());
    }
}
