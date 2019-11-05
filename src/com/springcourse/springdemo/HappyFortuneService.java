package com.springcourse.springdemo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today's your happy day!";
    }
}
