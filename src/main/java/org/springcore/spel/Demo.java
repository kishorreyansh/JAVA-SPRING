package org.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{17+23}")
    private int x;
    @Value("#{05+01}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private int a;
    @Value("#{T(java.lang.Math).PI}")
    private int b;
    @Value("#{ new java.lang.String('Reyansh')}")
    private String name;
    @Value("#{23 > 17}")
    private boolean isActive;

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", a=" + a +
                ", b=" + b +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
