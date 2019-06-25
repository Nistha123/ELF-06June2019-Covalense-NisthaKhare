package com.covalense.javaapp.lambdaexpression;

import java.util.function.Function;

public class TestCFunction {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = a -> a*a;
		
		Integer i = f.apply(5);
		System.out.println(i);
	}
}
