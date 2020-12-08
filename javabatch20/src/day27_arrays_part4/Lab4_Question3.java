package day27_arrays_part4;

public class Lab4_Question3 {

	public static void main(String[] args) {
//		Write a method that accepts 2 arrays and checks the lengths of the arrays first. 
//		If lengths are more than 1, 
//		it prints true if the arrays have the same first element or they have the same last element. 
//		If the length of the array is not more than 1, 
//		it prints the "array1 is not a valid array " or "array2 is not a valid array"
//		int[] x = {1,2,3}; = >true 
//		int[] y = {7,3};
//		int[] x1 = {1,2,3}; = >false 
//		int[] y1= {7,3,2};
//		int[] x2 = {1,2,3}; = > true 
//		int[] y2= {1,3};
//		int[] x3 = {1}; = > Array1 is not valid 
//		int[] y3= {7,3};
//		int[] x4 = {1,2,3}; = > Array2 is not valid 
//		int[] y4= {1};
		
		
				int[] x = {1,2,3}; 
				int[] y = {7,3};
				int[] x1 = {1,2,3}; 
				int[] y1= {7,3,2};
				int[] x2 = {1,2,3}; 
				int[] y2= {1,3};
				int[] x3 = {1}; 
				int[] y3= {7,3};
				int[] x4 = {1,2,3}; 
				int[] y4= {1};

				System.out.println(commonEnd(x3,y3));
	}

	public static String commonEnd(int[] arr1, int[] arr2) {
		if(arr1.length<=1) {
			return "Array1 is not valid";
		}else if(arr2.length<=1) {
			return "Array2 is not valid";
		}else {
			if(arr1[0]==arr2[0]) {
				return "true";
				
			}else {
				return "false";
			}
		}
		
		
	}

}
