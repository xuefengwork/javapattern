package com.motoste.pattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private double temperature;
	private double humidity;
	private double pressure;
	private boolean isChanged = false;
	private ArrayList<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public boolean isChanged() {
		return isChanged == true;
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if ( i > 0 ) {
			observers.remove(i);
		}
		
	}
	@Override
	public void notifyObservers(Subject sub, Object obj) {
		for (Observer o : observers) {
			o.update(sub, obj);
		}
		
	}
	
	private void setChanged() {
		isChanged = true;
		
	}

	public void setMeasurements(double temp, double humidity, double pressure) {
		if ( Math.abs(temp - this.temperature) >= 1.0 ) {
			setChanged();
			this.temperature = temp;
			this.humidity = humidity;
			this.pressure = pressure;
			notifyObservers(this, null);
		}
	}
	
	public double getTemperature() {
		return temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public double getPressure() {
		return pressure;
	}
	
	
}
