package com.covalense.javaapp.lambdaexpression;

import java.util.function.Function;

public class TestBFunction {
	public static void main(String[] args) {
		

		Function<String, Integer> f = s -> s.length();
		
		Integer i = f.apply("Nistha");
		
		System.out.println(i);
	}

}
