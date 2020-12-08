package day36_staticClassMembers;

public class CountableTest {

	public static void main(String[] args) {
		
		int objectCount;
		
		Countable obj1 = new Countable(); 
		Countable obj2 = new Countable(); 
		Countable obj3 = new Countable(); 
		Countable obj4 = new Countable();

		objectCount= obj1.getInstanceCount();
		objectCount= obj2.getInstanceCount();
		
		System.out.println(objectCount);
		System.out.println(obj1.getInstanceCount());
		System.out.println(obj2.getInstanceCount());
		
		System.out.println(Countable.instanceCount); // you can call also this way because of the static keyword in class
		
	}

}
