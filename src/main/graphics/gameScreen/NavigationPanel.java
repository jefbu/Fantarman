package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.components.Colour;
import main.components.IconLabelPanel;
import main.utility.Colors;

public class NavigationPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	IconLabelPanel homeScreenPanel;
	IconLabelPanel armyViewPanel;


	public NavigationPanel(int roundedWidth, int unroundedHeight) {
		
		super();
		
		int width = roundedWidth;
		int height = unroundedHeight * 75 / 100;
		
		setPreferredSize(new Dimension(width, height));
		setBackground(Colors.vlblue);
		setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
		homeScreenPanel = new IconLabelPanel(width - 10, height / 6 - 10, Colour.GREEN);
		add(homeScreenPanel);
		
		armyViewPanel = new IconLabelPanel(width - 10, height / 6 - 10, Colour.GREEN);
		add(armyViewPanel);
		
	}

}
