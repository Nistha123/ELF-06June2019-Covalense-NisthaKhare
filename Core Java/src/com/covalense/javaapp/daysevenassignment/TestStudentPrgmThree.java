package com.covalense.javaapp.daysevenassignment;

import java.util.ArrayList;

/* USE CASE :
 * TestStudentPrgmThree is a main class storing Student data 
 * to filter the Student percentage using Stream 
 * 
 */

//SOLUTION :
public class TestStudentPrgmThree {
	
	public static void main(String[] args) {

		Student s1 = new Student("Nistha", 4, 77.0);
		Student s2 = new Student("Rahul", 3, 87.0);
		Student s3 = new Student("Nikita", 2, 49.7);
		Student s4 = new Student("sakshi", 1, 40.9);
		Student s5 = new Student("shruti", 5, 57.6);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(11);
		al.add(30);
		al.add(16);
		al.add(18);
	}//end of main

}//end of class
