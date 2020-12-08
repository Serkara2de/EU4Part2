package day23_stringManipulationLab_randomClasss;

public class Question14 {

	public static void main(String[] args) {
		
		
		endsLy("oddly");
		endsLy("y");
		endsLy("oddy");
		
	}

	public static void endsLy(String str) {
		
//		if(str.endsWith("ly")) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//		
		
		//ORRRR
		if(str.length()<2) {
			System.out.println(false);
			return;
		}
		
		if(str.substring(str.length()-2).equals("ly")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}
