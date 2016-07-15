package com.motoste.access;

import com.motoste.access.dessert.Cookie;

public class Dinner {
	public static void main(String[] args) {
		Cookie x = new Cookie();
//		x.bite(); //this is wrong since package access privilege
	}
}
