package main.graphics.gameScreen.homeScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.Main;
import main.components.ButtonedPanel;
import main.components.LabeledPanel;
import main.utility.Colors;

public class RegimentPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private LabeledPanel namePanel;
	private ButtonedPanel rolePanel;
	private LabeledPanel valuePanel;
	private LabeledPanel captainPanel;

	public RegimentPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.lred);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		namePanel = new LabeledPanel(width * 33 / 100, height);
		namePanel.setBackground(Colors.lred);
		namePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		namePanel.label.setForeground(Colors.vdred);
		add(namePanel);
		
		rolePanel = new ButtonedPanel(width * 17 / 100, height, Colors.red);
		rolePanel.setBackground(Colors.lred);
		rolePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		rolePanel.label.setForeground(Colors.vdred);
		add(rolePanel);
		
		valuePanel = new LabeledPanel(width * 22 / 100, height);
		valuePanel.setBackground(Colors.lred);
		valuePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		valuePanel.label.setForeground(Colors.vdred);
		add(valuePanel);
		
		captainPanel = new LabeledPanel(width * 22 / 100, height);
		captainPanel.setBackground(Colors.lred);
		captainPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		captainPanel.label.setForeground(Colors.vdred);
		add(captainPanel);
		
	}

	public void fillRegimentPanel(int i) {
		
		namePanel.label.setText(Main.yourArmy.roster.get(i).name);
		valuePanel.label.setText(Integer.toString(Main.yourArmy.roster.get(i).value));
		captainPanel.label.setText(Main.yourArmy.roster.get(i).captain.name);
		
	}
	
	
}
