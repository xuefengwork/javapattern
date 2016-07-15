package com.motoste.pattern.observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4);
		weatherData.setMeasurements(80.5, 65, 30.4); //small change, not display
		weatherData.setMeasurements(84, 65, 30.4);
	}

}
