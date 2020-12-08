package day13_methods_part1;

public class task_61_AgeCalculator {

	public static void main(String[] args) {
		
		int currentYear=2020;
		int birthYear=1977;
		ageCalculator(currentYear, birthYear);
		
		
		ageCalculator(2019, 1965);
		ageCalculator(2019, 1875);
		

	}
	
	public static void ageCalculator(int currentYear,int birthyear) {
		
		int age = currentYear - birthyear;
		
		System.out.println(age);
	


	}

}
