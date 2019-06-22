package com.covalense.javaapp.collection;

public class Student implements Comparable<Student> {

	String name;
	int id;
	double percent;
	
	
	@Override
	public int compareTo(Student s) {
		
		String a = this.name;
		String b = s.name;
		
		int k = a.compareTo(b);
		
		return k;
	}
}
		
	
	
	
	
	/* Logic to sort Students w.r.t ID
	/*
	 * @Override public int compareTo(Student s) {
	 * 
	 * if(this.id < s.id) {
	 * 
	 * return -1;
	 * 
	 * } else if (this.id > s.id) {
	 * 
	 * return 1;
	 * 
	 * }else {
	 * 
	 * return 0; }
	 * 
	 * }
	 */
	
	/* Logic to sort Students w.r.t percentage

	/*
	 * @Override public int compareTo(Student s) {
	 * 
	 * if (this.percent < s.percent) {
	 * 
	 * return -1;
	 * 
	 * } else if (this.percent > s.percent) {
	 * 
	 * return 1;
	 * 
	 * } else {
	 * 
	 * return 0; }
	 * 
	 * }
	 */


