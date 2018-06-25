package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.graphics.Screen;
import main.graphics.gameScreen.homeScreen.NewsReel;
import main.graphics.gameScreen.homeScreen.ShortArmy;
import main.graphics.gameScreen.homeScreen.ShortInfo;
import main.graphics.gameScreen.homeScreen.ShortLeague;
import main.utility.Colors;

public class HomeView extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public ShortLeague shortLeague;
	public ShortArmy shortArmy;
	public ShortInfo shortInfo;
	
	public HomeView(int width, int height) {
		
		super();

		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.backgroundOrange);
		
		shortArmy = new ShortArmy(width * 75 / 100, height * 3 / 4);
		add(shortArmy);
		
		JPanel rightSidePanel = new JPanel();
		rightSidePanel.setPreferredSize(new Dimension(width * 25 / 100, height * 3 / 4));
		rightSidePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, height * 3 / 4 / 50));
		rightSidePanel.setBackground(Colors.backgroundOrange);
		add(rightSidePanel);
		
		shortLeague = new ShortLeague(width * 25 / 100, height * 3 / 8);
		shortInfo = new ShortInfo(width * 25 / 100, height * 3 / 8);
		
		rightSidePanel.add(shortLeague);
		rightSidePanel.add(shortInfo);
		

		
	}
	
	public void fillHomeScreen() {
		
		shortLeague.fillShortLeague();
		shortArmy.fillShortArmy();
		shortInfo.fillShortInformation();
		Screen.gameScreen.bottomPanel.bottomTextPanel.fillBottomTextPanel(true);

		
	}

}
