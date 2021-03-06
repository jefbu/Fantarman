package main.graphics.gameScreen.leagueView;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.components.ButtonedPanel;
import main.components.LabeledPanel;
import main.utility.Colors;

public class LeagueFilterPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public LeagueFilterPanel(int width, int height) {
		
		super();
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.backgroundOrange);
		setLayout(new FlowLayout(FlowLayout.LEFT, width / 10, height / 10));
		
		LabeledPanel explanationPanel = new LabeledPanel(width / 4, height * 8 / 10);
		explanationPanel.setBackground(Colors.blue);
		explanationPanel.label.setText("Not Implemented Yet");
		
		ButtonedPanel leaguePanel = new ButtonedPanel(width / 5, height * 8 / 10, Colors.vdblue);
		leaguePanel.button.setOpaque(true);
		leaguePanel.button.setBackground(Colors.lblue);
		leaguePanel.label.setText("Not Implemented Yet");
		
		ButtonedPanel yearPanel = new ButtonedPanel(width / 5, height * 8 / 10, Colors.vdblue);
		yearPanel.button.setOpaque(true);
		yearPanel.button.setBackground(Colors.lblue);
		yearPanel.label.setText("Not Implemented Yet");
		
		
		add(explanationPanel);
		add(leaguePanel);
		add(yearPanel);
		
		
		
	}

}
