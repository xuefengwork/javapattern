package com.motoste.pattern.factory;

public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "NY Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
	}
	
	public void cut() {
		System.out.println("NYStyle Cheese Pizza---new cut method");
	}
}
