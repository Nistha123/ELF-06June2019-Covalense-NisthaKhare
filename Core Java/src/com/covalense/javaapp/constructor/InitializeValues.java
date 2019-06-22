package com.covalense.javaapp.constructor;

public class InitializeValues {
	
	String name;
	int age;
	double percentage;
	
	InitializeValues(String name, int age, double percentage)
	{
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	
	void display()
	{
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("percentage is " + percentage);
	}

}
