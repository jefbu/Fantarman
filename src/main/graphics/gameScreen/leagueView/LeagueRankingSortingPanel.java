package main.graphics.gameScreen.leagueView;

import java.awt.Color;
import java.awt.FlowLayout;

import main.components.ButtonedPanel;
import main.components.ContentPanel;
import main.utility.Colors;

public class LeagueRankingSortingPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;

	public LeagueRankingSortingPanel(int width, int height, Color colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		ButtonedPanel namePanel = new ButtonedPanel(width * 4 / 10, height, Colors.backgroundOrange);
		namePanel.label.setForeground(Colors.backgroundOrange);
		namePanel.label.setText("NAME");
		
		ButtonedPanel bigWinPanel = new ButtonedPanel(width / 10, height, Colors.backgroundOrange);
		bigWinPanel.label.setForeground(Colors.backgroundOrange);
		bigWinPanel.label.setText("W");
		
		ButtonedPanel smallWinPanel = new ButtonedPanel(width / 10, height, Colors.backgroundOrange);
		smallWinPanel.label.setForeground(Colors.backgroundOrange);
		smallWinPanel.label.setText("w");
		
		ButtonedPanel drawPanel = new ButtonedPanel(width / 10, height, Colors.backgroundOrange);
		drawPanel.label.setForeground(Colors.backgroundOrange);
		drawPanel.label.setText("D");
		
		ButtonedPanel smallLossPanel = new ButtonedPanel(width / 10, height, Colors.backgroundOrange);
		smallLossPanel.label.setForeground(Colors.backgroundOrange);
		smallLossPanel.label.setText("l");
		
		ButtonedPanel bigLossPanel = new ButtonedPanel(width / 10, height, Colors.backgroundOrange);
		bigLossPanel.label.setForeground(Colors.backgroundOrange);
		bigLossPanel.label.setText("L");
		
		ButtonedPanel totalPointsPanel = new ButtonedPanel(width / 15, height, Colors.backgroundOrange);
		totalPointsPanel.label.setForeground(Colors.backgroundOrange);
		totalPointsPanel.label.setText("Tot");
		
		insidePanel.add(namePanel);
		insidePanel.add(bigWinPanel);
		insidePanel.add(smallWinPanel);
		insidePanel.add(drawPanel);
		insidePanel.add(smallLossPanel);
		insidePanel.add(bigLossPanel);
		insidePanel.add(totalPointsPanel);
		
		
		
	}
	

}
