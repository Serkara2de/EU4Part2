package day10_controlFlowStatements_4;

import java.util.Scanner;

public class task45_RepeatedBiggerNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = scan.nextInt();
		System.out.println("Enter num2");
		int num2 = scan.nextInt();
		System.out.println("How many time will that repeat?");
		int repeat = scan.nextInt();
		
		for (int i=1;i<=repeat;i++) {
			
			if(num1>num2) {
				System.out.println("Num1 is bigger");
			}else if(num2>num1) {
				System.out.println("Num2 is bigger");
			}else {
				System.out.println("Numbers are equal");
			}
		}
	}

}
