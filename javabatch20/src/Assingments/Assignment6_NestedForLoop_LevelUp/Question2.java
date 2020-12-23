package Assingments.Assignment6_NestedForLoop_LevelUp;

public class Question2 {

	public static void main(String[] args) {
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
//		1 2 3 4 5 6
//		1 2 3 4 5 6 7
		
		for(int i=7;i>1;i--) {
			System.out.print(1+" ");
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=7;i++) {
			System.out.print(1+" ");
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
