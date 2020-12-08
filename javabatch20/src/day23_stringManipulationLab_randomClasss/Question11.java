package day23_stringManipulationLab_randomClasss;

public class Question11 {

	public static void main(String[] args) {
		
		countHi("abc hi ho");
		countHi("ABChi hi");
		countHi("hihihi");

	}

	public static void countHi(String str) {
		int counter=0;
		for(int i=0;i<str.length()-1;i++) {
			if(str.substring(i, i+2).equals("hi")){
				counter++;
				
			}
			
		}System.out.println(counter);
		
	}

}
