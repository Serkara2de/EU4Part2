package day22_stringManipulation_Lab;

public class Question3 {

	public static void main(String[] args) {
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("Ab"));
		System.out.println(extraEnd("Hi"));

	}

	public static String extraEnd(String str) {
		 
		if(str.length()<2) {
			System.out.println("Invalid String");
		}
		
		String str2 = str.substring(str.length()-2);
		
		return str2+str2+str2;
	}

}
