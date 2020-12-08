package day09_controlFlowStatements_3;

import java.util.Scanner;

public class task39_TrafficLightSelector {

	public static void main(String[] args) {
//		Write a program to display traffic light colors using following logic:
//			if code (R/r)-->"Red"
//			if code (O/o)-->"Orange"
//			if code (G/g)-->"Green
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the first letter of the color");
		String c = scan.next();
		
		switch (c) {
		case "R": case"r":
			System.out.println("Red");
			
			break;
		case "O": case "o":
			System.out.println("Orange");
			break;
			
		case "G": case "g":
			System.out.println("Green");
		
		}
		
				

	}

}
