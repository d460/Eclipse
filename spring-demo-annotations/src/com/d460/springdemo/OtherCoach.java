package com.d460.springdemo;

import java.awt.event.FocusAdapter;

import org.springframework.stereotype.Component;

@Component
public class OtherCoach implements Coach {
	
	FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		
		return "Just do some excercise";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
