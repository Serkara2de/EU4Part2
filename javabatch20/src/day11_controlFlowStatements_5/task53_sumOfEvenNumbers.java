package day11_controlFlowStatements_5;

public class task53_sumOfEvenNumbers {

	public static void main(String[] args) {
		
		//Write a program using while loop, that calculates the sum of the even numbers between 0 and 100
		
		int i=0;
		int sum=0;
		while(i<=100) {
			
			if(i%2==0) {
				sum=sum+i;
			}
			i++;
		}System.out.println(sum);

	}

}
