package Calisma;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String item = scan.nextLine();
	    
	    //WRITE YOUR CODE HERE
	    String items=  "Smartphone, Laptop, Charger, USB cable, Headphones, Pants, Hat, Socks, Blanket, Pillow";
	    int giftCard=100;
	    switch(item){
	      case "Smartphone":
	      System.out.println("Sorry, not enough funds on your gift card!");
	      break;
	      
	      case "Laptop":
	      System.out.println("Sorry, not enough funds on your gift card!");
	      break;
	      case "Charger":
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+(giftCard-15)+"$");
	      break;
	      case "USB cable":
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+(giftCard-10)+"$");
	      break;
	      case "Headphones":
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+(giftCard-30)+"$");
	      break;
	      case "Pants":
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+(giftCard-50)+"$");
	      break;
	      case "Hat":
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+(giftCard-25)+"$");
	      break;
	      case "Socks":
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+(giftCard-5)+"$");
	      break;
	      case "Blanket":
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+(giftCard-60)+"$");
	      break;
	      case "Pillow":
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+(giftCard-40)+"$");
	      break;
	      default :
	      System.out.println("Invalid item!");
	      break;
	}
	}
}
