package day13_methods_part1;

public class LoopCallMethod {

	public static void main(String[] args) {
		
		System.out.println("Hello from main method");
		for(int i=0;i<5;i++) {
			displayMessage();
			System.out.println("Back to main method");
		}

	}

	public static void displayMessage() {
		System.out.println("Hello from displayMessage method");
		
	}

}
