package org.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpelExample {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo d = context.getBean("demo", Demo.class);
        System.out.println("Demo x and y values: "+d);
        System.out.println("______________________________________________");

        SpelExpressionParser temp = new SpelExpressionParser();
        Expression expression = temp.parseExpression("23+17");
        System.out.println("Using SpelExpressionParser expression: "+expression.getValue());
    }
}
