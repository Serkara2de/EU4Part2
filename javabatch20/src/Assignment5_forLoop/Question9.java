package Assignment5_forLoop;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
//		Write a program for the following logic:
//			Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
//			if end = 10, OUTPUT = 1, 3, 5, 7, 9
//			if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
//
//			You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number:");
			int end = scan.nextInt();
			int first=1;
			while(first<end) {
				if(first % 2 != 0){
			        System.out.print(first);
			        
			        //Logic to add comma
			        if(end % 2 == 0){ //If end is an even number
			            if(first != (end - 1)) { //check to not add , after printing last number
			            	 System.out.print(",");
			            }
			        } else { //If end is an odd number
							if(first != end) { //check to not add , after printing last number
								System.out.print(",");
							}
			        }
			    }
			    first++;
			}
			
	}

}
