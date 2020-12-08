package day13_methods_part1;

import java.util.Scanner;

public class task_62_greatestNumber {

	public static void main(String[] args) {
		// Write a method that accepts 3 numbers and displays the greatest one in the console.
		// Sample Output: calculateGreatest(5,2,3) -- >5
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first number: ");
		int num1 =scan.nextInt();
		System.out.println("Input second number: ");
		int num2 =scan.nextInt();
		System.out.println("Input third number: ");
		int num3 = scan.nextInt();
		
		calculateGreatest(num1, num2, num3);
	}

	public static void calculateGreatest(int num1, int num2, int num3) {
		
		if(num1>num2 && num1>num3) {
			System.out.println("Greatest Number is : "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("Greatest Number is : "+num2);
		}else {
			System.out.println(num3);
		}
	}

}
