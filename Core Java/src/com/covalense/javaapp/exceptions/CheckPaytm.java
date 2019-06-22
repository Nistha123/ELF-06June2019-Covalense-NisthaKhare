package com.covalense.javaapp.exceptions;


public class CheckPaytm extends PayTm {

	void check() {
		try {
			PayTm p = new PayTm();
			p.book();
		} catch (ArithmeticException e) {

			System.out.println("Dont divide integer by zero");
		}

	}
}
