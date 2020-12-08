package day13_methods_part1;

public class PassArguement {

	public static void main(String[] args) {
		
		displayValue(10);
		
		// veya
		int x=9;
		displayValue(x);
		displayValue(x*4);
				
	}

	public static void displayValue(int num) {
		System.out.println("The value is "+num);
		
	}

}
