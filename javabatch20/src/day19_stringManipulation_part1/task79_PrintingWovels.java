package day19_stringManipulation_part1;

public class task79_PrintingWovels {

	public static void main(String[] args) {
//		Write a program to print only vowel (a,e,o,i,u) in given string 
//		String word = "CybertekSchool";
//		Output: e,e,o,o

		
		String str = "CybertekSchool";
		
		for(int i=0;i<str.length();i++) {
			char letter= str.charAt(i);
			if(letter=='a' || letter=='e' || letter=='o' || letter=='i' ||letter=='u') {
				System.out.print(letter);
				if( i != str.length()-2) {
					System.out.print(",");
				}
			}
		}
	}

}
