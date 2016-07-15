package com.motoste.pattern.observer2;



public class WeatherStation2 {

	public static void main(String[] args) {
		WeatherData weather = new WeatherData();
	
		CurrentConditionDisplay c = new CurrentConditionDisplay(weather);
		weather.setMeasurements(18, 5, 3.7);
	}
	
	

}
