package day20_stringManipulation_part2;

import java.util.Scanner;

public class task82_Login {

	public static void main(String[] args) {

//		LoginFunctionalityLogic
//		UserName,Password
//		--- > Program will ask to enter username and password 
//		--- > If both username and password are blank
//		"UserName and Password Fields cannot be empty" 
//		--- > If userName is blank and password is not blank
//		"UserName cannot be empty"
//		--- > If userName is not blank and password is blank
//		"Password cannot be empty"
//		--- > If the username or password is not valid
//		"UserName or password is not valid. Please verify" 
//		--- > If the username and password are both valid
//		"User Logged in successfully"
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Username: ");
		String inputUserName =scan.nextLine();
		System.out.print("Enter Password: ");
		String inputPassword = scan.nextLine();
		
		String userName ="Serkan";
		String password = "Karabag";
		
		if(inputUserName.equals("") && inputPassword.contentEquals("")) {
			System.out.println("UserName and Password Fields cannot be empty");
		}else if(inputUserName.equals("")) {
			System.out.println("UserName cannot be empty");
		}else if(inputPassword.equals("")) {
			System.out.println("Password cannot be empty");
		}else if(!inputUserName.equals(userName) || !inputPassword.equals(password)) {
			System.out.println("UserName or password is not valid. Please verify");
		}else {
			System.out.println("User Logged in successfully");
		}
		
	}

}
