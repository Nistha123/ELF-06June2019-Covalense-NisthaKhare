package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestL7 {

	public static void main(String[] args) {

		LinkedList li = new LinkedList();

		li.add(2);
		li.add(4.3);
		li.add('D');
		li.add("Nistha");
		
		System.out.println("Before---->" + li);
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li);
		}
		
		System.out.println("Using ForEach...........");
		for (Object o : li) {
			
			System.out.println(li);
		}
		
		System.out.println("Using Iterator...........");
		
		Iterator i = li.iterator();
		
		while (i.hasNext()) {
			Object o = i.next();
			
			System.out.println(o);
			
		}
		
		System.out.println("Using ListIterator...........");
		
		ListIterator lit = li.listIterator();
		
		while(lit.hasNext()) {
			Object o = lit.next();
			System.out.println(o);

		}
		
		System.out.println("Using previous ListIterator...........");
		while(lit.hasPrevious()) {
			Object o = lit.previous();
			System.out.println(o);

		}
		
	}
}
