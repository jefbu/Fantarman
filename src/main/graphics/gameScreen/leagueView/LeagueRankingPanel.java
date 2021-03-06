package main.graphics.gameScreen.leagueView;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.utility.Colors;

public class LeagueRankingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public LeagueRankingTable leagueRankingTable;
	public LeagueRankingSortingPanel leagueRankingSortingPanel;

	public LeagueRankingPanel(int width, int height) {

		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.backgroundOrange);

		setLayout(new FlowLayout(FlowLayout.LEADING, width / 10, height / 20));

		leagueRankingSortingPanel = new LeagueRankingSortingPanel(width * 8 / 10, height / 10, Colors.dblue,
				new FlowLayout(FlowLayout.LEADING, 0, 0));
		add(leagueRankingSortingPanel);

		leagueRankingTable = new LeagueRankingTable(width * 8 / 10, height * 8 / 10);
		add(leagueRankingTable);

	}
	
	public void fillRankingPanel(){
		
		leagueRankingTable.fillLeagueRankingTable();
		
	}

}
