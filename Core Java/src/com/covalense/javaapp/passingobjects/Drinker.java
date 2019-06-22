package com.covalense.javaapp.passingobjects;

public class Drinker {

	void recieve(Bottle b)
	{
		b.open();
		b.drink();
	}
}
