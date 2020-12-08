package day31_arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// Languages
		//print the size of ArrayList
		// Read couple of elements
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("English");
		languages.add("German");
		languages.add("Russian");
		languages.add("Chinese");
		
		
		System.out.println(languages.get(0));
		System.out.println(languages.get(3));
		
		System.out.println(languages.toString());
		System.out.println("Size of The ArrayList: "+languages.size());
		
		languages.add("Turkish");
		System.out.println(languages.toString());
		System.out.println("Size of the ArrayList "+languages.size());
		
		languages.remove(0);
		System.out.println(languages.toString());
		System.out.println("Size of the ArrayList "+languages.size());
		

		
		

	}

}
