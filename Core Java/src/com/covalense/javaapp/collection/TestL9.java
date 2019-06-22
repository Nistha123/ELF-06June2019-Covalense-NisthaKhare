package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestL9 {

	private static final boolean Object = false;

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(9.2);
		v.add(1);
		v.add('a');
		v.add("Nistha");
		
		
		
		for(int i=0 ; i<v.size() ; i++) {
			System.out.println(v);
		}
		
		System.out.println(".............Using ForEach.........");

		for (Object o : v) {
			
			System.out.println(o);
		}
		
		System.out.println(".............Using Iterator.........");
		
		Iterator i = v.iterator();
		
		while(i.hasNext()) {
			
			Object o = i.next();
			
			System.out.println(o);
		}
		
		System.out.println(".............Using ListIterator.........");
		
		ListIterator lit = v.listIterator();
		
		while(lit.hasNext()) {
			Object o = lit.next();
			System.out.println(o);
		}
		
		System.out.println(".............Using Previous ListIterator.........");
		while(lit.hasPrevious()) {
			Object o = lit.previous();
			System.out.println(o);
		}
	}
}
