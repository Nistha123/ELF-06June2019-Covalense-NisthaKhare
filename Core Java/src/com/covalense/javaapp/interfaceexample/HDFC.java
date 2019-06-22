package com.covalense.javaapp.interfaceexample;

public class HDFC implements ATM{

	@Override
	public void validate() {

		System.out.println("Validating HDFC card");
	}

	@Override
	public void getInfo() {

		System.out.println("Getting HDFC bank information");
	}

}
