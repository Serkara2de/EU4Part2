package day34_Contructors;

public class Light {

	
	int numOfWatts;
	boolean indicator;
	String location;
	
	
	public Light() {
		this(0,false); // this()  //calling constructor with two parameters
		System.out.println("Returning from no-argument contructor No:1");
	}
	
	
	public Light(int watt, boolean ind) {
		this(watt, ind, "X");
		System.out.println("Returning from  contructor No:2");
		
	}


	public Light(int numOfWatts, boolean indicator, String location) {
		this.numOfWatts = numOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from  contructor No:3");
	}
	
	
	
	
	
	
}
