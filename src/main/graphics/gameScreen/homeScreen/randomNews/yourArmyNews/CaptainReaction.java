package main.graphics.gameScreen.homeScreen.randomNews.yourArmyNews;

import java.util.Random;

import main.Main;
import main.entity.captains.Captain;

public abstract class CaptainReaction {

	public static String getCaptainReaction() {

		Random random = new Random();
		int chosenCaptainRoll = random.nextInt(Main.yourArmy.roster.size());
		Captain chosenCaptain = Main.yourArmy.roster.get(chosenCaptainRoll).captain;

		switch (chosenCaptain.pissedOffReason) {

		case badOrders:
			chosenCaptain.reallyPissedOff = true;
			return chosenCaptain.name + " is really pissed off. You've been mercilessly putting them in hazard's way, "
					+ "and now their bust up beat up bled out bruised mug is yelling at you in your office, "
					+ "telling you that enough's enough. You can get on the battlefield <i> yourself </i> next time!";
		case noReason:
			chosenCaptain.reallyPissedOff = true;
			return "You've been trying to do well by " + chosenCaptain.name
					+ ". It is therefore a complete enigma why they're "
					+ "in your office threatening you with a strike. You've seen these captains had their Diva moments before, "
					+ "but this one takes the cake! Took it and ate it whole, then took the plate as well. Wow.";
		case notPissedOff:
			if (Main.league.armies.get(0).name == Main.yourArmy.name
					|| Main.league.armies.get(1).name == Main.yourArmy.name
					|| Main.league.armies.get(2).name == Main.yourArmy.name) {
				return "In an interview with " + getFanclubName() + ", " + chosenCaptain.name
						+ " has lauded your work. "
						+ "It's a very rare thing indeed to be getting such praise from one of these notoriously stringently stiff "
						+ "captains. To receive it like this, out of the blue is even more of a surprise! "
						+ "Today, it's good to be alive.";
			} else {
				return "In an interview with " + getFanclubName() + ", " + chosenCaptain.name
						+ " has vocally given their support for your managig of the team. "
						+ "It's a pity they've spent so much effort in the interview trying to justify the team's poor position "
						+ "in the league, as this has only drawn extra focus on this detail you'd prefer under the radar. "
						+ "It's the thought that counts and you appreciate the gesture, if not the outcome.";
			}
		case unselected:
			chosenCaptain.reallyPissedOff = true;
			return chosenCaptain.name + " storms into your office. In a whirlwind of glory sullied fury, they give you "
					+ "their mouthful and your earful: "
					+ "'I know you decide what we do each week, but I have a career to consider too, you know."
					+ " I don't give a flying fiddle for your reasons of benching me, I want to get my time centre-stage like anyone."
					+ " So either field me, or tell me straight up you want me out. I'm fine either way you know!'";
		default:
			break;

		}

		return "Captain Reaction";

	}

	private static String getFanclubName() {
		switch (Main.yourArmy.name) {
		case "Piknin":
			return "The Vegetable Garden";
		case "Wanmen":
			return "Wanted! Dead or Alive";
		case "Terquits":
			return "Clay and Ceramic";
		case "Skylords":
			return "Cloudy Atmposphere";
		case "Chi":
			return "Ichiban Faito";
		case "Espequr":
			return "That One Gallic Town";
		case "Society":
			return "The Third Way";
		case "Metropolitans":
			return "Melting Pot";
		}
		return "Error in Fanclub name";
	}

}
