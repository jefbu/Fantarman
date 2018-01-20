package main.graphics.gameScreen.leagueView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class LeagueRankingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public LeagueRankingTable leagueRankingTable;
	
	public LeagueRankingPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Color.GRAY);
		
		setLayout(new FlowLayout(FlowLayout.LEADING, width / 10, height / 10));
		
		leagueRankingTable = new LeagueRankingTable(width * 8 / 10, height * 8 / 10);
		add(leagueRankingTable);
		
	}

}
