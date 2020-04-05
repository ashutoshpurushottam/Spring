package com.eigendaksh.springdemo.coach;

import com.eigendaksh.springdemo.fortune.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String name;
    private String team;

    public CricketCoach() {
        System.out.println("Cricket Coach: inside no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Do fast bowling practice for 45 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setter method");
        this.fortuneService = fortuneService;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
