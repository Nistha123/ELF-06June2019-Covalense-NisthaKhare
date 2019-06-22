package com.covalense.javaapp.inheritance;

public class Train {
	
	int num;
	String name;

	/*
	 * Train(int i , String s) { i = num; s = name; }
	 */
	void search(int i)
	{
		System.out.println("search the train through number " + i);
	}
	
	void search(String s)
	{
		System.out.println("search the train through name " + s);
	}

	public static void main(String[] args) {
		
		Train t = new Train();
		
		t.search(1222);
		t.search("Indiranagar");
		

	}

}
