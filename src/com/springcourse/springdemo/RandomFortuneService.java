package com.springcourse.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{
    private String[] fortunes;

    public RandomFortuneService() {
        fortunes = new String[] { "good day", "bad day", "neutal day"};
    }

    @Override
    public String getFortune() {
        int random = new Random().nextInt(fortunes.length);
        return fortunes[random];

    }
}
