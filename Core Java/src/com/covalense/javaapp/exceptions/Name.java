package com.covalense.javaapp.exceptions;

public class Name {

	void write(String n) throws InvalidNameException {
		if (n.length() > 5) {
			System.out.println("Name is " + n);
		} else {
			throw new InvalidNameException();
		}
	}
}
