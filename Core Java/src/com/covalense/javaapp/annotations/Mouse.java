package com.covalense.javaapp.annotations;

public class Mouse {

	void click() {
		System.out.println("This is click() method");
	}
	
	void doubleClick() {
		System.out.println("This is doubleClick() method");
	}
	
	@Deprecated
	void scroll() {
		System.out.println("This is scroll() method");
	}
}//End Of class
