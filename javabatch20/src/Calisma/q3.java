
package Calisma;
import java.util.*;
public class q3 {



	
	  public static void main(String[] args) {
	    //ENTER CODE HERE
	    int itemPrice;
	    int quarters= 25;
	    int dimes = 10;
	    int nickels = 5;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter price in cents:");
	    itemPrice = scan.nextInt();
	    if(itemPrice>=25 && itemPrice<=100 ){
		      if(itemPrice%5==0){
		    quarters=  (100-itemPrice)/25;
		    dimes = ((100-itemPrice)%25)/10;
		    nickels = (((100-itemPrice)%25)%10)/5;
		    System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
		      }else{
		        System.out.println("Invalid price!");
		      }
		        
		      }else{
		      System.out.println("Invalid price!");
		    }
	    
	    
	  }
	}
