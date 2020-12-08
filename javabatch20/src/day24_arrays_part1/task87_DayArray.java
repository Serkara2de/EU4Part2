package day24_arrays_part1;

import java.util.Scanner;

public class task87_DayArray {

	public static void main(String[] args) {

		
		String[] myArray = new String[7];
		
		myArray[0]= "Monday";
		myArray[1]= "Tuesday";
		myArray[2]= "Wednesday";
		myArray[3]= "Thursday";
		myArray[4]= "Friday";
		myArray[5]= "Saturday";
		myArray[6]= "Sunday";
		
		
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		System.out.println("Today is "+myArray[index]);

	}

}
