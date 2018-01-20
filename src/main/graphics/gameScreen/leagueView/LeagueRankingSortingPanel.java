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
		
		ButtonedPanel namePanel = new ButtonedPanel(width * 4 / 10, height, Colors.lblue);
		namePanel.label.setText("NAME");
		
		ButtonedPanel bigWinPanel = new ButtonedPanel(width / 10, height, Colors.lblue);
		bigWinPanel.label.setText("W");
		
		ButtonedPanel smallWinPanel = new ButtonedPanel(width / 10, height, Colors.lblue);
		smallWinPanel.label.setText("w");
		
		ButtonedPanel drawPanel = new ButtonedPanel(width / 10, height, Colors.lblue);
		drawPanel.label.setText("D");
		
		ButtonedPanel smallLossPanel = new ButtonedPanel(width / 10, height, Colors.lblue);
		smallLossPanel.label.setText("l");
		
		ButtonedPanel bigLossPanel = new ButtonedPanel(width / 10, height, Colors.lblue);
		bigLossPanel.label.setText("L");
		
		ButtonedPanel totalPointsPanel = new ButtonedPanel(width / 15, height, Colors.lblue);
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
