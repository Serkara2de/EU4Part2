package day18_readingUserInputs;

import java.util.Scanner;

public class task73_guessingGame {

	public static void main(String[] args) {
//		Write a guessing game where the user has to guess a secret number between 1-20. 
//		After every guess, the program tells the user whether their number was too large or too small. 
//		The program will keep asking the user to enter the number until he finds the correct number.
//		When the correct answer is found, the program will display "Congrat,you got it"
		
		int number=5;
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		
	
		do {
			
			num=scan.nextInt();
			
			if(num<number) {
				System.out.print("Enter a bigger number:");
			}else if(num>number) {
				System.out.print("Enter a smaller number:");
			}else {
				System.out.print("Congrat you got it...");
			}
			
			
			
		}while(num!=number);

	}

}
