package com.covalense.javaapp.assessment;

import java.util.Comparator;

/* StudentPercent is a class implementing Comparator to sort
 * students by thier Percent
 * 
 */
public class  SortByPercent implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		Double n1 = o1.getPercent();
		Double n2 = o2.getPercent();
		
		return n1.compareTo(n2);
	}


}//end of class
