package org.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public University getUniversity(){
        return new University();
    }

    //we can give object names or  multiple object names instead of method name
    @Bean(name={"student","temp"})
    public Student getStudent(){
        Student student = new Student(getUniversity());
        return student;
    }

}
