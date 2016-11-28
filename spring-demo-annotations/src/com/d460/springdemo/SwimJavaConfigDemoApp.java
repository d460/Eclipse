package com.d460.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring Java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
				
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		//close 
		context.close();

	}
}
