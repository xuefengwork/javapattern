package com.motoste.pattern.factory;

public class NYStylePizzaStore extends PizzaStore {

	private Pizza pizza;
	
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		}
		return pizza;
	}

	
}
