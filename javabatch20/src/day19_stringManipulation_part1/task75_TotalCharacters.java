package day19_stringManipulation_part1;

import java.util.Scanner;

public class task75_TotalCharacters {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		
		String name = scan.nextLine();
		
		System.out.println("Enter your last name");

		String lastName = scan.nextLine();
		
		System.out.println(name.length()+lastName.length());
	}

}
