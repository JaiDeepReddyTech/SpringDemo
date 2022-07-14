package com.jaicode.springdemo;

public class TrackCoach implements Coach {
	public TrackCoach() {
		System.out.println("Track Coach Training");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5K";
	}

	@Override
	public void timings() {
		// TODO Auto-generated method stub
		System.out.println("Daily 5:00-6:00AM");
		
	}

}
