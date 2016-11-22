package com.d460.springdemo;

public class BaseballCoach implements Coach {
	
	
	//Define a private field for the dependency
	private FortuneService fortuneservice;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		this.fortuneservice = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout(){
		return "Sprend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortune service to get a fortune
		return fortuneservice.getFortune();
	}

}
