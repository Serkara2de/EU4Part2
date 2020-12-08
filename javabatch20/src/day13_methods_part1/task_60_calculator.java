package day13_methods_part1;

public class task_60_calculator {

	public static void main(String[] args) {
		
		calculator(6, 3, "+");
		calculator(6, 3, "-");
		calculator(6, 3, "*");
		calculator(6, 3, "/");

	}

	private static void calculator(int num1, int num2, String operator) {
		switch (operator) {
		
		case "+":
			System.out.println(num1+num2);
		break;
		
		case "-":
			System.out.println(num1-num2);
		break;
		
		case "*":
			System.out.println(num1*num2);
		break;
		
		case "/":
			System.out.println(num1/num2);
		break;
		
		default:
			System.out.println("Invalid operator");
		break;
		}
		
		//VEYAA
		
		if(operator.equals("+")){
			System.out.println(num1+num2);
		}else if(operator.equals("-")){
			System.out.println(num1-num2);
		}else if(operator.equals("*")){
			System.out.println(num1*num2);
		}else if(operator.equals("/")){
			System.out.println(num1/num2);
		}else {
			System.out.println("Invalid operator");
		}
		
	}

}
