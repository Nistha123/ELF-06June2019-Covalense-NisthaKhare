package com.covalense.javaapp.lambdaexpression;

import lombok.extern.java.Log;

@Log
public class TestEColon {
	
	
	public static void main(String[] args) {
		
		Addition h = DemoE :: add;
		
		int i = h.mySum(10, 20);
		
		log.info("Sum is " + i);
	}
}
