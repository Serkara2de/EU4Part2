package day11_controlFlowStatements_5;

public class task49_pattern {

	public static void main(String[] args) {
//		Write a Java program to create a stair step pattern #
//		# 
//		 #
//		  # 
//		   #
//		    #
		
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}System.out.println("#");
			
		}

	}

}
