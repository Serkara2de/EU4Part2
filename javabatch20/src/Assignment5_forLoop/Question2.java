package Assignment5_forLoop;

public class Question2 {

	public static void main(String[] args) {
		// Write a program that displays all odd numbers between 3-130 in the same line
		
		for(int i=3;i<=130;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
	}

}
