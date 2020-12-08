package day33_classObject_constructors;

public class Student {
	
	
	String name;
	int age;
	char gender;
	int year;
	String course;
	String university= "Cybertek"; // default value cybertek
	
	
	
	
	public Student(String name, int age, char gender, int year, String course) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		
	}
	
	public void attandLecture() {
		System.out.println(name+" is attanding lecture");
	}
	
	
	public void submitAssignment() {
		System.out.println(name+ " is submitting assignment");
	}
	
	public void attendLab() {
		System.out.println(name+" is attending lab");
	}
	
	

}
