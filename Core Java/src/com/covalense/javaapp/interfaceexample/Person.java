package com.covalense.javaapp.interfaceexample;

public class Person implements Animal,Human{

	@Override
	public void walk() {
		System.out.println("human Walk");
		
	}

	@Override
	public void eat() {

		System.out.println("Animal eat");		
	}

	
}
