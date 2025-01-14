package org.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaConfigExample {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student student1 = context.getBean("student",Student.class);

        System.out.println("Student Object: "+student1);
        student1.study();
    }
}
