package com.again;

public class ReverseInt {

	public static void main(String[] args) {

		int num = 789654;
		
		
		int rev = 0;
		
		
		while (num!=0) {
			
			rev = rev*10+num%10;
			num=num/10;
			
		}
		
		System.out.println(rev);
		
		
	}

}
