package com.d460.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
//		System.out.println(theCoach);
//		Coach theCoach2 = context.getBean("tennisCoach", Coach.class);
//		System.out.println(theCoach2);
//		
//		if(theCoach == theCoach2){
//			System.out.println("Equal: "+theCoach+ " "+ theCoach2);
//		}
		
		//call methods
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
//		System.out.println(theCoach2.getDailyWorkout());
		
		//close
		context.close();

	}

}
