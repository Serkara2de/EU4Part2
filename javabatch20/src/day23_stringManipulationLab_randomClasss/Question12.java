package day23_stringManipulationLab_randomClasss;

public class Question12 {

	public static void main(String[] args) {
		
		catDog("catdog");
		catDog("catcat");
		catDog("1cat1cadodogcatdog");

	}

	public static void catDog(String str) {
		
		int counterCat=0;
		for(int i=0;i<str.length()-2;i++) {
			if(str.substring(i, i+3).contentEquals("cat")) {
				counterCat++;
			}
		}
		
		int counterDog=0;
		for(int i=0;i<str.length()-2;i++) {
			if(str.substring(i, i+3).contentEquals("dog")) {
				counterDog++;
			}
		}
		
		if(counterCat==counterDog) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		//OORRRRRr
		int counterCat2=0,counterDog2=0;
		
		
		for(int i=0;i<str.length()-2;i++) {  
			
			
			if(str.substring(i, i+3).equalsIgnoreCase("cat")) {  
				counterCat2++;
			}
			if(str.substring(i, i+3).equalsIgnoreCase("dog")) {
				counterDog2++;
			}
			
		}
		
		if(counterCat2==counterDog2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
