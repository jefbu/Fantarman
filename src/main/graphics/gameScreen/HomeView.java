package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.graphics.gameScreen.homeScreen.NewsReel;
import main.graphics.gameScreen.homeScreen.ShortArmy;
import main.graphics.gameScreen.homeScreen.ShortInfo;
import main.graphics.gameScreen.homeScreen.ShortLeague;
import main.utility.Colors;

public class HomeView extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public NewsReel newsReel;
	public ShortLeague shortLeague;
	public ShortArmy shortArmy;
	public ShortInfo shortInfo;
	
	public HomeView(int width, int height) {
		
		super();

		int unroundedHeight = height * 98 / 100;
		int unroundedWidth = height * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);
		setPreferredSize(new Dimension(roundedWidth, unroundedHeight));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.vlblue);
		
		shortLeague = new ShortLeague(roundedWidth / 3, unroundedHeight * 3 / 4);
		shortArmy = new ShortArmy(roundedWidth / 3, unroundedHeight * 3 / 4);
		shortInfo = new ShortInfo(roundedWidth / 3, unroundedHeight * 3 / 4);
		newsReel = new NewsReel(roundedWidth, unroundedHeight / 4);
		
		add(shortLeague);
		add(shortArmy);
		add(shortInfo);
		add(newsReel);
		
	}
	
	public void fillHomeScreen(boolean fillNewsReel) {
		
		shortLeague.fillShortLeague();
		shortArmy.fillShortArmy();
		shortInfo.fillShortInformation();
		if(fillNewsReel) newsReel.fillNewsReel();
		
	}

}
