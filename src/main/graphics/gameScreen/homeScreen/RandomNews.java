package main.graphics.gameScreen.homeScreen;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import main.Main;
import main.entity.regiments.Regiment;

public class RandomNews {

	public static String[] newsItems;
	private static int extreme;
	Random random;

	public RandomNews() {
		random = new Random();
		extreme = 1;
	}

	public String getNews() {
		
		int roll = random.nextInt(100);
			if(roll < 80) { return getCalendarEventNews(); }
		else {
		int roll2 = random.nextInt(2);
		switch (roll2) {
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
		}
		return "error";
		}
	}
	
	private String getCalendarEventNews() {
		int roll = random.nextInt(Main.league.armies.size());
		return getNewsRelatedToArmy(roll);		
	}
	
	private String getNewsRelatedToArmy(int army) {
		int roll = random.nextInt(10);
		if (roll > 6) { return getNewsRelatedToRegiment(army); }
		else { return getNewsRelatedToWholeArmy(army); }
	}
	
	private String getNewsRelatedToRegiment(int army) {
		Collections.sort(Main.league.armies.get(army).roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment p1, Regiment p2) {
				return p2.captain.prestige - p1.captain.prestige;
			}
			
		});
		return Main.league.armies.get(army).roster.get(0).captain.name + " complained";
	}
	
	private String getNewsRelatedToWholeArmy(int army) {
		return "this army is doing well";
	}

	private String chooseRandomName() {
		Random random = new Random();
		int roll = random.nextInt(5);

		switch (roll) {
		case 0: return "Alicia Mountbatten";
		case 1: return "Barry Smith";
		case 2: return "Ekkryu Kriwsszigh";
		case 3: return "Lilianne Veaudelin";
		case 4: return "Hugo Thompson";
		} 
		return null;
	}

	private String newExtremeRule() {
		Random random = new Random();
		boolean goUp = random.nextBoolean();
		switch (extreme) {
		case 0:
			extreme++;
			return " minor injuries up to broken bones will now no longer be considered fouls";
		case 1:
			if (goUp) {
				extreme++;
				return " medium injuries including brain damage and permanent paralysis" + "<br>"
						+ "will now no longer be considered fouls";
			} else {
				int rename = random.nextInt(100);
				extreme--;
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
				extreme++;
				return " severe and immediately life-threatening injuries will now be considered fair play";
			} else {
				extreme--;
				return " injuries beyond broken bones will now be treated as fouls";
			}
		case 3:
			extreme--;
			return " Injury tolerance will now be restricted to -at most- permanent brain damage";
		}

		return "error";
	}

}
