package main.graphics.gameScreen.leagueView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import main.Main;
import main.components.ButtonedPanel;
import main.components.LabeledPanel;
import main.graphics.Screen;
import main.utility.Colors;

public class RowPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	ButtonedPanel namePanel;
	LabeledPanel bigWinPanel;
	LabeledPanel smallWinPanel;
	LabeledPanel drawPanel;
	LabeledPanel smallLossPanel;
	LabeledPanel bigLossPanel;
	LabeledPanel totalPointsPanel;

	public RowPanel(int width, int height, Color color) {
		
		super();
		int rowHeight = height - 4;
		setPreferredSize(new Dimension(width, rowHeight));
		setBackground(color);
		
		namePanel = new ButtonedPanel(width * 4 / 10 - 6, height, Colors.vdblue);
		namePanel.label.setForeground(Colors.vdblue);
		bigWinPanel = new LabeledPanel(width / 10 - 6, height);
		bigWinPanel.setOpaque(false);
		smallWinPanel = new LabeledPanel(width / 10 - 6, height);
		smallWinPanel.setOpaque(false);
		drawPanel = new LabeledPanel(width / 10 - 6, height);
		drawPanel.setOpaque(false);
		smallLossPanel = new LabeledPanel(width / 10 - 6, height);
		smallLossPanel.setOpaque(false);
		bigLossPanel = new LabeledPanel(width / 10 - 6, height);
		bigLossPanel.setOpaque(false);
		totalPointsPanel = new LabeledPanel(width / 10 - 6, height);
		totalPointsPanel.setOpaque(false);
		
		add(namePanel);
		add(bigWinPanel);
		add(smallWinPanel);
		add(drawPanel);
		add(smallLossPanel);
		add(bigLossPanel);
		add(totalPointsPanel);
		
		
	}
	
	public void fillRow(int index) {
		
		namePanel.label.setText(Main.league.armies.get(index).name);
		bigWinPanel.label.setText(Integer.toString(Main.league.armies.get(index).scoreSheet.bigWins));
		smallWinPanel.label.setText(Integer.toString(Main.league.armies.get(index).scoreSheet.smallWins));
		drawPanel.label.setText(Integer.toString(Main.league.armies.get(index).scoreSheet.draws));
		smallLossPanel.label.setText(Integer.toString(Main.league.armies.get(index).scoreSheet.smallLosses));
		bigLossPanel.label.setText(Integer.toString(Main.league.armies.get(index).scoreSheet.bigLosses));
		totalPointsPanel.label.setText(Integer.toString(Main.league.armies.get(index).scoreSheet.totalPoints));
		
		try {
			namePanel.button.removeActionListener(namePanel.button.getActionListeners()[0]);
		} catch (Exception e){ }
		
		namePanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.league.armies.get(index));
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.armyView.setVisible(true);
			}
		});
		
	}

}
