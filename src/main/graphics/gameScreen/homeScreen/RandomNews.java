package main.graphics.gameScreen.homeScreen;

import java.util.Random;

public class RandomNews {
	
	public String[] newsItems;
	
	public RandomNews() {
		newsItems = new String[8];
		newsItems[0] = newBoard;
	}
	
	String newBoard = "After a period of political turmoil, the Board of Direction of the CSA (Crazy Sports Association)"
			+ "has been ousted and replaced. 'It was time for the Old Guard to make way, said " + chooseRandomName() + ","
			+ "who instigated the coup from within. Formerly a junior member of the board, he will take over as new Chairman ";

	public String chooseRandomName() {
		Random random = new Random();
		int roll = random.nextInt(5);
		
		switch(roll) {
		case 0: return "Alicia Mountbatten";
		case 1: return "Barry Smith";
		case 2: return "Ekkryu Kriwsszigh";
		case 3: return "Lilian Veaudelin";
		case 4: return "Hugo Thompson";
		}
		return null;
	}
	
	
	
	
}
