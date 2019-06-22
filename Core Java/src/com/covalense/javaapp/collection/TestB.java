package com.covalense.javaapp.collection;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(2);
		al.add(4.3);
		al.add('D');
		al.add("Nistha");
		
		for (Object o : al) {
			
			System.out.println(o);
			
		}
	}
}
