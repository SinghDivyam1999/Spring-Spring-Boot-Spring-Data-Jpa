package com.monocept.Scratch;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Resource/spring.xml");
		/*
		 * Using xml file Vehical obj=(Vehical) context.getBean("car"); obj.drive();
		 * 
		 * Vehical obj2=(Vehical) context.getBean("bike"); obj2.drive();
		 */
//    	Vehical car=new Car();
//    	Vehical bike=new Bike();
//       car.drive();
//       bike.drive();
		
		
//	Annotation based spring	
//		Vehical obj=(Vehical) context.getBean("car"); //here car is decapatilized class name
//		obj.drive();
//		
//		Vehical obj1=(Vehical) context.getBean("bike");
//		obj1.drive();
		Car car=(Car) context.getBean("car");
		car.drive();
		
		
//		Tier t=(Tier) context.getBean("tyre");
//		
//		System.out.println(t);
		
		
		
		
	}
}
