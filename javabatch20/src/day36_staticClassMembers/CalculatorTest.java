package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		double result = Calculator.plus(55, 7); //static way
		System.out.println("Result: "+result);
		
		
		
		// İkinci yolu
		
		
		Calculator c = new Calculator(); //creating new object
		
		System.out.println("Result: "+c.plus(55, 7));

		// static way' a ait örnekler
		int i = Integer.parseInt("5");
		System.out.println(Character.isDigit('5'));
		
		
		// Aynı class'ta ise direk method adı ile çağırılır. Ya da aşağıdaki gibi 3 şekilde çağırılır.
		
		CalculatorTest.m1();
		
		CalculatorTest C1 = new CalculatorTest();
		C1.m1();
		
		m1();
		
	}
	
	
	public static void m1() {
		System.out.println("Hello");
	}
	
	
	

}
