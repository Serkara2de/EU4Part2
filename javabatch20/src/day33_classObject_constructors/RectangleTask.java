package day33_classObject_constructors;

public class RectangleTask {

	public static void main(String[] args) {
		
		
		Rectangle R1 = new Rectangle();
		
		System.out.println(R1.length); //Who is giving me default values
		System.out.println(R1.width);
		
		R1.length = 5.4;
		R1.width = 3.2;
		
		R1.getArea();
		
		Rectangle R2 = new Rectangle();
		
		R2.length = 2.7;
		R2.width = 12.5;
		
		R2.getArea();
				
		

	}

}
