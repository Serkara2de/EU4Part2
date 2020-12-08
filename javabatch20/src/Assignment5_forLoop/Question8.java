package Assignment5_forLoop;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
//		Write a program to calculate the sum of the numbers from 1 till upper bound.
//		If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
//		If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
//		If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
//
//		You should use a while loop.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int upperBound = scan.nextInt();
		int num=1;
		int sum=0;
		while(num<=upperBound) {
			sum=sum+num;
			num++;
			
			
		}
		System.out.println("Sum of the numbers from 1 to " + upperBound + " is: " + sum);
		
	}

}
