package main.graphics.gameScreen.homeScreen;

import java.util.Random;

import main.graphics.gameScreen.homeScreen.randomNews.CalendarNews;
import main.graphics.gameScreen.homeScreen.randomNews.RandomArmyNews;
import main.graphics.gameScreen.homeScreen.randomNews.Snippet;
import main.graphics.gameScreen.homeScreen.randomNews.YourArmyNews;

public class RandomNews {

	public static String[] newsItems;
	Random random;

	public RandomNews() {
		random = new Random();
	}

	public String getNews() {
		
		int rollGetNews = random.nextInt(1000) + 1;
			if(rollGetNews > 950) { return CalendarNews.getCalendarEventNews(); }
		else if(rollGetNews > 900) { return RandomArmyNews.getRandomArmyNews(); }
		else if(rollGetNews > 300) { return YourArmyNews.getYourArmyNews(); }
		else { return Snippet.getSnippet(); }
			
	}

}
