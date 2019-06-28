package com.covalense.javaapp.assessment;
/*WAP to display the content of object using lambda expression*/

/* Student is a class having data of Students
 * 
 */
public class Student {
	
	private int rollno;
	private String name;
	private double percent;
	
	public Student(int id, String name, double percent) {
		super();
		rollno = id;
		this.name = name;
		this.percent = percent;
	}

	public int getId() {
		return rollno;
	}

	public void setId(int id) {
		rollno = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
		

}// end of class
