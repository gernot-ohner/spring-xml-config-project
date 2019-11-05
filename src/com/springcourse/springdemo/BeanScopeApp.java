package com.springcourse.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach myCoach2 = context.getBean("myCoach", Coach.class);

        boolean result = myCoach == myCoach2;

        System.out.println("Are they the same? " + result);

        context.close();

    }
}
