package org.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireExample {

    public  static void main (String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("autowireconfig.xml");
        Employee emp1 = context.getBean("emp",Employee.class);
        System.out.println("Employee Details: "+emp1);
    }
}
