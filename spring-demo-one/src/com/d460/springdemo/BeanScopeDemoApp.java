package com.d460.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same beans
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object: "+result);
		
		System.out.println("\nThe memory location for theCoach: "+theCoach);
		System.out.println("\nThe memory location for alphaCoach: "+alphaCoach);
		
		//close context
		context.close();
		
		
	

	}

}
