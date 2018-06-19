package main.graphics.gameScreen.homeScreen.randomNews;

import java.util.Random;

import main.Main;

public abstract class RandomArmyNews {
	
	public static String getRandomArmyNews() {
		return "News related to " + getRandomArmy();
	}
	
	
	private static String getRandomArmy() {
		Random random = new Random();
		int rollGetRandomArmy = random.nextInt(Main.league.armies.size());
		return (Main.league.armies.get(rollGetRandomArmy).name);
	}

}
