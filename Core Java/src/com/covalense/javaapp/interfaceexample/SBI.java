package com.covalense.javaapp.interfaceexample;

public class SBI implements ATM {

	@Override
	public void validate() {

		System.out.println("validating SBI ATM card");
	}

	@Override
	public void getInfo() {

		System.out.println("Getting information of SBI Bank");
	}

}
