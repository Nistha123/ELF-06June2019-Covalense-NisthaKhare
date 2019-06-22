package com.covalense.javaapp.collection;

import java.util.TreeSet;

public class TreeSetCar {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name="Zen";
		c1.brand="Maruti";
		c1.cost=200000;
		c1.rating=3.0;

		Car c2 = new Car();
		c2.name="BMW1";
		c2.brand="BMW";
		c2.cost=5000000;
		c2.rating=5.0;

		Car c3 = new Car();
		c3.name="swift";
		c3.brand="Tata";
		c3.cost=400000;
		c3.rating=3.8;

		Car c4 = new Car();
		c4.name="Lombo";
		c4.brand="lamborghini";
		c4.cost=2000000;
		c4.rating=4.8;
		
    TreeSet<Car> ts = new TreeSet<Car>();
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		for (Car c : ts) {
			
			System.out.println("******************Car details*************");
			System.out.println("name is " + c.name);
			System.out.println("brand is " + c.brand);
			System.out.println("cost is " + c.cost);
			System.out.println("rating is " + c.rating);
		}
	}

}
