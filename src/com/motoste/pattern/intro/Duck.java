package com.motoste.pattern.intro;

import static com.motoste.util.Print.*;

public abstract class Duck {
	private FlyBehavior flyBehavior = new FlyNoWay();
	private QuackBehavior quackBehavior = new QuackNoWay();
	public Duck() {}
	
	protected void display() {
		print("I am a Duck");
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
