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
		
		shortArmy = new ShortArmy(roundedWidth * 6 / 10, unroundedHeight * 3 / 4);
		add(shortArmy);
		
		JPanel rightSidePanel = new JPanel();
		rightSidePanel.setPreferredSize(new Dimension(roundedWidth * 4 / 10, unroundedHeight * 3 / 4));
		rightSidePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, unroundedHeight * 3 / 4 / 50));
		rightSidePanel.setBackground(Colors.vlblue);
		add(rightSidePanel);
		
		shortLeague = new ShortLeague(roundedWidth * 4 / 10, unroundedHeight * 3 / 8);
		shortInfo = new ShortInfo(roundedWidth * 4 / 10, unroundedHeight * 3 / 8);
		
		rightSidePanel.add(shortLeague);
		rightSidePanel.add(shortInfo);
		
		newsReel = new NewsReel(roundedWidth, unroundedHeight / 4);
		add(newsReel);
		
	}
	
	public void fillHomeScreen(boolean fillNewsReel) {
		
		shortLeague.fillShortLeague();
		shortArmy.fillShortArmy();
		shortInfo.fillShortInformation();
		if(fillNewsReel) newsReel.fillNewsReel();
		
	}

}
