package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.utility.Colors;

public class BottomPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	NavigationPanel navigationPanel;
	BottomTextPanel bottomTextPanel;
	BottomBattlePanel bottomBattlePanel;
	BottomHomePanel bottomHomePanel;

	public BottomPanel(int width, int height) {
		
		super();		
		
		Dimension dimension = new Dimension(width, height);
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		setPreferredSize(dimension);
		setBackground(Colors.dgrey);
		
		//navigationPanel = new NavigationPanel(gameScreenWidth, unroundedHeight * 25 / 100);
		
		bottomHomePanel = new BottomHomePanel(width * 15 / 100, height);
		bottomTextPanel = new BottomTextPanel(width * 7 / 10, height);
		bottomBattlePanel = new BottomBattlePanel(width * 15 / 100, height); 
		
		//add(navigationPanel);
		add(bottomHomePanel);
		add(bottomTextPanel);
		add(bottomBattlePanel);
		
		
		
	}

}
