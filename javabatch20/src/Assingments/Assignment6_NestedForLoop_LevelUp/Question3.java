package Assingments.Assignment6_NestedForLoop_LevelUp;

public class Question3 {

	public static void main(String[] args) {
//		1 2 3 4 5 6 7
//		 2 3 4 5 6 7
//		  3 4 5 6 7
//		   4 5 6 7
//		    5 6 7
//		     6 7
//		      7
//		     6 7
//		    5 6 7
//		   4 5 6 7
//		  3 4 5 6 7
//		 2 3 4 5 6 7
//		1 2 3 4 5 6 7
		
for(int i=1;i<=7;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k<=7;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=6;i>=1;i--) {
			
			for(int j=i;j>1;j--) {
				System.out.print(" ");
			}
			
			for(int k=i;k<=7;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}


	}

}
