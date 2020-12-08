package Assignment6_NestedForLoop_LevelUp;

public class Question6 {

	public static void main(String[] args) {
		int k=0;
		int row=5;
		
		for(int i=1;i<=row;i++) {
			
			k=i;
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(k+" ");
				
				k=k+row-j;
				
				// k = 2 + 5 - 1 = 6
				
				// k = 3 + 5 - 1 = 7
				// k = 7 + 5 - 2 = 10
				
			}
			
			System.out.println();
		}

	}

}
