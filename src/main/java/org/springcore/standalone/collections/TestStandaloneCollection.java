package org.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollection {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollectionconfig.xml");
        Person person1 = context.getBean("bestfriends",Person.class);
        System.out.println("Person Friends List: "+person1);
        //To know the class, by default it will be ArrayList
        System.out.println("List Class: "+person1.getFriends().getClass().getName());
        System.out.println("________________________________________________________________");
        System.out.println("Fee Structure: "+person1.getFeestructure());
        System.out.println("Map Class: "+person1.getFeestructure().getClass().getName());
        System.out.println("________________________________________________________________");
        System.out.println("DB Properties: "+person1.getProperties());
        System.out.println("Properties Class: "+person1.getProperties().getClass().getName());
    }
}
