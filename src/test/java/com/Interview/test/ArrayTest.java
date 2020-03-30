package com.Interview.test;

public class ArrayTest {

	public static boolean main(String[] args) {


		int[] x = {5,2,3,7,10};

		int sumValue = x[0];

		int len = x.length;

		for(int i =1; i<len; i++)
		{

			sumValue = sumValue+i;

			if(sumValue==10){

				return true;
			}



		}
		return false;





	}

}
