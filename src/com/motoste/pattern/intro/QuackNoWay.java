package com.motoste.pattern.intro;

public class QuackNoWay implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I can't quack.");
	}
}
