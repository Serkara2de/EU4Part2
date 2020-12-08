package day22_stringManipulation_Lab;

public class Question10 {

	public static void main(String[] args) {
		
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));
	}
	
	
	public static boolean frontAgain(String str) {
		
		String firstTwo = str.substring(0, 2);
		String lastTwo = str.substring(str.length()-2);
		return firstTwo.equals(lastTwo);
	}

}
