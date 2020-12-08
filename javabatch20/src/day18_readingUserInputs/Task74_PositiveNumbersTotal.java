package day18_readingUserInputs;

import java.util.Scanner;

public class Task74_PositiveNumbersTotal {

	public static void main(String[] args) {
		// Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
		int num;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		
		
		do {
			System.out.println("Enter a number:");
			num = scan.nextInt();
			if(num<0) {
				break;
			}else {
			sum=sum+num;
			}
			
			
			
		}while(true);
		
		System.out.println(sum);
		
		
		
	}

}
