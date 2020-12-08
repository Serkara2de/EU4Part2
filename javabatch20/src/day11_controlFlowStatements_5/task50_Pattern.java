package day11_controlFlowStatements_5;

public class task50_Pattern {

	public static void main(String[] args) {
//		Write a Java program to create pattern 
//		1
//		12
//		123
//		1234 
//		12345
		
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}

	}

}
