package main.graphics.gameScreen.homeScreen;

import java.util.Random;

import main.Main;
import main.utility.SaveTrophies;
import main.utility.Trophies;

public class RandomNews {

	public static String[] newsItems;
	private static int extremityRules = 1;
	private static int spaghettiCounter = 1;
	Random random;

	public RandomNews() {
		random = new Random();
	}

	public String getNews() {
		
		int rollGetNews = random.nextInt(1000);
			if(rollGetNews > 800) { return getCalendarEventNews(); }
		else if(rollGetNews > 600) { return getRandomArmyNews(); }
		else if(rollGetNews > 400) { return getYourArmyNews(); }
		else { return getSnippet(); }
			
	}
	
	private String getCalendarEventNews() {
		return (Main.league.armies.get(0).name + " is currently in first spot!");		
	}
	
	private String getRandomArmyNews() {
		return "News related to " + getRandomArmy();
	}
	
	private String getYourArmyNews() {
		
		int rollGetYourArmyNews = random.nextInt(1000);
		if(rollGetYourArmyNews > 800) { return getFanReaction(); }
		else if(rollGetYourArmyNews > 600) { return getBoardReaction(); }
		else if(rollGetYourArmyNews > 400) { return getCaptainReaction(); }
		
		else return "Your army is in good shape";
		//else if(roll > 60) { getBoardReaction(); }

	}
	
	private String getSnippet() {	
	
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
	





	

	
	
	
	
	
	
	
	
	private String getFanReaction() {
		
		if (Main.yourArmy.fanSatisfaction > 50) {
			switch(spaghettiCounter) {
			
			case 1: spaghettiCounter++;
				return "A letter arrived on your desk, coming from the " + getFanclubName() + " fanclub. <br>"
						+ "In it, you are heartily invited to join them in their annual spaghetti afternoon, <br>"
						+ "the profits of which go to a good cause.";
				
			case 2: spaghettiCounter++;
				return "Another letter arrived from the " + getFanclubName() + " fanclub. <br> "
						+ "It voices their concern over the fact you haven't confirmed your presence yet to their"
						+ " annual spaghetti afternoon. <br>"
						+ "It also mentions the possibility of extending the event with a karaoke evening";
				
			case 3: spaghettiCounter++;
				return "There is another " + getFanclubName() + " fanclub related letter. This one has a list of songs: "
						+ "<br> <font size = 3>"
						+ "<ul> <li>" + getRandomSong() + "</li>"
						+ "<li>" + getRandomSong() + " </li> "
						+ "<li>" + getRandomSong() + " </li> "
						+ "<li>" + getRandomSong() + " </li> "
						+ "</ul> ";			
			
			case 4: spaghettiCounter++;
					Trophies.spaghetti = true;
					SaveTrophies.save();
				return "There is a letter from the Board of Directors. <br>"
						+ "It contains a warm but undeniably empathetic suggestion to attend the " + getFanclubName()
						+ "<br> their spaghetti event. Even if it means singing karaoke.";
			
			}
			}
		
		else if (Main.yourArmy.fanSatisfaction > 30) {
			return "In this week's edition of the " + getFanclubName() + " newsletter, <br>"
					+ "a small article was written about your tactical handling and progress made with the team. <br>"
					+ "While overall positive, the article does include some subtler jabs, <br>specifically questioning "
					+ "your decision to " + getCriticism();
					
			
					
		}
		
		return "There is a letter from the fanclub inviting you to another event. <br>"
				+ "However, after the last time, you decide to politely ignore this one.";
	}
	
	private String getBoardReaction() {
		
		return "Board Reaction";
		
	}
	
	private String getCaptainReaction() {
		
		return "Captain Reaction";
		
	}
	
	private String getCriticism() {
		int rollCriticism = random.nextInt(5);
		switch(rollCriticism) {
		case 0: return "not include the youth so they can get real battle experience.";
		case 1: return "be too tight with the money.";
		case 2: return "show a lack of ambition during press conferences.";
		case 3: return "skip out on going to the annual fanclub Spaghetti event.";
		case 4: return "be too aggressive during battles, causing too many injuries.";
		}
		return "Error in get Criticism";
	}
	
	private String getRandomSong() {
		int rollGetRandomSong = random.nextInt(16);
		switch(rollGetRandomSong) {
		case 0: return "Jessica Luvin: The Pain it does not End";
		case 1: return "Mike Hartigan: I've got some Beer in the back of my Truck";
		case 2: return "The Hairy Pots: Rockin' in the Liberated Earth";
		case 3: return "Jamilla P. featuring Dingbusters: Grab a Wanmen by the uzi";
		case 4: return "Amanda Lionmane: Grannies to the top";
		case 5: return "The Cheap Tables: Sharon";
		case 6: return "The Fingertips: Elaine <font size = 1> (we recommend this one!)";
		case 7: return "Mumbling Abdomens: Psycho Lover";
		case 8: return "One-tooth Bubba Bill: The Old Road to Melwarankee";
		case 9: return "Baseball Bat Massacre: Lord of the Abyss";
		case 10: return "Emily Beau: I love you but I love him more";
		case 11: return "Emily Beau: I love you but I love her more";
		case 12: return "Emily Beau: I love you but I love them more";
		case 13: return "Dirk Trudeau: Cry me a River of Tears";
		case 14: return "The Gorduras: Sanduiche iche";
		case 15: return "The Fallen Ovens: Hey Giovana";
		}
		return "error in get Random Song";
	}
	
	private String getFanclubName() {
		switch(Main.yourArmy.name) {
		case "Piknin Pickles": return "The Vegetable Garden";
		case "Wanted Wanmen": return "Wanted! Dead or Alive";
		case "Terrible Terquits": return "Clay and Ceramic";
		case "Skylords": return "Cloudy Atmposphere";
		case "Chi Destroyers": return "Ichiban Faito";
		case "Espequr": return "That One Gallic Town";
		case "Multicultural Society": return "The Third Way";
		case "Metropolitans": return "Melting Pot";
		}
		return "Error in Fanclub name";
	}

	
	private String getRandomArmy() {
		int rollGetRandomArmy = random.nextInt(Main.league.armies.size());
		return (Main.league.armies.get(rollGetRandomArmy).name);
	}	
		
	private String chooseRandomName() {
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

	private String newExtremeRule() {
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
