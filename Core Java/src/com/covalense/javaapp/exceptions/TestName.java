package com.covalense.javaapp.exceptions;

public class TestName {

	public static void main(String[] args) {

		System.out.println("main method started");
		try {
			Name n = new Name();
			n.write("Nis");
		} catch (InvalidNameException i) {
			System.err.println(i.getMessage());
		}

		System.out.println("main method ended");
	}
}
