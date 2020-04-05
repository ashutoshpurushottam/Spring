package com.eigendaksh.springdemo;

import com.eigendaksh.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApplicationDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve Coach objects from context
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        System.out.println("Location of alphaCoach: " + alphaCoach);
        context.close();
        /*
        Coach betaCoach = context.getBean("myCoach", Coach.class);

        boolean result = alphaCoach == betaCoach;

        System.out.println("Objects pointing to the same location: " + result);
        System.out.println("Location of alphaCoach: " + alphaCoach);
        System.out.println("Location of betaCoach: " + betaCoach);
         */
    }
}
