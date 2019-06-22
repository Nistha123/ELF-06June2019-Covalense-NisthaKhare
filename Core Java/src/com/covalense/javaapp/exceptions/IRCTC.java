package com.covalense.javaapp.exceptions;

public class IRCTC {

	void start() {
		String name = null;
		try {
			System.out.println("Start method");

			System.out.println("Division is :" + 10 / 0);

			System.out.println("Name is :" + name.length());

			System.out.println("end method");
		} catch (ArithmeticException e) {
			System.out.println("Don't divide by zero");
		} catch (NullPointerException n) {
			System.out.println("Can not be null");
		}

	}

}
