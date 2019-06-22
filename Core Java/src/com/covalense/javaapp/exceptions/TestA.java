package com.covalense.javaapp.exceptions;

public class TestA {

	public static void main(String[] args) {

		System.out.println("main method started");
		CheckPaytm c = new CheckPaytm();

		c.check();

		System.out.println("main method ended");
	}
}
