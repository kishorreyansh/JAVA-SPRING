package org.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    //at variable
    @Autowired
    @Qualifier("address")
    private Address address;

    public Address getAddress() {
        return address;
    }

    //@Autowired
    public void setAddress(Address address) {
        System.out.println("Employee Set Address method invoked...");
        this.address = address;
    }

    public Employee() {
        super();
    }

    //@Autowired
    public Employee(Address address) {
        super();
        this.address = address;
        System.out.println("Inside Constructor");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
