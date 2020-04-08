package com.Interview.test;

import java.util.Arrays;

public class SecondHighestNumber2 {

	public static void main(String[] args) {

		int number[]={44,66,99,77,33,22,55,90,98,89,54};  

		Arrays.sort(number);

		int length = number.length;
		System.out.println(length);

		System.out.println("Second Highest Number = "+ number[number.length-2]);
		
		//System.out.println(Integer.MAX_VALUE);

	}

}
