package com.covalense.javaapp.assessment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.logging.Logger;

/*WAP to sort the students by role number, name and percentage based on the user request.*/

/* StudentSort is a main class sorting Students on the user choice
 * displaying students details
 * 
 */

public class StudentSort {

	public static void main(String[] args) {

		Logger log = Logger.getLogger("assessmentlog1.txt");

		Student s1 = new Student(1, "Nistha", 77.8);
		Student s2 = new Student(2, "Vineesha", 87.8);
		Student s3 = new Student(3, "shraddha", 66.7);
		Student s4 = new Student(4, "rohit", 80.8);

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

		Scanner sc = new Scanner(System.in);
		log.info("Enter your choice :");
		int n = sc.nextInt();

		Iterator<Student> i = null ;
		TreeSet<Student> ts =null;
		
	
		switch (n) {
		case 1:

			SortByRollNo sbr = new SortByRollNo();
			ts = new TreeSet<Student>(sbr);

			break;
		case 2:

			SortByName sbn = new SortByName();
			ts = new TreeSet<Student>(sbn);
			break;
		case 3:
			SortByPercent sbp = new SortByPercent();
			ts = new TreeSet<Student>(sbp);
			break;

		default:
			log.info("You have entered wrong input");
			break;
		}

	for (Student sn : ts) {
		log.info("Student Id :" + sn.getId());
		log.info("Student name :" + sn.getName());
		log.info("Student percent :" + sn.getPercent());
	}
			
			

			
		


	}// end of main

}// end of class
