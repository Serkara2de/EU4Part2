package day23_stringManipulationLab_randomClasss;

public class Question13 {

	public static void main(String[] args) {
		
		
		doubleChar("The");
		doubleChar("AAbb");
		doubleChar("Hi-There");

	}

	public static void doubleChar(String str) {
		
		String newString="";
		for(int i=0;i<str.length();i++) {
			newString=newString+str.substring(i, i+1).concat(str.substring(i, i+1));
			
		}
		System.out.println(newString);
	}

}
