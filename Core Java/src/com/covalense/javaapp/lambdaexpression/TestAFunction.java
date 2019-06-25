package com.covalense.javaapp.lambdaexpression;

import java.util.function.Function;

public class TestAFunction {

	public static void main(String[] args) {
		
		Function<Double, Double> f = r -> 3.14*r*r;
		
		double x = f.apply(5.1);
		System.out.println(x);
	}
}
