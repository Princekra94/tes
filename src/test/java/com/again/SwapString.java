package com.again;

public class SwapString {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "world";
		
		s1 = s1 + s2;
		
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		
		System.out.println("s1 value is= "+s1);
		System.out.println("s2 value is= "+s2);
		
		
		
		
	}

}
