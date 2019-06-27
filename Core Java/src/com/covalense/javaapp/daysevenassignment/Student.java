package com.covalense.javaapp.daysevenassignment;

/* USE CASE :
 * Student is a class having Student data 
 * 
 */

//SOLUTION :
public class Student {
	
	private String name;
	private int id;
	private double percent;
	
	public Student(String name, int id, double percent) {
		super();
		this.name = name;
		this.id = id;
		this.percent = percent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	

}//end of class
