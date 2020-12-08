package day18_readingUserInputs;

import java.util.Scanner;

public class task72_SumNumbers {

	public static void main(String[] args) {
		// Write a program that ask user to enter 3 numbers and shows the total of numbers.
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number:");
		int num2 = scan.nextInt();
		System.out.println("Enter third number");
		int num3 = scan.nextInt();
		
		System.out.println("Total is:"+(num1+num2+num3));

	}

	

}
