package com.covalense.javaapp.lambdaexpression;

import java.util.function.Function;

import lombok.extern.java.Log;

@Log
public class TestBFunction {
	public static void main(String[] args) {
		

		Function<String, Integer> f = s -> s.length();
		
		Integer i = f.apply("Nistha");
		
		log.info(""+i);
	}//end of main

}//end of class
