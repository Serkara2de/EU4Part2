package day19_stringManipulation_part1;

public class task78_CountHowMany {

	public static void main(String[] args) {
//		Write a program to count the number of occurrences for specific char
//		String word = "abcabqcabc” Number of a in this string is: 3
		
		
		String str = "abcabqcabc";
		char myChar= 'q';
		
		int counter=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==myChar) {
				counter++;
			}
		}
		System.out.println("Number of a in this string is: "+counter);

	}

}
