package day13_methods_part1;

public class PassMultipleArguements {

	public static void main(String[] args) {
		
		int x=90, y=10;
		showSum(x,y);
		showSum(5,10);
		showSum(4,8);
		showSum(500,10);
		showSum(600,100);
		

	}

	public static void showSum(int num1, int num2) {
		
		System.out.println(num1+num2);
	}

}
