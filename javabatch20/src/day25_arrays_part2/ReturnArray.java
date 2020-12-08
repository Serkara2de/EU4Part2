package day25_arrays_part2;

public class ReturnArray {

	public static void main(String[] args) {
		
		double[] value;
		value = getArray();
		
		for( double num : value) {
			
			System.out.print(num+" ");
		}
		

	}
	
	
	public static double[] getArray() {
		
		double[] array= {1.2,2.3,3.4,4.6};
		
		return array;
	}

}
