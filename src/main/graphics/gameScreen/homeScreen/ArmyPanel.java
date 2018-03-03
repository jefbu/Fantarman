package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.Main;
import main.components.LabeledPanel;
import main.utility.Colors;

public class ArmyPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private LabeledPanel namePanel;
	private LabeledPanel pointsPanel;

	public ArmyPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Colors.green);
		
		namePanel = new LabeledPanel(width * 7 / 10, height);
		namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		namePanel.setBackground(Colors.lgreen);
		namePanel.label.setForeground(Colors.vdred);
		add(namePanel);
		
		pointsPanel = new LabeledPanel(width * 3 / 10, height);
		pointsPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		pointsPanel.setBackground(Colors.lgreen);
		pointsPanel.label.setForeground(Colors.vdred);
		add(pointsPanel);
		
	}
	
	public void fillArmyPanel(int i) {
		
		namePanel.label.setText(Main.league.armies.get(i).name);
		pointsPanel.label.setText(Integer.toString(Main.league.armies.get(i).scoreSheet.totalPoints));
		
	}

}
