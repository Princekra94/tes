package com.Interview.test;

public class RemoveJunkFiles {

	public static void main(String[] args) {

		String s = "Y&&&ou**r Valu&&&e is not**** valuable";
		
		s = s.replaceAll("[^A-Za-z1-9 0]", "");
		System.out.println(s);
		
		
		
		
	}

}
