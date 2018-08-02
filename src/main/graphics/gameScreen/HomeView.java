package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.Main;
import main.graphics.Screen;
import main.graphics.gameScreen.homeScreen.ShortArmy;
import main.graphics.gameScreen.homeScreen.ShortFixtures;
import main.graphics.gameScreen.homeScreen.ShortInfo;
import main.graphics.gameScreen.homeScreen.ShortLeague;
import main.utility.Colors;

public class HomeView extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public ShortLeague shortLeague;
	public ShortArmy shortArmy;
	public ShortInfo shortInfo;
	public ShortFixtures calendarPanel;
	
	public HomeView(int width, int height) {
		
		super();

		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.dgrey);
		
		shortArmy = new ShortArmy(width * 70 / 100, height);
		add(shortArmy);
		
		JPanel rightSidePanel = new JPanel();
		rightSidePanel.setPreferredSize(new Dimension(width * 30 / 100, height));
		rightSidePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		rightSidePanel.setBackground(Colors.dgrey);
		add(rightSidePanel);
		
		JPanel rightSideTopPanel = new JPanel();
		rightSideTopPanel.setPreferredSize(new Dimension(width * 30 / 100, height / 2));
		rightSideTopPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		rightSideTopPanel.setBackground(Colors.dgrey);
		rightSidePanel.add(rightSideTopPanel);
		
		JPanel rightSideBottomPanel = new JPanel();
		rightSideBottomPanel.setPreferredSize(new Dimension(width * 30 / 100, height / 2));
		rightSideBottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		rightSideBottomPanel.setBackground(Colors.dgrey);
		rightSidePanel.add(rightSideBottomPanel);
		
		JPanel rightSideTopEmptyPanel = new JPanel();
		rightSideTopEmptyPanel.setPreferredSize(new Dimension(width * 30 / 100, height / 2 * 4 / 100));
		rightSideTopEmptyPanel.setBackground(Colors.dgrey);
		rightSideTopPanel.add(rightSideTopEmptyPanel);	
		
		JPanel rightSideBottomEmptyPanel = new JPanel();
		rightSideBottomEmptyPanel.setPreferredSize(new Dimension(width * 30 / 100, height / 2 * 4 / 100));
		rightSideBottomEmptyPanel.setBackground(Colors.dgrey);
		rightSideBottomPanel.add(rightSideBottomEmptyPanel);		
		
		shortLeague = new ShortLeague(width * 15 / 100, height / 2 * 96 / 100);
		calendarPanel = new ShortFixtures(width * 15 / 100, height / 2 * 96 / 100);
		shortInfo = new ShortInfo(width * 30 / 100, height /2 * 96 / 100);
		
		rightSideTopPanel.add(shortLeague);
		rightSideTopPanel.add(calendarPanel);
		rightSideBottomPanel.add(shortInfo);
		

		
	}
	
	public void fillHomeScreen() {
		
		shortLeague.fillShortLeague();
		shortArmy.fillShortArmy();
		shortInfo.fillShortInformation();
		calendarPanel.globalCalendarCounter = 0;
		calendarPanel.fillShortFixtures(Main.league.calendarDay);
		Screen.gameScreen.bottomPanel.bottomTextPanel.fillBottomTextPanel(true);

		
	}

}
