package day13_methods_part1;

public class CreditCardMethod {

	public static void main(String[] args) {
		
		double salary=5000;
		int creditRating=5;
		
		if(salary>=20000 && creditRating>=7) {
			qualify();		
			
		}else {
			noQualfy();
		}

	}

	public static void noQualfy() {
		System.out.println("Sorry, you are not qualified for CC");
		
	}

	public static void qualify() {
		System.out.println("Congrats! You are qualified for CC");
		
	}

}
