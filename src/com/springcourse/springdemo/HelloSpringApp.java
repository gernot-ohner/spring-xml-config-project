package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve a bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        // call methods on the bean
        System.out.println("training: " + coach.getDailyWorkout());
        System.out.println("fortune: " + coach.getDailyFortune());
        // close the context
        context.close();



        System.out.println();
    }
}
