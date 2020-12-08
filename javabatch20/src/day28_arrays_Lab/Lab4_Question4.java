package day28_arrays_Lab;

public class Lab4_Question4 {

	public static void main(String[] args) {
//		Write a method that accepts an array and prints the sum of all elements in the array 
//		
//				int[] x = {1,2,3}; = > 6
//				int[] y = {5,11,2}; = > 18
//				int[] z = {7,0,0}; = > 7
//				int[] a = {3,-2,10,4}; = > 15
		
		int[] x = {1,2,3};
		int[] y = {5,11,2}; 
		int[] z = {7,0,0};
		int[] a = {3,-2,10,4};
		
		System.out.println(makeSum(x));
		System.out.println(makeSum(y));
		System.out.println(makeSum(z));
		System.out.println(makeSum(a));

	}
	
	public static int makeSum(int[] arr) {
		int sum=0;
		for(int value : arr ) {
			sum=sum+value;
		}return sum;
	}

}
