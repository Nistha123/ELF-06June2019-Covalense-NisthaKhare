package com.covalense.javaapp.collection;

import java.util.TreeSet;

import com.covalense.javaapp.collection.Product;;

public class TreeSetProduct {
	
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.name = "tv";
		p1.cost = 40000;
		p1.rating = 3.5;
		
		Product p2 = new Product();
		p2.name = "Freez";
		p2.cost = 35000;
		p2.rating = 4.5;
		
		Product p3 = new Product();
		p3.name = "Heater";
		p3.cost = 15000;
		p3.rating = 2.5;
		
		Product p4 = new Product();
		p4.name = "AC";
		p4.cost = 50000;
		p4.rating = 4.8;
		
		TreeSet<Product> ts = new TreeSet<Product>();
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		for (Product p : ts) {
			
			System.out.println("******************Product details*************");
			System.out.println("name is " + p.name);
			System.out.println("cost is " + p.cost);
			System.out.println("rating is " + p.rating);
		}
	}

}
