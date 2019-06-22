package com.covalense.javaapp.interfaceexample;

public class ICICI implements ATM {

	public void validate() {
		
		System.out.println("validating ICICI card");
	}

	@Override
	public void getInfo() {

		System.out.println("Getting ICICI bank information");
	}
}
