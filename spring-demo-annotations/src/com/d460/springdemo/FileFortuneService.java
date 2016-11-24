package com.d460.springdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	BufferedReader br = null;
	String currentLine;
	String[] array;
	private Random myRandom = new Random();
	
	br = new BufferedReader(new FileReader(file.txt));
	while ((currentLine = br.readLine()) != null) {
		int i = 0;
		array[i]=currentLine;
		i++;
	}

	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(array.length);
		
		String theFortune = array[index];
		
		return theFortune;
	}

}}
