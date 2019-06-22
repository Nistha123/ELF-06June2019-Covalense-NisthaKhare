package com.covalense.javaapp.exceptions;

import java.io.File;

public class PayTm extends IRCTC {

	void book() throws ArithmeticException {
		System.out.println("Book tickets");
		System.out.println(10 / 0);

		throw new ArithmeticException("Should not be divided by zero");
	}
}
