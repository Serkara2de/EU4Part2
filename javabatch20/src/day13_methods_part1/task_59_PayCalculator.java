package day13_methods_part1;

public class task_59_PayCalculator {

	public static void main(String[] args) {
		
		int hour=15;
		double hourlyPay=12;
		payCalculator(hour,hourlyPay);

	}

	public static void payCalculator(int hour, double hourlyPay) {
		double pay=hour*hourlyPay;
		
		System.out.println("Your today's payment is: "+pay+" €");
		
	}

}
