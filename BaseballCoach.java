package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	//Define a private field for the dependency
	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	
	public String getDailyWorkOut() {
		return "get 30 minutes batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service 
		//fortuneService is the helper class	
		return fortuneService.getFortune();
	}
	
}
