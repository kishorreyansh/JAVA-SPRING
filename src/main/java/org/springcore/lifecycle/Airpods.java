package org.springcore.lifecycle;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Airpods {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Airpods setter method invoked");
        this.price = price;
    }

    public Airpods(){
        super();
    }

    @Override
    public String toString() {
        return "Airpods{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void init(){
        System.out.println("Airpods Init() invoked");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Airpods destroy() invoked");
    }
}
