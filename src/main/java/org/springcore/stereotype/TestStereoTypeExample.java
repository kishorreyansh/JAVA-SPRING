package org.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereoTypeExample {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeconfig.xml");
        Student student1 = context.getBean("obj", Student.class);
        System.out.println("Student Details: "+student1);
        System.out.println("Student Courses: "+student1.getCourses());
        System.out.println("Student List Class: "+student1.getCourses().getClass().getName());
    }
}
