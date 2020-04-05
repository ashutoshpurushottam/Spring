package com.eigendaksh.springdemo;

import com.eigendaksh.springdemo.coach.Coach;
import com.eigendaksh.springdemo.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println("------------------------------------");
        // Cricket coach
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getName());
        System.out.println(cricketCoach.getTeam());
        context.close();
    }
}
