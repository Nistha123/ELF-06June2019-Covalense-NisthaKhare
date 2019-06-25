package com.covalense.javaapp.interfaceexample;

import lombok.extern.java.Log;

@Log
public class HDFC implements ATM{

	@Override
	public void validate() {

		log.info("Validating HDFC card");
	}

	@Override
	public void getInfo() {

		log.info("Getting HDFC bank information");
	}

}
