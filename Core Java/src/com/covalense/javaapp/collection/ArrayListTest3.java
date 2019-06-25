package com.covalense.javaapp.collection;

import java.util.ArrayList;
import java.util.Iterator;

import lombok.extern.java.Log;

@Log
public class ArrayListTest3 {
	
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
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator<Student> i = al.iterator();
		
		while(i.hasNext()) {
			Student sa = i.next();
			log.info("******************Student details*************");
			log.info("" + sa.id);
			log.info("" + sa.name);
			log.info("" + sa.percent);
			
		}
			
			
		
	}

}
