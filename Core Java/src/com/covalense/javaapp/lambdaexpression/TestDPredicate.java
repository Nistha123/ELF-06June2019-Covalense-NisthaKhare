package com.covalense.javaapp.lambdaexpression;

import java.util.function.Predicate;

public class TestDPredicate {

	public static void main(String[] args) {
		
		int[] b = {2,5,9,6,4,3};
		
		Predicate<Integer> p = a -> a>4;
		
		for(int i=0 ; i<b.length ; i++) {
			if(p.test(b[i])) {
				System.out.println(b[i]);
			}
		}
	}
}
