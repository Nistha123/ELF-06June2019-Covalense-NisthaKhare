package com.covalense.javaapp.collection;

import java.util.TreeSet;

public class TreeSetTest1 {
	
public static void main(String[] args) {
		

		Student s = new Student();
		s.name="Nistha";
		s.id=101;
		s.percent=79.9;
		
		Student s1 = new Student();
		s1.name="Abha";
		s1.id=102;
		s1.percent=89.9;
		
		Student s2 = new Student();
		s2.name="Divya";
		s2.id=103;
		s2.percent=60.9;
		
		Student s3 = new Student();
		s3.name="sunny";
		s3.id=104;
		s3.percent=75.9;
		
		TreeSet<Student> ts = new TreeSet<Student>();
		
		ts.add(s);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		
		for (Student sa : ts) {
			
			System.out.println("******************Student details*************");
			System.out.println("id is " + sa.id);
			System.out.println("name is " + sa.name);
			System.out.println("Percent is " + sa.percent);
		}
}

}
