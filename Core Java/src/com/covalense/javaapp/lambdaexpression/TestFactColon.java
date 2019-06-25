package com.covalense.javaapp.lambdaexpression;

import lombok.extern.java.Log;

@Log
public class TestFactColon {

	public static void main(String[] args) {
		
		MyFactorial m = new MyFactorial();
		Factorial f = m :: calcFact;
		
		int s = f.fact(5);
		
		log.info("factorial is :" + s);
	}
}
