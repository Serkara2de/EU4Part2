package Calisma;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		
//		System.out.println( "  ^");
//	    System.out.println("  /|\\");
//	    System.out.println(" / | \"");
//	    System.out.println("/  |  \"");
//	    System.out.println("|  |  |");
//	    System.out.println("|  |  |");
//	    System.out.println("|  |  |");
//	    System.out.println("|  |  |");
//	    System.out.println("|  |  |");
//		
//	    
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter 3 numbers:");
//	    int num1 = sc.nextInt();
//	    int num2 = sc.nextInt();
//	    int num3 = sc.nextInt();
//	    int sum=num1+num2+num3;
//	    System.out.println("Sum of numbers: "+sum);
//	
	    Scanner scan = new Scanner(System.in);
	    double version = scan.nextDouble();
	    if(version ==1.5){
	      System.out.println("Cupcake");
	    }else if(version ==1.6){
	      System.out.println("Donut");
	    }else if(version ==2.1){
	      System.out.println("Eclair");
	    }else if(version ==2.2){
	      System.out.println("Froyo");
	    }else if(version ==2.3){
	      System.out.println("Gingerbread");
	    }else if(version ==3.1){
	      System.out.println("Honeycomb");
	    }else if(version ==4.0){
	      System.out.println("Ice Cream Sandwich");
	    }else if(version >=4.1 && version<=4.31){
	      System.out.println("Jelly Bean");
	    }else if(version >=4.4 && version<=4.44){
	      System.out.println("Kitkat");
	    }else if(version >=5.0 && version<=5.11){
	      System.out.println("Lollipop");
	    }else if(version >=8.0 && version<=8.1){
	      System.out.println("Oreo");
	    }else if(version ==9.0){
	      System.out.println("Pie");
	    }else{
	      System.out.println("Sorry, I don't know this version!");
	    }
	    
	}

}
