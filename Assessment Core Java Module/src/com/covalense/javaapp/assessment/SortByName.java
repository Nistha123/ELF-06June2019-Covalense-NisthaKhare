package com.covalense.javaapp.assessment;

import java.util.Comparator;

/* SortByName is a class implementing Comparator to sort
 * students by thier Name
 * 
 */
public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		

		String n1 = o1.getName();
		String n2 = o2.getName();
		
		return n1.compareTo(n2);
	}


}
