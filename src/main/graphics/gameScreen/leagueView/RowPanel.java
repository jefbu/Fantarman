package main.graphics.gameScreen.leagueView;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.components.ButtonedPanel;
import main.components.Colour;
import main.components.ContentPanel;
import main.components.LabeledPanel;

public class RowPanel extends ContentPanel {

	private static final long serialVersionUID = 1L;
	ButtonedPanel namePanel;
	LabeledPanel bigWinPanel;
	LabeledPanel smallWinPanel;
	LabeledPanel drawPanel;
	LabeledPanel smallLossPanel;
	LabeledPanel bigLossPanel;
	LabeledPanel totalPointsPanel;

	public RowPanel(int width, int height, Colour colour, FlowLayout flowLayout) {
		
		super(width, height, colour, flowLayout);
		
		namePanel = new ButtonedPanel(width * 4 / 10 - 7, height, Color.red);
		namePanel.label.setText("NAME");
		namePanel.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hullo");
			}
		});
		bigWinPanel = new LabeledPanel(width / 10 - 7, height);
		smallWinPanel = new LabeledPanel(width / 10 - 7, height);
		drawPanel = new LabeledPanel(width / 10 - 7, height);
		smallLossPanel = new LabeledPanel(width / 10 - 7, height);
		bigLossPanel = new LabeledPanel(width / 10 - 7, height);
		totalPointsPanel = new LabeledPanel(width / 10 - 7, height);
		
		
		insidePanel.add(namePanel);
		insidePanel.add(bigWinPanel);
		insidePanel.add(smallWinPanel);
		insidePanel.add(drawPanel);
		insidePanel.add(smallLossPanel);
		insidePanel.add(bigLossPanel);
		insidePanel.add(totalPointsPanel);
		
		
		
		
		
	}

}
