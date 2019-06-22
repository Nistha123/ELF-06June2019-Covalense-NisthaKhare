package com.covalense.javaapp.passingobjects;

public class TestWater {

	public static void main(String[] args) {

		Bottle b = new Bottle();
		
		Drinker d = new Drinker();
		
		d.recieve(b);
	}

}
