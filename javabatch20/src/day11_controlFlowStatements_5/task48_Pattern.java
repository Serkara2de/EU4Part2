package day11_controlFlowStatements_5;

public class task48_Pattern {

	public static void main(String[] args) {
//		Write a Java program to create pattern
//		*
//		**
//		*** 
//		**** 
//		***** 
//		****** 
//		*******
		
		for(int i=0;i<=6;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
