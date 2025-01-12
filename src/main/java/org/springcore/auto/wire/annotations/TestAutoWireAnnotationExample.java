package org.springcore.auto.wire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireAnnotationExample {

    public  static void main (String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("autowireannotationconfig.xml");
        Employee emp1 = context.getBean("emp", Employee.class);
        System.out.println("Employee Details: "+emp1);
    }
}
