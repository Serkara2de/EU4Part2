package day28_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question5 {

	public static void main(String[] args) {
//		Write a method that accepts an array and prints an array with the elements "rotated left”
//		int[] x = {1,2,3}; = > [2,3,1]
//		int[] y = {17,12,10,8}; = > [12,10,8,17] 
//		int[] a = {7,0,0}; = > [0,0,7]
		
		
		int[] x = {1,2,3}; 
		int[] y = {17,12,10,8}; 
		int[] a = {7,0,0}; 
		System.out.println(Arrays.toString(rotateLeft(y)));

	}
	
	public static int[] rotateLeft(int[] arr) {
		
		int x = arr[0]; //1
		
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = x;
		
		return arr;
		
	}
}
