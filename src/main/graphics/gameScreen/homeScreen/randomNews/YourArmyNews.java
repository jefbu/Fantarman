package main.graphics.gameScreen.homeScreen.randomNews;

import java.util.Random;

import main.graphics.gameScreen.homeScreen.randomNews.yourArmyNews.BoardReaction;
import main.graphics.gameScreen.homeScreen.randomNews.yourArmyNews.CaptainReaction;
import main.graphics.gameScreen.homeScreen.randomNews.yourArmyNews.FanReaction;

public abstract class YourArmyNews {

	private static Random random = new Random();
	
	
	public static String getYourArmyNews() {
		
		int rollGetYourArmyNews = random.nextInt(1000) + 1;
		if(rollGetYourArmyNews > 200) { return FanReaction.getFanReaction(); }
		else if(rollGetYourArmyNews > 100) { return BoardReaction.getBoardReaction(); }
		else if(rollGetYourArmyNews > 50) { return CaptainReaction.getCaptainReaction(); }
		
		else return "Your army is in good shape";

	}
	
}
	

	





	

	
	
	