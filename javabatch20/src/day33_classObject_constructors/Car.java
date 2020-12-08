package day33_classObject_constructors;

public class Car {

	String model;
	String make;
	int year;
	double mile;
	String color;
	
	
	//create constructor
	
	public Car() {
		
		model = "Honda";
		make  = "Civic";
		year  = 2020;
		mile  = 5000;
		color = "red";
		
	}
	
	
//	public Car(String mo, String ma, int yr, double ml, String co) {
//		model = mo;
//		make  = ma;
//		year  = yr;
//		mile  = ml;
//		color = co;
//	}


	public Car(String model, String make, int year, double mile, String color) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}



	public Car(String make, int year, String color) {
		
		this.make = make;
		this.year = year;
		this.color = color;
}
	
	
	
	
	
}
