package com.intervi;

public class Test {

	public static void main(String[] args) {
		
		
		int a1[] = {40,50,55,70,60,45,30,58,66,80,20};

		int minimumvalue = a1[0];
		int maximum = a1[0];

		for(int i = 1; i<a1.length;i++) {
			
			if (a1[i]<minimumvalue) {
				
				minimumvalue =a1[i];
				
			} else if (a1[i]>maximum) {
				
				maximum = a1[i];
				
			}
			
		}
		
		System.out.println("maximum profit value "+maximum);
		
		System.out.println("Minimum profit value "+minimumvalue);
		
	}

}
