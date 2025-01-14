package org.springcore.beanscope;

import org.springcore.stereotype.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScopeExample {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beanscopeconfig.xml");
        Teacher teacher = context.getBean("obj", Teacher.class);
        System.out.println("Teacher Details: "+teacher);
        System.out.println("Teacher Hashcode: "+teacher.hashCode());

        Teacher teacher2 = context.getBean("obj", Teacher.class);
        System.out.println("Teacher2 Hashcode: "+teacher2.hashCode());
        System.out.println("___________________________________________________");

        Professor prof1 = context.getBean("prof", Professor.class);
        System.out.println("Professor Hashcode: "+prof1.hashCode());

        Professor prof2 = context.getBean("prof", Professor.class);
        System.out.println("Professor2 Hashcode: "+prof2.hashCode());


    }
}
