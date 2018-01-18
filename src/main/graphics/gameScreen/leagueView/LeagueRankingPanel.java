package main.graphics.gameScreen.leagueView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import main.Main;
import main.entity.armies.Army;

public class LeagueRankingPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private LeagueRankingTable leagueRankingTable;
	
	public LeagueRankingPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Color.GRAY);
		
		setLayout(new FlowLayout(FlowLayout.LEADING, width * 15 / 100, height * 15 / 100));
		
		leagueRankingTable = new LeagueRankingTable(width * 7 / 10, height * 7 / 10);
		add(leagueRankingTable);
		
	}

}
