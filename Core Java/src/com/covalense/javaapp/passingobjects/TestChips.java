package com.covalense.javaapp.passingobjects;

/* USE CASE :
 * TestChips is a main class of Baby class
 * 
 */

//SOLUTION :

public class TestChips {

	public static void main(String[] args) {
		
		Baby b = new Baby();
		
		Lays l = new Lays();
		Kurkure k = new Kurkure();
		
		b.recieve(l);
				
				
	}//end of main
}//end of class
