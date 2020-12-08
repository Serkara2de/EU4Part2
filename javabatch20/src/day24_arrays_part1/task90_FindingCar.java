package day24_arrays_part1;

public class task90_FindingCar {

	public static void main(String[] args) {
		
		

//Ø	Create a car array that holds 6 car names inside
//Ø	Check if your array has the car name “Honda”
//Ø	If it is , print “ I found your car Honda in this array”
//Ø	If it is not, print “ I could not find your car Honda in this array”
		
		
String[] cars = {"Toyota","Nissan","BMW","Mercedes","Honda"};
		
//		boolean flag = false;
//		
//		for(int i=0;i<cars.length;i++) {
//			
//			
//			if(cars[i].equals("Honda")) {
//				
//				flag=true;
//				break;
//			}
//			
//		}
//		
//		if(flag) {
//			System.out.println("Found it");
//		}else {
//			System.out.println("Not found it ");
//		}

// ORRRRRRRRRR

	String selectedCar="Honda";
	
	switch(selectedCar){
	case "Honda": case "Toyota": case "Nissan": case "BMW": case "Mercedes": 
		System.out.println("I found your car "+selectedCar+" in this Array");
		break;
	default:
		System.out.println("I couldn't found your car "+selectedCar+" in this Array");
		
	}

	}

}
