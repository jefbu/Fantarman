package main.strings;

import java.util.Random;

public class Adjectives {
	
	public static String[] positiveAdjectives;
	public static String[] negativeAdjectives;
	
	public Adjectives() {
	
	positiveAdjectives = new String[10];
	negativeAdjectives = new String[10];
	
	positiveAdjectives[0] = "crushing";
	positiveAdjectives[1] = "spectacular";
	positiveAdjectives[2] = "gigantic";
	positiveAdjectives[3] = "laudible";
	positiveAdjectives[4] = "memorable";
	positiveAdjectives[5] = "fantastic";
	positiveAdjectives[6] = "titanic";
	positiveAdjectives[7] = "unbelievable";
	positiveAdjectives[8] = "top-notch";
	positiveAdjectives[9] = "majestic";
	
	negativeAdjectives[0] = "disastrous";
	negativeAdjectives[1] = "terrible";
	negativeAdjectives[2] = "horrid";
	negativeAdjectives[3] = "depressing";
	negativeAdjectives[4] = "lamentable";
	negativeAdjectives[5] = "tearful";
	negativeAdjectives[6] = "n awful";
	negativeAdjectives[7] = "blistering";
	negativeAdjectives[8] = "pitiful";
	negativeAdjectives[9] = "shocking";
	
	}
	
	public String choosePositiveAdjective() {
		Random random = new Random();
		int index = random.nextInt(positiveAdjectives.length);
		return positiveAdjectives[index];
	}
	
	public String chooseNegativeAdjective() {
		Random random = new Random();
		int index = random.nextInt(negativeAdjectives.length);
		return negativeAdjectives[index];
	}
	
 
	
	
}
