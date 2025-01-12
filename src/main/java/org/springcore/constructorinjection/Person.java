package org.springcore.constructorinjection;

public class Person {

    private String name;
    private int personId;
    private Certification cert;

    public Person(String name, int personId, Certification cert) {
        this.name = name;
        this.personId = personId;
        this.cert = cert;
    }

    @Override
    public String toString() {
        return this.name+" : "+this.personId+" {"+this.cert.name +"}";
    }
}
