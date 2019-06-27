package com.covalense.javaapp.streamexample;

import java.util.ArrayList;
import java.util.Comparator;

import com.covalense.javaapp.daysevenassignment.Student;

import lombok.extern.java.Log;

/* USE CASE :
 * TestStudentOne is a main class storing Student data 
 * to compare the Student percentage using Comparator lambda expression
 * 
 */

//SOLUTION :
@Log
public class TestStudentStream {
	static Comparator<Student> c = (i, j) -> {

		Double p1 = i.getPercent();
		Double p2 = j.getPercent();
		return p1.compareTo(p2);

	};

	static Student getTopper(ArrayList<Student> al) {

		return al.stream().max(c).get();
	}

	static Student getLower(ArrayList<Student> al) {

		return al.stream().min(c).get();
	}

	public static void main(String[] args) {

		Student s1 = new Student("Nistha", 4, 77.0);
		Student s2 = new Student("Anjali", 3, 87.0);
		Student s3 = new Student("Nikita", 2, 79.7);
		Student s4 = new Student("sakshi", 1, 67.9);
		Student s5 = new Student("shruti", 5, 57.6);

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);

		Student per = getTopper(al);
		Student per1 = getLower(al);

		log.info("Name is :" + per.getName() + " with " + "Maximum percentage is :" + per.getPercent());
		log.info("***********************************************************************");
		log.info("Name is :" + per1.getName() + " with " + "Minimum percentage is :" + per1.getPercent());

	}// End of main

}// End of class
