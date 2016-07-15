package com.motoste.pattern.factory;

public class ChicagoStylePizzaStore extends PizzaStore {

private Pizza pizza;
	
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		}
		return pizza;
	}
}
