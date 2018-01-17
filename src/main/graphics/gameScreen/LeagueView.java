package main.graphics.gameScreen;

import java.awt.Dimension;

import javax.swing.JPanel;

import main.utility.Colors;

public class LeagueView extends JPanel {

	private static final long serialVersionUID = 1L;

	public LeagueView(int width, int height) {
		
		super();
		
		int unroundedHeight = height * 98 / 100;
		int unroundedWidth = height * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);
		setPreferredSize(new Dimension(roundedWidth, unroundedHeight));
		setBackground(Colors.vlblue);
		
		
		
	}

}
