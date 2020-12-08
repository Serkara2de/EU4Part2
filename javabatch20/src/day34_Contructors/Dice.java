package day34_Contructors;

import java.util.Random;

public class Dice {
	
	int sides;
	int value;
	
	public Dice( int numSides) {
		sides= numSides;
		roll();
	}
	
	public void roll() {
		Random rn = new Random();
		value = rn.nextInt(sides)+1;
		
	}
	
	public int getSides() {
		return sides;
	}
	
	public int getValue() {
		return value;
	}

}
