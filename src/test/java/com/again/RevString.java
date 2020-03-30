package com.again;

public class RevString {

	public static void main(String[] args) {

		String s = "Selenium";
		
		int lenght = s.length();
		String rev = "";
		
		
		for (int i = lenght-1; i >=0; i--) {
			
			
			rev = rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
	}

}
