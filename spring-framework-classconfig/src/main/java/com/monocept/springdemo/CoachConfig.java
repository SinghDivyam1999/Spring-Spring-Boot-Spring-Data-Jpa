package com.monocept.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.monocept.springdemo")
@PropertySource("classpath:/resource/sports.properties")
public class CoachConfig {

	@Bean
	public DietService weightLossDiet() {
		return new WeightLossDiet();
	}
	
	@Bean
	@Scope("prototype")
	public  CricketCoach NewcricketCoach() {
		return new CricketCoach(weightLossDiet());
	}
	
}
