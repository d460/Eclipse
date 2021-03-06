package com.d460.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach()
	{
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService thefortuneservice){
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneservice = thefortuneservice;
	}
	
	public void setEmailAddress(String emailAddress){
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress(){
		return emailAddress;
	}
	
	public void setTeam(String team){
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}
	
	public String getTeam(){
		return team;
	}
		
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneservice.getFortune();
	}

}
