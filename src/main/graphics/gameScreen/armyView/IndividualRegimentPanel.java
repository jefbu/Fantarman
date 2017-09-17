package main.graphics.gameScreen.armyView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.components.LabeledPanel;

public class IndividualRegimentPanel extends JPanel {
	

	private static final long serialVersionUID = 1L;
	Color backgroundColor = new Color(70, 140, 210);
	ArrayList<LabeledPanel> panelList;

	public IndividualRegimentPanel(int width, int height) {
		
		super();
		panelList = new ArrayList<LabeledPanel>();
		
		setPreferredSize(new Dimension(width, height));
		setBackground(backgroundColor);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		LabeledPanel namePanel = new LabeledPanel(width / 6, height);
		namePanel.setBackground(new Color(80, 160, 240));
		panelList.add(namePanel);
		
		for (int i = 0; i < 10; i++) {
			LabeledPanel panel = new LabeledPanel(width / 12, height);
			panel.setBackground(new Color(80, 160, 240));
			panelList.add(panel);
		}
		
		for (JPanel panel: panelList) {
			add(panel);
		}
		
	}

}
