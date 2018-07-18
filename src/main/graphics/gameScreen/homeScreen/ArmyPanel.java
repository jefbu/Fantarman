package main.graphics.gameScreen.homeScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;

import main.Main;
import main.components.ButtonedPanel;
import main.components.LabeledPanel;
import main.graphics.Screen;
import main.utility.Colors;

public class ArmyPanel extends ButtonedPanel {

	private static final long serialVersionUID = 1L;
	private LabeledPanel namePanel;
	private LabeledPanel pointsPanel;

	public ArmyPanel(int width, int height) {
		
		super(width, height, Colors.lgrey);
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		//setBackground(Colors.green);
		
		namePanel = new LabeledPanel(width * 7 / 10, height);
		namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, height / 10));
		namePanel.setBackground(Colors.lgrey);
		namePanel.label.setForeground(Colors.vdgrey);
		button.add(namePanel);
		
		pointsPanel = new LabeledPanel(width * 3 / 10, height);
		pointsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, height / 10));
		pointsPanel.setBackground(Colors.lgrey);
		pointsPanel.label.setForeground(Colors.vdgrey);
		button.add(pointsPanel);
		
	}
	
	public void fillArmyPanel(int i) {
		
		namePanel.label.setText(Main.league.armies.get(i).name);
		pointsPanel.label.setText(Integer.toString(Main.league.armies.get(i).scoreSheet.totalPoints));
		
		/*
		try {
			button.removeActionListener(button.getActionListeners()[0]);
		} catch(Exception e) {}
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.league.armies.get(i));
				Screen.gameScreen.mainPanel.armyView.setVisible(true);
			}
		});
		*/
		
	}

}
