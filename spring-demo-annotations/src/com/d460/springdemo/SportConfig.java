package com.d460.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("com.d460.springdemo")
@PropertySource("classpath:file2.txt")
public class SportConfig {
	
	//add support to resolve ${}
	
	@Bean 
	public static PropertySourcesPlaceholderConfigurer
	propertySourcesPlaceholderConfigurer(){
	return new PropertySourcesPlaceholderConfigurer();
		
	}
	
	
	//define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	
	//define bean for swim coach
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(sadFortuneService());
		
	}

}
