package Assingments.Assignment5_forLoop;

public class Question3 {

	public static void main(String[] args) {
		// Write a program that displays the number of even numbers between 5 and 50 (included)
		
		int counter=0;
		for(int i=5;i<=50;i++) {
			if(i%2==0) {
				counter++;
				
			}
		}System.out.println(counter);

	}

}
