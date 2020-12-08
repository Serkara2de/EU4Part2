package day13_methods_part1;

public class task_63_calculateCelcius {

	public static void main(String[] args) {
		// Write a function that accepts Fahrenheit and displays the Celcius in the console.
		// Sample Output: calculateCelcius(32) -- > 0 
		//				  calculateCelcius(50) --> 10
		// formular (52 °F − 32) × 5/9=Celcius
		
		calculateCelcius(52);
		
		// veya
		
		int fahrenheit = 40;
		calculateCelcius(fahrenheit);
		
	}

	public static void calculateCelcius(int i) {
		double celcius= (i-32)*5/9;
		System.out.println(i+" F = "+celcius+" C");
		
	}

}
