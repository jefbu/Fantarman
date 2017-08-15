package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.Main;
import main.components.Colour;
import main.components.ContentPanel;

public class InformationPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public BattleOverviewInformationPanel yourPanel;
	public BattleOverviewInformationPanel enemyPanel;
	
	public InformationPanel(int battleScreenWidth, int battleScreenHeight) {
		
		super();
		
		int roundedHeight = battleScreenHeight * 2 / 10 + ((battleScreenHeight * 8 / 10)%48);
		int roundedWidth = battleScreenWidth * 9 / 10;
		
		setPreferredSize(new Dimension(roundedWidth, roundedHeight));
		setBackground(new Color(80, 70, 60));
		setLayout (new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		yourPanel = new BattleOverviewInformationPanel(roundedWidth / 2, roundedHeight, Colour.GREEN, Main.yourArmy);
		add(yourPanel);
		
		enemyPanel = new BattleOverviewInformationPanel(roundedWidth / 2, roundedHeight, Colour.RED, Main.opponentArmy);
		add(enemyPanel);
		
		
		
	}
	
	

}
