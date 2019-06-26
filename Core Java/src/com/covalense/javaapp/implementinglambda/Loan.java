package com.covalense.javaapp.implementinglambda;

/* USE CASE :
 * Loan is an enum displaying the constants
 * 
 */

//SOLUTION :
public enum Loan {

	HOME(240),PERSONAL(241),CAR(242);
	
	private int value;

	private Loan(int value) {
		this.value = value;
	}
	
	public int getValue() {
		
		return value;
		
	}
}//end of enum
