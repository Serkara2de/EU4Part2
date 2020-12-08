package day10_controlFlowStatements_4;

import java.util.Scanner;

public class task46_MultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		int num = scan.nextInt();
		
				
			System.out.println("Multiplication table for "+num);
			System.out.println("---------------------------");
		
			for(int i=1; i<=10;i++) {
				
				System.out.println(num+" X "+i+" = \t"+(i*num));
			}
		
		
	}

}
