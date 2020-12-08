package day10_controlFlowStatements_4;

public class task44_SpeedConverter {

	public static void main(String[] args) {
		
		int mph;
		System.out.println("KPH             MKH");
		System.out.println("----------------------");
		for(int i=60;i<=130;i+=10) {
			
			System.out.println(i+"\t\t"+(i*0.6214));
			
		}

	}

}
