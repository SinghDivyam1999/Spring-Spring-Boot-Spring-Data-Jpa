package com.monocept.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("/resource/applicationContext.xml");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);

		CricketCoach cricCoach = context.getBean("NewcricketCoach", CricketCoach.class);
		CricketCoach cricCoach1 = context.getBean("NewcricketCoach", CricketCoach.class);
		System.out.println(cricCoach == cricCoach1);

		System.out.println(cricCoach.getTrainingDetails());

//        CricketCoach cricCoach1=context.getBean("cricketCoach",CricketCoach.class);
//        System.out.println(cricCoach==cricCoach1);  //singleton

		System.out.println(cricCoach.getDiet());
		System.out.println(cricCoach.getEmail());

		context.close();
	}
}
