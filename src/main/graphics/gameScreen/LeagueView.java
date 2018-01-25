package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.graphics.gameScreen.leagueView.LeagueFilterPanel;
import main.graphics.gameScreen.leagueView.LeagueFixturesPanel;
import main.graphics.gameScreen.leagueView.LeagueRankingPanel;
import main.utility.Colors;

public class LeagueView extends JPanel {

	private static final long serialVersionUID = 1L;
	public LeagueFilterPanel filterPanel;
	public LeagueRankingPanel rankingPanel;
	public LeagueFixturesPanel fixturesPanel;

	public LeagueView(int width, int height) {
		
		super();
		
		int unroundedHeight = height * 98 / 100;
		int unroundedWidth = height * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);
		setPreferredSize(new Dimension(roundedWidth, unroundedHeight));
		setBackground(Colors.vlblue);
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		filterPanel = new LeagueFilterPanel(roundedWidth, unroundedHeight * 7 / 100);
		
		rankingPanel = new LeagueRankingPanel(roundedWidth, unroundedHeight * 68 / 100);
	
		fixturesPanel = new LeagueFixturesPanel(roundedWidth, unroundedHeight * 25 / 100);
		
		add(filterPanel);
		add(rankingPanel);
		add(fixturesPanel);
	}
	
	public void fillLeagueView() {
		rankingPanel.fillRankingPanel();
		fixturesPanel.fillFixturesPanel();
	}

}
