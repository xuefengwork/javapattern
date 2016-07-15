package com.motoste.pattern.observer2;

import java.util.Observable;

public class WeatherData extends Observable {

	private double tempature;
	private double humidity;
	private double presure;
	
	public WeatherData() {}
	
	public void setMeasurements(double tempature, double humidity, double presure) {
		this.tempature = tempature;
		this.humidity = humidity;
		this.presure = presure;
		measurementChanged();
	}
	
	private void measurementChanged() {
		setChanged();
		notifyObservers();
	}

	public double getTempature() {
		// TODO Auto-generated method stub
		return tempature;
	}
	
	public double getHumidity() {
		return humidity;
	}
	
	public double getPresure() {
		return presure;
	}
}
