package com.covalense.javaapp.interfaceexample;

public class TestDrive {

	public static void main(String[] args) {

		Browser b = new Browser();

		Gmail g = new Gmail();

		GDrive d = new GDrive();

		b.open(d);
	}

}
