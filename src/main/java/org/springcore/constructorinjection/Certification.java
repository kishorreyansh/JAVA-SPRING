package org.springcore.constructorinjection;

public class Certification {

    String name;

    public Certification(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
