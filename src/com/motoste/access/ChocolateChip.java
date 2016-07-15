package com.motoste.access;

import com.motoste.access.dessert.Cookie;

//This is a subclass
public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}

	public void chomp() {
		bite();
	}

	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}

}
