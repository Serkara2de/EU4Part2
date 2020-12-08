package day14_methods_part2;

public class task66_DistanceTraveled {

	public static void main(String[] args) {
//		The distance a vehicle travels can be calculated as follows: Distance = Speed * Time
//				Write a method named distance that accepts a vehicle’s speed and time as arguments, 
//				and return the distance the vehicle has traveled.

		
		double d = distance(40,5);
		
		System.out.println(distance(10,5));
		
		System.out.println(d);

		if(d>500) {
			System.out.println("you spent too much gas");
		}else {
			System.out.println("you spent ok gas");
		}
	}
	
	public static double distance(double speed,int time) {
		
		double distanceTraveled = speed * time;
		
		return distanceTraveled;
		
	}

}
