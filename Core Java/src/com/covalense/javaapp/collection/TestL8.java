package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestL8 {

	public static void main(String[] args) {

		LinkedList<Character> li = new LinkedList<Character>();
		li.add('a');
		li.add('b');
		li.add('c');
		li.add('d');
		li.add('e');
		
		System.out.println("Before---->" + li);
		
		Iterator<Character> i = li.iterator();
		
		while (i.hasNext()) {
			Character c = i.next();
			
			System.out.println("Using Iterator " + c);
			
		}
		
	}
}
