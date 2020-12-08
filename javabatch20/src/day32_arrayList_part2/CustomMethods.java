package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		
		printList(numsList);
		
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum = sumList(doubleList);
		System.out.println(Math.round(sum));
		
		ArrayList<Integer> list = getList(25); 
		System.out.println(list.toString());
		
		ArrayList<Integer> rList = getRandomList(5);
		System.out.println(rList.toString());
		
		
		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		System.out.println(strnums);
		
		ArrayList<Integer> converted = convertToIntList(strnums);
		System.out.println(converted);
		
		

	}

public static ArrayList<Integer> convertToIntList(ArrayList<String> strList){
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(String str : strList) {
			
			newList.add(Integer.parseInt(str));
		}
		
		return newList;
	}
	

	public static ArrayList<Integer> getRandomList(int size) {
		Random rn = new Random();
		
		ArrayList<Integer> randomList = new ArrayList<>();
		
		for(int i=1;i<=size;i++) {
			
			randomList.add(rn.nextInt(101));
		}
		
		
		return randomList;
	}

	public static ArrayList<Integer> getList(int size) {
	
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int i=1;i<=size;i++) {
			
			newList.add(i);
		}
		
		return newList;
	}

	private static double sumList(ArrayList<Double> dList) {
	
		double sum =0;
		for( Double value : dList) {
			sum = sum+value;
		}
		return sum;
	}
	

	public static void printList(ArrayList<Integer> numsList) {
		
		System.out.println(numsList);
		
		for(Integer value : numsList) {
			System.out.println(value);
		}
		
	}

}
