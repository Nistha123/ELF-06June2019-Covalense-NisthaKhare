package com.covalense.javaapp.assignmentfive;

public class PrgmSevenTest {

	public static void main(String[] args) {
		
		PrgmSevenCustomException p = new PrgmSevenCustomException();
		
		try {
			p.check("Shreya");
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
	}
}
