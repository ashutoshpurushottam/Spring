package com.eigendaksh.springdemo.coach;

import com.eigendaksh.springdemo.coach.Coach;
import com.eigendaksh.springdemo.fortune.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
