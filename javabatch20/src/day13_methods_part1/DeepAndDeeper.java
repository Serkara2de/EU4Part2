package day13_methods_part1;

public class DeepAndDeeper {

	public static void main(String[] args) {
		
		System.out.println("Starting with main method");
		deep();
		System.out.println("Back in main method");

	}

	public static void deep() {
		System.out.println("Now in deep method");
		deeper();
		System.out.println("Back in deep method");
		
	}

	public static void deeper() {
		System.out.println("Now in deeper method");
		
	}

}
