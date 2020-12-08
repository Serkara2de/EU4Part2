package day13_methods_part1;

public class task_58_greaterNumber {

	public static void main(String[] args) {
		
		greaterNumber();

	}

	public static void greaterNumber() {
		
		int num1=3, num2= 5;
		if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
		}else if(num2>num1){
			System.out.println(num2+" is greater than "+num1);
		}else {
			System.out.println("Numbers are equal");
			
		}
		
	}

}
