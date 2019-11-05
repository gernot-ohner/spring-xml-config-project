package com.springcourse.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String teamname;
    private String email;

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getTeamname() {
        return teamname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CricketCoach() {
        System.out.println("CricketCoach: inside a no arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return getTeamname() + ": Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "From " + getEmail() + ": " + fortuneService.getFortune();
    }
}
