package com.motoste.pattern.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}
	
	public double cost() {
		return 1.05;
	}
}
