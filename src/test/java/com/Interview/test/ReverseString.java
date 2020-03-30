package com.Interview.test;

public class ReverseString {

	public static void main(String[] args) {

		String s = "This is my Program";
		
		int lenght = s.length();
		
		String rev = "";
		
		
		for(int i = lenght-1; i>=0; i--)
			
		{
			rev = rev+s.charAt(i);
		}
		
		
		System.out.println(rev);
		
		
		
		
		
		
		
		
		
		
	}

}
