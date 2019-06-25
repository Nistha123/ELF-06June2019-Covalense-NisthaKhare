package com.covalense.javaapp.lambdaexpression;

public class MyFactorial {
	
	int calcFact(int a) {
		
		int x = 1;
		for(int i=1 ; i<=a ; i++) {
			x = x*i;
		}
		return x;		
	}

}
