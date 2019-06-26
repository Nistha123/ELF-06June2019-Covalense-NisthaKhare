package com.covalense.javaapp.casting;

/* USE CASE :
 * TestCasting is a test class of Chips
 * class 
 * 
 */

//SOLUTION :
public class TestCasting {

	public static void main(String[] args) {

		Chips c = new Lays();
		Lays l = (Lays) c;

		c.rate = 20;
		l.flavor = "Tomato";

		c.eat();
		System.out.println("Rate of chips :" + c.rate);
		l.eatlays();
		System.out.println("flavor of Lays :" + l.flavor);
	}//End of main

}//End of class
