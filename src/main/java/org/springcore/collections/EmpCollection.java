package org.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpCollection {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Employee emp1 = (Employee) context.getBean("emp1");
        System.out.println("Employee Name: "+emp1.getName());
        System.out.println("Employee Phones: "+emp1.getPhones());
        System.out.println("Employee Addresses: "+emp1.getAddresses());
        System.out.println("Employee Courses: "+emp1.getCourses());
        System.out.println("Employee Skills: "+emp1.getSkills());
    }
}
