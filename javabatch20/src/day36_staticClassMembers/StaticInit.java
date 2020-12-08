package day36_staticClassMembers;

public class StaticInit {
	
	static final int NUMS_SECONDS_PER_HOURS;

	static {
		System.out.println("Static init");
		int numPerMinute=60;
		int numPerHour=60;
		
		NUMS_SECONDS_PER_HOURS= numPerHour*numPerMinute;
	}
	
	private static int one;
	private static final int two;
	private static final int three=3;
	// private static final four;
	
	static {
		
		one=1;
		two=2;
		//three=4;
		//two=3;
		
	}
	
}
