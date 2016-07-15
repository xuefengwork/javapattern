package com.motoste.pattern.decorator;

public class Whip extends CondimentDecorator {

	private Beverage beverage;
	
	public Whip(Beverage b) {
		beverage = b;
	}
	
	public double cost() {
		return 0.10 + beverage.cost();
	}

	@Override
	public String getDiscription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}
}
