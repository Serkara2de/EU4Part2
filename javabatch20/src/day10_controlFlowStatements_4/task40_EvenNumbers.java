package day10_controlFlowStatements_4;

public class task40_EvenNumbers {

	public static void main(String[] args) {
		// Write a program that displays all even numbers between 1-100 in same line
		
		for(int i=1;i<=100;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}
