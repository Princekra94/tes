package com.Interview.test;

public class HighLowValueInArray {

	public static void main(String[] args) {

		int num[] = {-98,-111, 890,78,65,456,78,2 ,0,78};


		int high = num[0];
		int low = num[0];

		

		for(int i = 1; i<num.length;i++)
		{
			if (num[i]>high) {
				high = num[i];

			} else if (num[i]<low) {
				low=num[i];
			}

		}
		System.out.println("The Highest number is :: "+ high);
		System.out.println("The Lowest number is :: "+ low);


	}

}
