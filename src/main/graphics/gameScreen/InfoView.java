package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.utility.Colors;

public class InfoView extends JPanel {

	private static final long serialVersionUID = 1L;

	public InfoView(int gameScreenWidth, int gameScreenHeight) {

		super();

		int unroundedHeight = gameScreenHeight * 98 / 100;
		int unroundedWidth = gameScreenHeight * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);

		Dimension gameSceneSize = new Dimension(roundedWidth, unroundedHeight);
		setPreferredSize(gameSceneSize);
		setBackground(Colors.vlblue);
		
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(roundedWidth, unroundedHeight / 10));
		topPanel.setBackground(Colors.dred);
		add(topPanel);
		
	}

}
