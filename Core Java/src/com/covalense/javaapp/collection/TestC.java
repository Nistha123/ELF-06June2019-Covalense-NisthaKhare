package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(2);
		al.add(4.3);
		al.add('D');
		al.add("Nistha");
		al.add(6);
		al.add('b');
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			Object r = it.next();
			System.out.println(r);
			
		}
	}
}
