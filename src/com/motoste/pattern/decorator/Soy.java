package com.motoste.pattern.decorator;

public class Soy extends CondimentDecorator {

	private Beverage beverage;
	public Soy(Beverage b) {
		beverage = b;
	}
	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.15 + beverage.cost();
	}
	
}
