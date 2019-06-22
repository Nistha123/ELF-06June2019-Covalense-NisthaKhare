package com.covalense.javaapp.abstractapp;

public abstract class Pen {

	void draw() {
		System.out.println("I am a draw method");
	}

	abstract void write();

	abstract void color();
}//End of abstract class
