package com.springcourse.springdemo;

public class VolleyballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Train digs for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
