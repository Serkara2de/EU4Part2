package day24_arrays_part1;

import java.awt.Window;
import java.util.Scanner;

public class task86_MonthArray {

	public static void main(String[] args) {
	
		
		String[] myArray = new String[12];
		
		myArray[0]= "January";
		myArray[1]= "February";
		myArray[2]= "March";
		myArray[3]= "April";
		myArray[4]= "May";
		myArray[5]= "June";
		myArray[6]= "July";
		myArray[7]= "August";
		myArray[8]= "September";
		myArray[9]= "October";
		myArray[10]= "November";
		myArray[11]= "December";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a month index: ");
		int index = scan.nextInt();
		System.out.println("The name of the month is: "+myArray[index]);
				
		

	}

}
