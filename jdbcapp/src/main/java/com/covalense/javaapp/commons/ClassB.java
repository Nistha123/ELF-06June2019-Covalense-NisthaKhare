package com.covalense.javaapp.commons;

import lombok.extern.java.Log;

@Log
public class ClassB implements Connection{

	@Override
	public void printMessage() {
		log.info("Printing BBBBBBBBBBBB");
	}

}//end of class
