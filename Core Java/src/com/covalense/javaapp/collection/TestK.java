package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestK {

public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Nistha");
		al.add("ritu");
		al.add("nihu");
		
      ListIterator<String> li = al.listIterator();
		
		System.out.println("---------->forward");
		
		while(li.hasNext()) {
			Object r = li.next();
			System.out.println(r);
			
		}
		
		System.out.println("<----------Backward");
		while (li.hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
			
		}
}
}
