package com.monocept.springdemo;

import org.springframework.stereotype.Component;

@Component
public class WeightLossDiet implements DietService {

	@Override
	public String getDiet() {
		
		return "Reduce Carbs";
	}

}
