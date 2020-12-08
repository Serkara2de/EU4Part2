package day09_controlFlowStatements_3;

import java.util.Scanner;

public class task38_DaySelector {

	public static void main(String[] args) {
//		Write a program to display days:
//			1-Monday
//			2-Tuesday
//			3-Wednesday
//			4-Thursday
//			5-Friday
//			6-Saturday
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of day between 1-7");
		
		int day = scan.nextInt();
		if(day>=1&& day<=7) {
			
		
			switch(day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		
			}
		}else {
			System.out.println("Invalid input");
		}
	}

}
