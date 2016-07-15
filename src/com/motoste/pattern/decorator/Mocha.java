package com.motoste.pattern.decorator;

public class Mocha extends CondimentDecorator {

	private Beverage beverage;
	
	public Mocha(Beverage b) {
		beverage = b;
	}
	
	
	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.20 + beverage.cost();
	}

	
}
