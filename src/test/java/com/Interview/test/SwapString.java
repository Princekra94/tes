package com.Interview.test;

public class SwapString {

	public static void main(String[] args) {

		String t1 = "Hello";
		String t2 = "World";
		
		System.out.println("String before swaping");

		System.out.println("/n Before swaping T1 :: "+ t1);
		System.out.println("/n Before swaping T2 :: "+ t2);
		
		
		t1 = t1+t2;
		
		t2 = t1.substring(0, t1.length()-t2.length());
		t1 = t1.substring(t2.length());
		
		
		
		System.out.println("/n After swaping T1 :: "+ t1);
		System.out.println("/n After swaping T2 :: "+ t2);
		
		
		
		
		
		
		
	}

}
