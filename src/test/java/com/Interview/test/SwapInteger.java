package com.Interview.test;

public class SwapInteger {

	public static void main(String[] args) {

		int a = 10;
		int b = 20; 
		
//		int c = a+b;
//		
//		a = c-a;
//		
//		b = c-b;
//		
//		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);
		
	//Without using third variable
		
		a = a+b;
		
		b = a-b;
		
		a = a-b;
		
		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);
		
	}

}
