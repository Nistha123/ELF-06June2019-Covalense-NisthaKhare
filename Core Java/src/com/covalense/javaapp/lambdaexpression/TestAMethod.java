package com.covalense.javaapp.lambdaexpression;

import java.util.function.Supplier;

public class TestAMethod {
	
	public static void main(String[] args) {
		
		Supplier<Gun> s = ()-> new Gun(100);
		Gun g = s.get();
		
		System.out.println(g.bullets);
	}

}
