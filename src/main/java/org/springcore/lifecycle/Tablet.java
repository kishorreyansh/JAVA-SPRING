package org.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Tablet implements InitializingBean, DisposableBean {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Setter Tablet Price() invoked");
        this.price = price;
    }

    public Tablet(){
        super();
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //It acts like init() in Interface Lifecycle
        System.out.println("Tablet Init() invoked ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Tablet destroy() invoked");
    }
}
