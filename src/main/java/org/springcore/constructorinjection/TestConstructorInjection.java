package org.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInjection {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjectionconfig.xml");
        Person p = (Person) context.getBean("person");
        System.out.println("Person Name and Id  is "+p );

        Addition add = (Addition) context.getBean("addition");
        add.doSum();
    }
}
