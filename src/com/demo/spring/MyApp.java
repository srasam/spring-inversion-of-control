package com.demo.spring;

public class MyApp {

	public static void main(String[] args) {
		//create coach object 
		
		Coach theCoach=new TrackCoach();
		//use coach object
		System.out.println(theCoach.getDailyWorkout());

	}

}
