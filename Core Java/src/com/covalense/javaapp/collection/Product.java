package com.covalense.javaapp.collection;

/* USE CASE :
 * Product is a class having Product data 
 * 
 */

//SOLUTION :
public class Product implements Comparable<Product>{
	
	String name;
	int cost;
	double rating;
	
	@Override
	public int compareTo(Product o) {
	
		Double d1 = this.rating;
		Double d2 = o.rating;
		
		return (d1.compareTo(d2)*-1);
	}

}
