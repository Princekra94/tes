package com.Interview.test;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {

		int number[]={44,66,99,77,33,22,55,90,98,89,54};  
		
		int len = number.length;
		
		Arrays.parallelSort(number);
		
		System.out.println("Second smallest number is = " + number[1]);
		
	}

}
