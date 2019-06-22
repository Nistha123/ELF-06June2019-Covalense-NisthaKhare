package com.covalense.javaapp.collection;

public class Car implements Comparable<Car>{

	String name;
	String brand;
	int cost;
	double rating;
	
	public int compareTo(Car c) {
		
		return this.name.compareTo(c.name);
	}
	
	
}
