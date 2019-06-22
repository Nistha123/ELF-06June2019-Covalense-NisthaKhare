package com.covalense.javaapp.abstractapp;

public class Marker extends Pencil {

	@Override
	void write() {
		System.out.println("Marker write method");
	}

	@Override
	void color() {

		System.out.println("Marker color method");
	}

}//End of class
