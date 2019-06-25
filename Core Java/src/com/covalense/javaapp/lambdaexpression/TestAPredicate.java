package com.covalense.javaapp.lambdaexpression;

import java.util.function.Predicate;

public class TestAPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> p = a->a%2 == 0;
		
		Boolean x = p.test(15);
		System.out.println(x);
	}
}
