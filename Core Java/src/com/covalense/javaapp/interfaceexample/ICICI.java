package com.covalense.javaapp.interfaceexample;

import lombok.extern.java.Log;

@Log
public class ICICI implements ATM {

	public void validate() {
		
		log.info("validating ICICI card");
	}

	@Override
	public void getInfo() {

		log.info("Getting ICICI bank information");
	}
}
