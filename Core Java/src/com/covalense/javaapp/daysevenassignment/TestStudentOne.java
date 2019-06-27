package com.covalense.javaapp.daysevenassignment;

import java.util.Comparator;
import java.util.TreeSet;

import com.covalense.javaapp.implementinglambda.Employee;

import lombok.extern.java.Log;

/* USE CASE :
 * TestStudentOne is a main class storing Student data 
 * to compare the Student ID using Comparator lambda expression
 * 
 */

//SOLUTION :
@Log
public class TestStudentOne {

	public static void main(String[] args) {

		Student s1 = new Student("Nistha", 4, 77.0);
		Student s2 = new Student("Rahul", 3, 87.0);
		Student s3 = new Student("Nikita", 2, 79.7);
		Student s4 = new Student("sakshi", 1, 67.9);
		Student s5 = new Student("shruti", 5, 57.6);

		Comparator<Student> c = (e, f) -> {

			Integer i1 = e.getId();
			Integer i2 = f.getId();

			return i1.compareTo(i2);
		};

		TreeSet<Student> ts = new TreeSet<Student>(c);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (Student s : ts) {

			log.info("Id is :" + s.getId());
			log.info("Name is :" + s.getName());
			log.info("Salary is :" + s.getPercent());
			log.info("*******************************************");
		}
	}//end of main

}//end of class
