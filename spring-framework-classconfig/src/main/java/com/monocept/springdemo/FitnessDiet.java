package com.monocept.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FitnessDiet implements DietService {

	@Override
	public String getDiet() {
		// TODO Auto-generated method stub
		return "Take a Protein";
	}

}
