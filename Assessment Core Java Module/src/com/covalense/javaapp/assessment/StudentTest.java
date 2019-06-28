package com.covalense.javaapp.assessment;

/* StudentTest is a main class displaying data of Object Of Student class
 * 
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StudentTest {

	public Student getstud(ArrayList<Student> a) {

		for (Student student : a) {

		}
		return null;

	}

	public static void main(String[] args) {

		Logger log = Logger.getLogger("assessmentlog.txt");

		Student s1 = new Student(1, "Nistha", 77.8);
		Student s2 = new Student(4, "Vineesha", 87.8);
		Student s3 = new Student(3, "shraddha", 66.7);
		Student s4 = new Student(2, "rohit", 80.8);

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);

	Comparator<Student> c = (i,j)->{
		
		Integer id1 = i.getId();
		Integer id2 = j.getId();
		
		return id1.compareTo(id2);
	};
	
	List<Student> l = al.stream().sorted(c).collect(Collectors.toList());
	
	for (Student s : l) {
		log.info("Student Id is :" + s.getId());
		log.info("Student name is :" + s.getName());
		log.info("Student percent is :" + s.getPercent());
	}
	

	}// end of main

}// end of class
