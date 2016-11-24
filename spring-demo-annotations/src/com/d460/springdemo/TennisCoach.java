package com.d460.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
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
	
	@PostConstruct
	public void doSomeInitStuff() {
		System.out.println("TennisCoach: inside doSomeInitStuff method");
	}
	
	@PreDestroy
	public void doSomeDestroyStuff() {
		System.out.println("TennisCoach: inside doSomeDestroyStuff method");
	}
		
	
	

}
