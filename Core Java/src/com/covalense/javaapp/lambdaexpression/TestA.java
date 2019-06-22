package com.covalense.javaapp.lambdaexpression;

interface fact {
	int fac(int a);
}
public class TestA {

	public static void main(String[] args) {
			
			fact fa = a -> {
				int k=1;
				for(int i=1 ; i<=a ; i++) {
					k=k*i;
				}
				return k;
			};
			
			int res = fa.fac(5);
			System.out.println("factorial is :" + res);
		
		

		
	}//End Of main

}//End Of class
