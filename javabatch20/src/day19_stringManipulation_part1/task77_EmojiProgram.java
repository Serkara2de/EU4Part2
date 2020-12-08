package day19_stringManipulation_part1;

import java.util.Scanner;

public class task77_EmojiProgram {

	public static void main(String[] args) {
//		Create a emoji program:
//			1- Check if emoji has 2 characters. If it is not, print “invalid emoji” 
//			2- Valid emojis:
//			Starting with : = > :) Smile, :( Sad, :/ Upset, :p Playful, Otherwise invalid 
//			Starting with ; = > ;) Wink, ;0 Surprised, Otherwise invalid
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an emoji");
		String emoji = scan.nextLine();
		
		if(emoji.length()!=2) {
			System.out.println("Invalid Emoji");
		}else {
			if(emoji.charAt(0)==':') {
				switch(emoji) {
				case ":)":
					System.out.println("Smile");
					break;
				case ":(":
					System.out.println("Sad");
					break;
				case ":/":
					System.out.println("Upset");
					break;
				case ":p":
					System.out.println("Playful");
					break;
				default:
					System.out.println("Invalid Emoji");
					break;
				}
			}else if(emoji.charAt(0)==';') {
				switch(emoji) {
				case ";)":
					System.out.println("Wink");
					break;
				case ";o":
					System.out.println("Surprised");
					break;
				default:
					System.out.println("Invalid Emoji");
					break;
				}
				
			}
		}

	}

}
