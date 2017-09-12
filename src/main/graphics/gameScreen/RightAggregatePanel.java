package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class RightAggregatePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	NavigationPanel navigationPanel;
	ButtonPanel buttonPanel;

	public RightAggregatePanel(int gameScreenWidth, int gameScreenHeight) {
		
		super();
		
		int unroundedHeight = gameScreenHeight * 98 / 100;		
		int unroundedSceneWidth = gameScreenHeight * 8 * 15 / 100;
		int roundedSceneWidth = unroundedSceneWidth - (unroundedSceneWidth%48);		
		int roundedWidth = gameScreenWidth - roundedSceneWidth;
		Dimension dimension = new Dimension(roundedWidth, unroundedHeight);
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		setPreferredSize(dimension);
		setBackground(new Color(30,30,30));
		
		navigationPanel = new NavigationPanel(roundedWidth, unroundedHeight);
		buttonPanel = new ButtonPanel(roundedWidth, unroundedHeight);
		
		add(navigationPanel);
		add(buttonPanel);
		
		
		
	}

}
