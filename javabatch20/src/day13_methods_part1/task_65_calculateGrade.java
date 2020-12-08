package day13_methods_part1;

public class task_65_calculateGrade {

	public static void main(String[] args) {
		
		calculateGrade(50,50,50);
		

	}

	public static void calculateGrade(int i, int j, int k) {
		double average=(i+j+k)/3;
		
		if(average>=90 && average<=100) {
			System.out.println("A");
		}else if(average>=80 && average<=89) {
			System.out.println("B");
		}else if(average>=70 && average<=79) {
			System.out.println("C");
		}else if(average>=60 && average<=69) {
			System.out.println("D");
		}else if(average>=0 && average<=59) {
			System.out.println("F");
		}
		
	}

}
