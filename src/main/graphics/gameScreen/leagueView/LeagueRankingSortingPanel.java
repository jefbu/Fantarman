package main.graphics.gameScreen.leagueView;

import java.awt.FlowLayout;

import main.components.ButtonedPanel;
import main.components.Colour;
import main.components.ContentPanel;
import main.utility.Colors;

public class LeagueRankingSortingPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;

	public LeagueRankingSortingPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		ButtonedPanel namePanel = new ButtonedPanel(width * 4 / 10, height, Colors.vlblue);
		namePanel.label.setForeground(Colors.vlblue);
		namePanel.label.setText("NAME");
		
		ButtonedPanel bigWinPanel = new ButtonedPanel(width / 10, height, Colors.vlblue);
		bigWinPanel.label.setForeground(Colors.vlblue);
		bigWinPanel.label.setText("W");
		
		ButtonedPanel smallWinPanel = new ButtonedPanel(width / 10, height, Colors.vlblue);
		smallWinPanel.label.setForeground(Colors.vlblue);
		smallWinPanel.label.setText("w");
		
		ButtonedPanel drawPanel = new ButtonedPanel(width / 10, height, Colors.vlblue);
		drawPanel.label.setForeground(Colors.vlblue);
		drawPanel.label.setText("D");
		
		ButtonedPanel smallLossPanel = new ButtonedPanel(width / 10, height, Colors.vlblue);
		smallLossPanel.label.setForeground(Colors.vlblue);
		smallLossPanel.label.setText("l");
		
		ButtonedPanel bigLossPanel = new ButtonedPanel(width / 10, height, Colors.vlblue);
		bigLossPanel.label.setForeground(Colors.vlblue);
		bigLossPanel.label.setText("L");
		
		ButtonedPanel totalPointsPanel = new ButtonedPanel(width / 15, height, Colors.vlblue);
		totalPointsPanel.label.setForeground(Colors.vlblue);
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
