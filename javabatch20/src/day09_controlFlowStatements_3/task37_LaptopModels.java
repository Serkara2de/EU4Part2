package day09_controlFlowStatements_3;

import java.util.Scanner;

public class task37_LaptopModels {

	public static void main(String[] args) {
//		Write a program that lets user to enter apple,dell,acer laptop models
//		If it is apple show “Apple-no virus”
//		If it is dell show “Tough one”
//		If it is acer show “Not recommended”
//		Else “do not buy that one!”
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the model of Laptop you want to buy");
		String str= scan.nextLine();
		
		switch(str) {
		case "apple":
			System.out.println("Apple-no virüs");
			break;
		case "dell":
			System.out.println("Tough one");
			break;
		case "acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("do not buy that one");
			break;
		}

	}

}
