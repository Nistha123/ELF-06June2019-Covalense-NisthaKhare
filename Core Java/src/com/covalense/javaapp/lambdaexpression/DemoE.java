package com.covalense.javaapp.lambdaexpression;

import lombok.extern.java.Log;

@Log
public class DemoE {

	static int sum;

	static int add(int a, int b) {

		sum = a + b;

		return sum;
	}

}//end of class
