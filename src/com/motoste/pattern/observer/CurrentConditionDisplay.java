package com.motoste.pattern.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private Subject weatherData;
	private double temp;
	private double humidity;
	
	public CurrentConditionDisplay(Subject subject) {
		weatherData = subject;
		subject.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temp + " F degrees and "
				+ humidity + "% humidity");
	}

	@Override
	public void update(Subject sub, Object obj) {
		if ( sub instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)sub;
			this.temp = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
		
	}

	
}
