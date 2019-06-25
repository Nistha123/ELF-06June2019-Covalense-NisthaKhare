package com.covalense.javaapp.lambdaexpression;

import lombok.extern.java.Log;

@Log
public class MyStudent {

	void calculateAvg(int a,int b, int c) {
		
		double r = (a+b+c)/3.0;
		log.info("Average is :" + r);
		
	}
	
	
}//end of class
