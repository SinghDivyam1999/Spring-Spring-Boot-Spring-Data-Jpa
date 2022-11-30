package com.monocept.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class CricketCoach implements Coach {
//	@Autowired
//	@Qualifier("weightLossDiet")
	private DietService service;
	@Value("${cricketCoach.email}")
	private String email;

	// private String name;

//	public String getEmail() {
//		return email;
//	}
//    @Autowired
//    @Qualifier("weightLossDiet")
//	public void setService(DietService service) {
//		this.service = service;
//	}

//	public void setName(String name) {
//		this.name = name;
//	}

//	public void setEmail(String email) {
//		this.email = email;
//	}

//	public CricketCoach(DietService service) {
//		super();
//		this.service = service;
//	}

	public String getTrainingDetails() {
		return "Practice batting for 30 min";
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String getDiet() {
		return service.getDiet();
	}

	@PostConstruct
	public void doInitWork() {
		System.out.println("Do some initializing work");
	}

	@PreDestroy
	public void doClosingWork() {
		System.out.println("Closing work");
	}

	public CricketCoach(DietService service, String email) {
		super();
		this.service = service;
		this.email = email;
	}

	public CricketCoach(DietService weightLossDiet) {
		return ;
	}
	
//	public String getName() {
//		return name;
//	}
}
