package day37_inheritance;

import java.util.Scanner;

public class FinalExamTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int questions;
		int missed;
		
		
		System.out.println("How many Questions are there in the Exam?: ");
		questions=scan.nextInt();
		
		System.out.println("How many Questions did you miss?: ");
		missed = scan.nextInt();
		
		FinalExam fe1 = new FinalExam(questions, missed);
		
		System.out.println("Grade for the exam is: "+fe1.getGrade());
		
		

	}

}
