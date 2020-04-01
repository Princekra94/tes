package com.Interview.test;

public class SecondSmallestNumber2 {

	public static int getSecondSmallest(int arr[]) {

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for(int i =0;i<arr.length;i++) {

			if (arr[i] < smallest) {
				smallest = arr[i];
			}
			if(arr[i] > smallest && arr[i] < secondSmallest ) {
				secondSmallest = arr[i];
			}
		}

		return secondSmallest;

	}

	public static void main(String[] args) {
		int arr[] = {-1, 70, 10, 34, 18, 78};
		int result = getSecondSmallest(arr);
		System.out.println(" Second smallest number " + result);

	}



}
