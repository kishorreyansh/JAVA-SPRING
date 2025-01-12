package org.springcore.auto.wire;

public class Employee {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Employee Set Address method invoked...");
        this.address = address;
    }

    public Employee() {
        super();
    }

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
