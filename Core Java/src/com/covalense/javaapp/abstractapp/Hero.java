package com.covalense.javaapp.abstractapp;

import lombok.extern.java.Log;

@Log
public class Hero extends Honda{

	@Override
	void design() {

		log.info("I am a design method");
	}

	
}
