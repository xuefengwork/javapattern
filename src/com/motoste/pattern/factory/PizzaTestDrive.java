package com.motoste.pattern.factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		Pizza nyPizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + nyPizza.getName());
		
		Pizza chPizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + chPizza.getName());
	}

}
