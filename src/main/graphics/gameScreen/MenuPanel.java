package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MenuPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public MenuPanel(int gameScreenWidth, int gameScreenHeight) {
		
		super();
		setPreferredSize(new Dimension(gameScreenWidth, gameScreenHeight / 50));
		setBackground(new Color(45,90,135));
		
		
	}

}
