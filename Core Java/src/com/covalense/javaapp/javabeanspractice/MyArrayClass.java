package com.covalense.javaapp.javabeanspractice;

public class MyArrayClass {

	private Object[] myArray;
	private int index;

	public MyArrayClass() {

		this(10);
	}

	public MyArrayClass(int size) {

		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should be greater than zero....");
		}
		this.myArray = new Object[10];
		index=0;
	} // End of constructor

	public void add(Object val) {
		if(index > myArray.length) {
			Object[] myNewArray = new Object[20];
			System.arraycopy(myArray, 0 , myNewArray, 0 , myArray.length);
			myArray=myNewArray;
		} 

		myArray[index] = val;
		index++;

	}// End of add()
	
	public int getize() {
		return index-1;
	}

	public void remove(int position) {

		if (position > myArray.length - 1) {
			throw new ArrayIndexOutOfBoundsException("position can not be greater than array size");
			
			
		}

		myArray[position] = null;

		System.arraycopy(myArray, position + 1, myArray, position, myArray.length - 1 - position);
	}

	public Object get(int position) {

		return myArray[position];

	}

}// End of class
