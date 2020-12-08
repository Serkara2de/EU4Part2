package day13_methods_part1;

public class task_64_printPattern {

	public static void main(String[] args) {
//		Write a program that accepts a number and print the star patterns according to that number
//		Sample Output: printPattern(5);
//	*
//	**
//	***
//	****
//	*****
		
		printPattern(7);

	}

	public static void printPattern(int number) {
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
			
		}
		
	}

}
