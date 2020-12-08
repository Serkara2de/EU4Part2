package day20_stringManipulation_part2;

public class String_Replace {

	public static void main(String[] args) {
		
		String str = "Moscow is capital of Russia";
		
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbajian");
		System.out.println(str);
		
		
		String email = "firstName_lastName@gmail.com";
		String company ="capitalone";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
		System.out.println(email);
	}

}
