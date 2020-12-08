package day22_stringManipulation_Lab;

public class Question6 {

	public static void main(String[] args) {
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("Java"));
		System.out.println(withoutEnd("coding"));

	}

	public static String withoutEnd(String str) {
		if(str.length()>2) {
			return str.substring(1, str.length()-1);
		
		}else {
		
		return "Invalid input";
		}
		
	}

}
