package com.sahil.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public  class TennisCoach implements Coach {
	FortuneService fortuneService;
	
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}



	
	

}
