package com.motoste.access;

public class IceCream {
	public static void main(String[] args) {
//		Sundae s = new Sundae();
		Sundae s = Sundae.makeSundae();
	}
}


class Sundae {
	private Sundae() {
		System.out.println("Sundae constructor");
	}
	static Sundae makeSundae() {
		return new Sundae();
	}
}
