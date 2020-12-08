package day33_classObject_constructors;

public class CarTest {

	public static void main(String[] args) {
		
		
		Car c1 = new Car(); //it is calling the constructor
							//which constrcutor u want me do execute?
							//i want to you execute, constructor which does not have any arguments

		Car c2 = new Car("Honda", "Civic", 2020, 5000, "red");
		Car c3 = new Car("BMW", "320", 2017, 3000, "blue");
		
		
		System.out.println(c1.make);
		System.out.println(c2.make);

	}

}
