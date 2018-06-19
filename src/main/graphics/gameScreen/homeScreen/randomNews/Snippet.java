package main.graphics.gameScreen.homeScreen.randomNews;

import java.util.Random;

import main.Main;

public abstract class Snippet {
	
	private static int extremityRules = 1;
	private static Random random = new Random();
	
	public static String getSnippet() {	
		
		int rollGetSnippet = random.nextInt(3);
		switch (rollGetSnippet) {
		case 0:
			return "<font color = 'rgb(20, 40, 80)'>"
					+ "After a period of political turmoil, the Board of Direction of the CSA" + "<br>"
					+ " has been ousted and replaced. 'It was time for the Old Guard to make way, said "
					+ chooseRandomName() + "," + "<br>" + " who instigated the coup from within. " + "<br>"
					+ "Formerly a junior member of the board, they will take over as new Chairman ";
		case 1:
			return "<font color = 'rgb(20, 40, 80)'>"
					+ "At the recent press conference, the CSA has announced it will be updating the injury rules"
					+ "<br>" + " the new rules state that " + newExtremeRule() + "<br>"
					+ " The long term impact of these new rules remains to be seen.";
		case 2:
			return "<font color = 'rgb(20, 40, 80)'>"
					+ "A rumour is currently going round that " + getRandomArmy() + "<br>"
					+ " is being targeted for a foreign capital injection. It is as of yet unclear where the money"
					+ "would be coming from, " + "<br>"
					+ "nor how much the investor would want to take an active part in the daily management.";
		}
		return "error in get News Snippet";
	}
	
	
	private static String getRandomArmy() {
		Random random = new Random();
		int rollGetRandomArmy = random.nextInt(Main.league.armies.size());
		return (Main.league.armies.get(rollGetRandomArmy).name);
	}
	
		
	private static String chooseRandomName() {
		int rollChooseRandomName = random.nextInt(7);
	
		switch (rollChooseRandomName) {
		case 0: return "Alicia Mountbatten";
		case 1: return "Barry Smith";
		case 2: return "Ekkryu Kriwsszigh";
		case 3: return "Lilianne Veaudelin";
		case 4: return "Hugo Thompson";
		case 5: return "Mr Joanes";
		case 6: return "Isabella Veracruz";
		} 
		return null;
	}
	

	private static String newExtremeRule() {
		boolean goUp = random.nextBoolean();
		switch (extremityRules) {
		case 0:
			extremityRules++;
			return " minor injuries up to broken bones will now no longer be considered fouls";
		case 1:
			if (goUp) {
				extremityRules++;
				return " medium injuries including brain damage and permanent paralysis" + "<br>"
						+ "will now no longer be considered fouls";
			} else {
				int rename = random.nextInt(100);
				extremityRules--;
				if (rename > 2) {
					return " only actions resulting in the smallest of injuries will now be allowed." + "<br>"
							+ "A notion to rename the Mockbattle League into the Circle of Friends was dismissed though";
				} else {
					return " only actions resulting in the smallest of injuries will now be allowed." + "<br>"
							+ "The Mockbattle League has now officially been renamed the Circle of Friends";
				}
			}
		case 2:
			if (goUp) {
				extremityRules++;
				return " severe and immediately life-threatening injuries will now be considered fair play";
			} else {
				extremityRules--;
				return " injuries beyond broken bones will now be treated as fouls";
			}
		case 3:
			extremityRules--;
			return " Injury tolerance will now be restricted to -at most- permanent brain damage";
		}

		return "error on new Extreme Rules";
	}
	

}
