package org.springcore.lifecycle;

public class Phone {

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Setter Phone Price() invoked");
        this.price = price;
    }

    public Phone(){
        super();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Spring Container init() invoked");
    }

    public void destroy(){
        System.out.println("Spring container destroy() invoked");
    }
}
