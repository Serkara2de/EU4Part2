package day16_classObjects;

public class DogObjects {

	public static void main(String[] args) {
		
		
		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		Dog dog3 = new Dog();
		
		
		dog1.name="Joe";
		dog1.age=5;
		dog1.breed="Rothweiler";
		dog1.color="white";
		
		System.out.println(dog1.age);
		System.out.println(dog1.name);
		System.out.println(dog1.breed);
		System.out.println(dog1.color)
		;
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		
		
		

	}

}
