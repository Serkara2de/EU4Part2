package day19_stringManipulation_part1;

public class String_charAt {

	public static void main(String[] args) {
		
		String str = "Computer";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(7));
		
		
		//Check if first character is 'a'
		
		String str2 = "Apple";
		
		if(str2.charAt(0)=='A') {
			System.out.println("A is first character");
		}else {
			System.out.println("A is not first character");
			
			
		}
		
		//Check if first and last characters are same 
				String word3 = "civic"; 
				
				char first = word3.charAt(0);  //apple //my name is ozzzy  //ab  
				char last = word3.charAt(4);
				
				if(first==last) {
					System.out.println("First and last match");
				}else {
					System.out.println("First and last no match");
				}
				
				
				//last index not hard coded.
				String word4 = "Java Script";
				
				char lastChar = word4.charAt(word4.length()-1);
				
				System.out.println("Last char of " + word4 + " is " + lastChar);
				
				
				

	}

}
