package day27_arrays_part4;

import java.util.Arrays;

public class Length {

	public static void main(String[] args) {
		
		
		int[][] numbers = {
				{1,2,3},
				{4,5},
				{6,7,8,9,12,34,56,66}
		};
		
		//Display the number of rows
		System.out.println(numbers.length);
		
		// display the number of columns in each row
		System.out.println(numbers[0].length);
		System.out.println(numbers[1].length);
		System.out.println(numbers[2].length);
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println("The number of columns in row "+i+" is "+numbers[i].length);
		}
		
		
		System.out.println("===========");
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
		}

	}

}
