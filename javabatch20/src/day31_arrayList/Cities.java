package day31_arrayList;
import java.util.*;

public class Cities {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		//Print each city by using for-each loop seperated by space
		
		for(String value : cities) {
			System.out.print(value+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		
		//Print each city by using for-iterator loop seperated by space
		
		for(int i=0;i<cities.size();i++) {
			System.out.print(cities.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		
		// Removing Baku
		
		cities.remove("Baku");
		
		cities.remove("New York"); //Although  there is no New York it doesnt give error but does nothing
		
		
		System.out.println(cities.toString());
		
		
		System.out.println("-------------------------------------");
		
		cities.add(0, "Arlington");
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());
		
		cities.add(2,"Ankara");
		System.out.println(cities.toString());
		System.out.println();
		System.out.println("-------------------------------------");
		
		int index = cities.indexOf("Istanbul");
		System.out.println(index);
		
		System.out.println(cities.indexOf("Bursa"));
		
		System.out.println();
		System.out.println("-------------------------------------");
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
		
		

	}

}
