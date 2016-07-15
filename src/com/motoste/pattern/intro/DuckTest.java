package com.motoste.pattern.intro;

public class DuckTest {

	public static void main(String[] args) {
		Duck duck = new ModelDuck();
		duck.fly();
		duck.quack();
		duck.setFlyBehavior(new FlyWithWings());
		duck.setQuackBehavior(new Quack());
		duck.fly();
		duck.quack();
		duck.display();
	}
}
