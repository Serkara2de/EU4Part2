package day14_methods_part2;

public class Lab1_StringTimes {

	public static void main(String[] args) {
//		Write a method that accepts a string and a non-negative number, 
//		and prints a larger string that is number copies of the original String
//
//		stringTimes("Hi", 2); = > HiHi
//		stringTimes("Hi", 3); = > HiHiHi
//		stringTimes("Hi", 1); = > Hi
		
		stringTimes("Hi", 5);
		
	}

	public static void stringTimes(String string, int num) {
		
		for(int i=1;i<=num;i++) {
			System.out.print(string);
		}
		
		
//		OORR
//		String str = "";
//		
//		for(int i=0;i<number;i++) {
//			
//			str = str + string;   
//			
//		}
//		System.out.println(str);
//		
	}

}
