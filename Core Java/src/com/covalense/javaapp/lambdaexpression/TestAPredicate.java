package com.covalense.javaapp.lambdaexpression;

import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class TestAPredicate {

	public static void main(String[] args) {
		
		Predicate<Integer> p = a->a%2 == 0;
		
		Boolean x = p.test(10);
		log.info(""+x);
	}//end of main
}//end of class
