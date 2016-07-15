package com.motoste.access;

public class Lunch {
	public static void main(String[] args) {
		Soap1 sp1 = Soap1.makeSoap1();
		Soap2 sp2 = Soap2.getSoap2();
		sp1.f();
		sp2.g();
	}
}

class Soap1 {
	private Soap1() {}
	public static Soap1 makeSoap1() {
		return new Soap1();
	}
	void f() {}
}

class Soap2 {
	private Soap2() {}
	private static Soap2 sp2 = new Soap2();
	public static Soap2 getSoap2() {
		return sp2;
	}
	void g() {}
}
