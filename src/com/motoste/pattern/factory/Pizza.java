package com.motoste.pattern.factory;

import java.util.ArrayList;

public class Pizza {

	protected String name;
	protected String dough;
	protected String sauce;
	
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing.");
	}

	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Baking.");
	}

	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting.");
	}

	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Boxing.");
	}
	
	public String getName() {
		return name;
	}

}
