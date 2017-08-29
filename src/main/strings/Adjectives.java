package main.strings;

import java.util.Random;

public class Adjectives {
	
	public static String[] positiveAdjectives;
	public static String[] negativeAdjectives;
	
	public Adjectives() {
	
	positiveAdjectives = new String[7];
	negativeAdjectives = new String[7];
	
	positiveAdjectives[0] = "crushing";
	positiveAdjectives[1] = "spectacular";
	positiveAdjectives[2] = "gigantic";
	positiveAdjectives[3] = "laudible";
	positiveAdjectives[4] = "memorable";
	positiveAdjectives[5] = "fantastic";
	positiveAdjectives[6] = "titanic";
	
	negativeAdjectives[0] = "disastrous";
	negativeAdjectives[1] = "terrible";
	negativeAdjectives[2] = "horrid";
	negativeAdjectives[3] = "depressing";
	negativeAdjectives[4] = "lamentable";
	negativeAdjectives[5] = "tearful";
	negativeAdjectives[6] = "awful";
	
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
