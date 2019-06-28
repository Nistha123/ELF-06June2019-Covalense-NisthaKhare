package com.covalense.javaapp.assessment;

import java.util.Comparator;

/* StudentRollNo is a class implementing Comparator to sort
 * students by thier RollNo
 * 
 */
public class SortByRollNo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		Integer id1 = o1.getId();
		Integer id2 = o2.getId();
		
		return id1.compareTo(id2);
	}

}//end of class
