package com.covalense.javaapp.collection;

import java.util.Comparator;

public class EmployeeBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Double d1 = o1.salary;
		Double d2 = o2.salary;
		return d1.compareTo(d2) * -1;
	}

}
