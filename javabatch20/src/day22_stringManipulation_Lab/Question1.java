package day22_stringManipulation_Lab;

public class Question1 {

	public static void main(String[] args) {
		
		String name ="Serkan";
		
		helloName(name);
		System.out.println(helloName(name));

	}

	public static String helloName(String str) {
		
		
		return "Hello ".concat(str).concat("!");
		
		
	}

}
