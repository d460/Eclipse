package com.d460.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public TrackCoach(FortuneService theFortuneService){
		this.fortuneservice = theFortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: " +fortuneservice.getFortune();
	}
	
	//add init method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside method doMyStuffStarupStuff");
	}
	
	
	//add destroy method
	public void doMyCleanStuff(){
		System.out.println("TrackCoach: inside method doMyCleanStuff");
	}
	
	

}
