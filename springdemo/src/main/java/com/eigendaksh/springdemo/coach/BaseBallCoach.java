package com.eigendaksh.springdemo.coach;

import com.eigendaksh.springdemo.fortune.FortuneService;

public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do batting practice for 30 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void customInit() {
        System.out.println("BaseBall Coach: custom init method is called");
    }

    public void customDestroy() {
        System.out.println("BaseBall Coach: custom destroy method is called");
    }

}
