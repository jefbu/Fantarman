package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class NavigationPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public NavigationPanel(int roundedWidth, int unroundedHeight) {
		
		super();
		
		int width = roundedWidth;
		int height = unroundedHeight * 75 / 100;
		
		setPreferredSize(new Dimension(width, height));
		setBackground(new Color(10, 10, 10));
		
	}

}
