package main.strings;

import java.util.Random;

public abstract class BattleStartStrings {

	public static String rollQuote() {

		Random random = new Random();
		int roll = random.nextInt(3);

		switch (roll) {

		case 0:
			return "<font color = 'rgb(20, 20, 30)', size = 4>Cry Havoc! And let slip the dogs of war. <br> <i> "
					+ "<font color = 'rgb(80, 70, 70)', size=3> <p align = 'right'> "
					+ "William Shakespeare <br> Julius Caesar, act 3, scene 1";

		case 1:
			return "<font color = 'rgb(20, 20, 30)', size = 4>Once more unto the breach, dear friends, once more. <br> <i> "
					+ "<font color = 'rgb(80, 70, 70)', size=3> <p align = 'right'> "
					+ "William Shakespeare <br> Henry V, act 3, scene 1";

		case 2:
			return "<font color = 'rgb(20, 20, 30)', size = 4>Oh, I am slain. <br> <i> "
					+ "<font color = 'rgb(80, 70, 70)', size=3> <p align = 'right'> "
					+ "William Shakespeare <br> Hamlet, act 3, scene 4";

		}

		return "BattleStartStrings did not return a string";

	}
}
