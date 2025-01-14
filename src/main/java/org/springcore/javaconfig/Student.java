package org.springcore.javaconfig;

public class Student {

    private University university;

    public Student(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public void study(){
        this.university.universityName();
        System.out.println("Student is studing Spring Framework");
    }
}
