package com.motoste.pattern.singleton;

public class Singleton2 {

	private volatile static Singleton2 uniqueSingleton2;
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		if (uniqueSingleton2 == null) {
			synchronized (Singleton2.class) {
				if (uniqueSingleton2 == null) {
					uniqueSingleton2 = new Singleton2();
				}
			}
		}
		
		return uniqueSingleton2;
	}
}
