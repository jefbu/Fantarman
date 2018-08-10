package main.strings;

import java.util.Random;

public abstract class BattleStartStrings {

	public static String rollQuote() {

		Random random = new Random();
		int roll = random.nextInt(8);

		switch (roll) {

		case 0:
			return "<font color = 'rgb(180, 180, 180)', size = 4>Cry Havoc! And let slip the dogs of war. <br> <i> "
					+ "<font color = 'rgb(150, 150, 150)', size=3> <p align = 'right'> "
					+ "William Shakespeare <br> Julius Caesar, act 3, scene 1";

		case 1:
			return "<font color = 'rgb(180, 180, 180)', size = 4>Once more unto the breach, dear friends, once more. <br> <i> "
					+ "<font color = 'rgb(150, 150, 150)', size=3> <p align = 'right'> "
					+ "William Shakespeare <br> Henry V, act 3, scene 1";

		case 2:
			return "<font color = 'rgb(180, 180, 180)', size = 4>Oh, I am slain. <br> <i> "
					+ "<font color = 'rgb(150, 150, 150)', size=3> <p align = 'right'> "
					+ "William Shakespeare <br> Hamlet, act 3, scene 4";

		case 3:
			return "<font color = 'rgb(180, 180, 180)', size = 4>Vae victis. <br> <i> "
					+ "<font color = 'rgb(150, 150, 150)', size=3> <p align = 'right'> "
					+ "Brennus the Gaul, after defeating Rome in 390BC <br> " + "It means 'Woe to the Vanquished'";
		case 4:
			return "<font color = 'rgb(180, 180, 180)', size = 4>They couldn't even hit an elephant at this dis... . <br> <i> "
					+ "<font color = 'rgb(150, 150, 150)', size=3> <p align = 'right'> "
					+ "Union General John Sedgwick, 1864. <br> " + "Dramatised and likely incorrect famous last words";

		case 5:
			return "<font color = 'rgb(180, 180, 180)', size = 4>You cannot simultaneously prevent and prepare for war. <br> <i> "
					+ "<font color = 'rgb(150, 150, 150)', size=3> <p align = 'right'> " + "Albert Einstein, 1946<br> "
					+ "In a letter to a congressman";

		case 6:
			return "<font color = 'rgb(180, 180, 180)', size = 4>I dunno, but in the one after that; they'll be using sticks. <br> <i> "
					+ "<font color = 'rgb(150, 150, 150)', size=3> <p align = 'right'> "
					+ "What kind of weapons will they use in the next war?<br> "
					+ "Question asked after World War II";
			
		case 7:
			return "<font color = 'rgb(180, 180, 180)', size = 4>What's past is prologue. <br> <i> "
					+ "<font color = 'rgb(150, 150, 150)', size=3> <p align = 'right'> "
					+ "William Shakespeare <br> "
					+ "The Tempest, act 2, scene 1";

		}

		return "BattleStartStrings did not return a string";

	}
}
