package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private Color backgroundColor;
	
	ArmyView armyView;



	public MainPanel(int gameScreenWidth, int gameScreenHeight) {

		super();

		int unroundedHeight = gameScreenHeight * 98 / 100;
		int unroundedWidth = gameScreenHeight * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);

		Dimension gameSceneSize = new Dimension(roundedWidth, unroundedHeight);
		setPreferredSize(gameSceneSize);
		setBackground(backgroundColor);
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		armyView = new ArmyView(gameScreenWidth, gameScreenHeight);
		add(armyView);

	}

}
