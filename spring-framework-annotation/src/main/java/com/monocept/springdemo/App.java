package com.monocept.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/resource/applicationContext.xml");
        CricketCoach cricCoach=context.getBean("cricketCoach",CricketCoach.class);
        System.out.println(cricCoach.getTrainingDetails());
        
//        CricketCoach cricCoach1=context.getBean("cricketCoach",CricketCoach.class);
//        System.out.println(cricCoach==cricCoach1);  //singleton
        
        System.out.println(cricCoach.getDiet());
        
        context.close();
    }
}
