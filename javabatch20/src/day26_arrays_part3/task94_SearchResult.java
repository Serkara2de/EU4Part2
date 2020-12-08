package day26_arrays_part3;

import java.util.Arrays;

public class task94_SearchResult {

	public static void main(String[] args) {
//		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
//		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
//		Create a password based on given info. 
//		
//		Output: CD132G00ABC!
		
		// benim yol
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
		
//		String arr1[] = info1.split("This info is used for creation password : xxx");
//		String passPart1 = arr1[1].substring(0, 6);
//		System.out.println(passPart1);
//		
//		String arr2[] = info2.split("This info is used for creation password : xxx");
//		String passPart2 = arr2[1].substring(0, 6);
//		System.out.println(passPart2);
//		
//		String finalPass= passPart1.concat(passPart2);
//		System.out.println(finalPass);
		
		
		String[] infoArray1 = info1.split("password :");
		String[] infoArray2 = info2.split("password :");
		
		System.out.println(Arrays.toString(infoArray1));
		
		
		String pass1 = infoArray1[1].split(". Please")[0];
		
		System.out.println(Arrays.toString(infoArray1[1].split(". Please")));
		
		
		String pass2 = infoArray2[1].split(". Please")[0];
		
		pass1 = pass1.substring(4, 10);
		pass2 = pass2.substring(4, 10);
		
		
		System.out.println(pass1.trim() + pass2.trim());

	}

}
