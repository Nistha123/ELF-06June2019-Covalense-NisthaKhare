package com.covalense.javaapp.annotations;

/* USE CASE :
 * TestA is a main class of mouse class
 *
 */

//SOLUTION :
@SuppressWarnings({"deprecation","unused"})
public class TestA {
	
	public static void main(String[] args) {
		
		Mouse m = new Mouse();
		
		m.click();
		m.scroll();
	}//End of main
	
	void m() {
		int c;
	}
}//End Of class

