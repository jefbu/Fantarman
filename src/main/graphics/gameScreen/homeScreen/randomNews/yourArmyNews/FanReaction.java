package main.graphics.gameScreen.homeScreen.randomNews.yourArmyNews;

import java.util.Random;

import main.Main;
import main.utility.SaveTrophies;
import main.utility.Trophies;

public abstract class FanReaction {
	
	static Random random = new Random();
	public static int spaghettiCounter = 1;
	
	public static String getFanReaction() {
		
		if (Main.yourArmy.fanSatisfaction > 60) {
			switch(spaghettiCounter) {
			
				case 1: spaghettiCounter++;
					return "A letter arrived on your desk, coming from the " + getFanclubName() + " fanclub. <br>"
							+ "In it, you are heartily invited to join them in their annual spaghetti afternoon, <br>"
							+ "the profits of which will go to a good cause.";
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
							+ " spaghetti event.<br> ...Even if it means singing karaoke.";
				case 5:
					return "There is a letter from the fanclub inviting you to another event. <br>"
							+ "However, after the last time, you decide to politely ignore this one.";
			
				}
			}
		
		else if (Main.yourArmy.fanSatisfaction > 40) {
			return "In this week's edition of the " + getFanclubName() + " newsletter, <br>"
					+ "a small article was written about your tactical handling and progress made with the team. <br>"
					+ "While overall positive, the article does include some subtler jabs, <br>specifically questioning "
					+ "your decision to " + getCriticism();					
		}
		
		else return "Ouch. It looks like the fans have sent you another present. <br>"
					+ "This time, it's a brick through your window suggesting you, amongst more visual imperatives,"
					+ "<br> to hand in your resignation.";
		
		return "Error in Fan Reaction";
		
	}
	
	

	
	private static String getCriticism() {
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
	
	private static String getRandomSong() {
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
	
	private static String getFanclubName() {
		switch(Main.yourArmy.name) {
		case "Piknin": return "The Vegetable Garden";
		case "Wanmen": return "Wanted! Dead or Alive";
		case "Terquits": return "Clay and Ceramic";
		case "Skylords": return "Cloudy Atmposphere";
		case "Chi": return "Ichiban Faito";
		case "Espequr": return "That One Gallic Town";
		case "Society": return "The Third Way";
		case "Metropolitans": return "Melting Pot";
		}
		return "Error in Fanclub name";
	}
		
}

