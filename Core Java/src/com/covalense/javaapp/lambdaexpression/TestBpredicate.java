package com.covalense.javaapp.lambdaexpression;

import java.util.function.Predicate;

public class TestBpredicate {

	public static void main(String[] args) {
		Predicate<String> p = s-> s.length() >= 5;
		
		
		Boolean b = p.test("Nistha");
		System.out.println(b);
	}
}
