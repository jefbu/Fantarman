package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class BottomPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	NavigationPanel navigationPanel;
	BottomTextPanel bottomTextPanel;
	BottomButtonPanel bottomButtonPanel;

	public BottomPanel(int gameScreenWidth, int gameScreenHeight) {
		
		super();
		
		int unroundedHeight = gameScreenHeight * 30 / 100;		
		
		Dimension dimension = new Dimension(gameScreenWidth, unroundedHeight);
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		setPreferredSize(dimension);
		setBackground(new Color(30,30,30));
		
		navigationPanel = new NavigationPanel(gameScreenWidth, unroundedHeight * 25 / 100);
		bottomTextPanel = new BottomTextPanel(gameScreenWidth * 8 / 10, unroundedHeight * 75 / 100);
		bottomButtonPanel = new BottomButtonPanel(gameScreenWidth * 2 / 10, unroundedHeight * 75 / 100); 
		
		add(navigationPanel);
		add(bottomTextPanel);
		add(bottomButtonPanel);
		
		
		
	}

}
