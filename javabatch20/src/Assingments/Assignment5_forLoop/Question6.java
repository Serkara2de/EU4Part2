package Assingments.Assignment5_forLoop;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
//		Write a program to print Fibonacci series of n terms where n is declared by user : 
//			0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		int result = 0;
		
		
		int pre1 = 0, pre2 = 1;
		System.out.println("Fibonacci Series of "+num+" numbers:");
		
		System.out.print(pre1 + " ");
		
		for (int i = 1; i <= num; i++){
		    
			System.out.print(pre2 + " ");
			
		/* On each iteration, we are assigning second number to the first number and 
		 * assigning the sum of last two
		 * numbers to the second number*/
			
		   int sumOfPrevTwo = pre1 + pre2;
		   pre1 = pre2;
		   pre2 = sumOfPrevTwo;
		   
		}
	}

}
