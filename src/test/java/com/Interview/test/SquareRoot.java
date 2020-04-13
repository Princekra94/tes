package com.Interview.test;

public class SquareRoot { 

	public static double squareRoot(int number) {
		double temp;

		double sr = number / 2;

		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
			System.out.println(sr);
			System.out.println(temp);

		} while ((temp - sr) != 0);

		return sr;

	}

	public static void main(String[] args)  
	{ 
		System.out.print("Enter any number:" + squareRoot(49));
		//		Scanner scanner = new Scanner(System.in);
		//		int num = scanner.nextInt(); 
		//		scanner.close();
		//
		//		System.out.println("Square root of "+ num+ " is: "+squareRoot(num));




	} 
}
