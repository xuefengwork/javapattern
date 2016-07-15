package com.motoste.pattern.singleton;

public class Singleton {

	private static Singleton uniqueSingleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return uniqueSingleton;
	}
}
