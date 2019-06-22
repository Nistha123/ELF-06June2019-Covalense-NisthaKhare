package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestE {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(2);
		al.add(4.3);
		al.add('D');
		al.add("Nistha");
		al.add(6);
		al.add('b');
		
		ListIterator li = al.listIterator(al.size());
		
		System.out.println("<----------Backward");
		while (li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
			
		}
	}
}
