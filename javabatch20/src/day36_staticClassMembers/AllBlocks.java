package day36_staticClassMembers;

public class AllBlocks {


	public AllBlocks (int x) {
		System.out.println("One argument contructor");
	}
	
	
	public AllBlocks() {
		System.out.println("No argument contructor");
	}
	
	static {
		System.out.println("First static init");
	}
	
	{
		System.out.println("First instance init");
	}
	
	{
		System.out.println("Second instance init");
	}
	
	static {
		System.out.println("Second static init");
	}
	
	
	

	

}
