package day25_arrays_part2;

import java.util.Random;

public class task91_RandomArrayNumbers{

	public static void main(String[] args) {
		
//		Ø Create an array with 10 elements
//		Ø Initialize each array element with random values between 0 and 100 but less than 100 
//		Ø Print each array element

		
		Random rn = new Random();
		
		int[] array = new int[10]; 
		
//		array[0]= rn.nextInt(100);
//		array[1]= rn.nextInt(100);
//		array[2]= rn.nextInt(100);
//		array[3]= rn.nextInt(100);
//		array[4]= rn.nextInt(100);
//		array[5]= rn.nextInt(100);
//		array[6]= rn.nextInt(100);
//		array[7]= rn.nextInt(100);
//		array[8]= rn.nextInt(100);
//		array[9]= rn.nextInt(100);
		
		for(int i=0;i<array.length;i++) {
			
			array[i]=rn.nextInt(100);
			
		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

}
