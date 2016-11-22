package com.d460.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {
	
	Random random = new Random();
	int ran = (random.nextInt(3))+1;

	@Override
	public String getFortune() {
		switch(ran){
		case 1:
			return "Best Luck! day";
			
		case 2:
			return "Normal day";
			
		case 3:
			return "Bad day";
			
		default:
			return "No luck";
		}
		
	
	}

}
