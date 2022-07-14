package com.jaicode.springdemo;

public class BaseBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 Minutes on batting pratice";
	}

	@Override
	public void timings() {
		System.out.println("Daily 6:00-7:00AM");
		
	}

}
