package com.d460.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	//create an array of Strings
	private String[] data = {
			"Ramdom String one",
			"Random String two",
			"Random String three"
	};
	
	//Create a random number generator
	private Random myRandom = new Random();
	
	

	@Override
	public String getFortune() {
		//pick a random String from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
