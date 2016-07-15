package com.motoste.pattern.observer2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private double tempature;
	private double presure;	

	public CurrentConditionDisplay(Observable o) {
		o.addObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The tempature is " + tempature + 
				" and the presure is " + presure);
	}

	@Override
	public void update(Observable o, Object arg) {
//		 TODO Auto-generated method stub
		if ( o instanceof WeatherData ) {
			WeatherData w = (WeatherData)o;
			this.tempature = w.getTempature();
			this.presure = w.getPresure();
			display();
		}
	}

}
