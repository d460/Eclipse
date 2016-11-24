package com.d460.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/*
	 * @Autowired 
	 * public TennisCoach(FortuneService thefortuneService) {
	 * this.fortuneService = thefortuneService; }
	 */
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		//
		return "Practice your backhand volley";
	}



	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

/*	@Autowired
	public void setFortuneService(FortuneService thefortuneService) {
		System.out.println("TennisCoach: inside setter setFortuneService");
		this.fortuneService = thefortuneService;
	}*/
	
/*	@Autowired
	public void doSomeCrazyStuff(FortuneService thefortuneService) {
		System.out.println("TennisCoach: inside doSomeCrazyStuff method");
		this.fortuneService = thefortuneService;
	}*/

}
