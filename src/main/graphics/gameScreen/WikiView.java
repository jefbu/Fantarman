package main.graphics.gameScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.components.ButtonedPanel;
import main.utility.Colors;

public class WikiView extends JPanel {

	private static final long serialVersionUID = 1L;

	public WikiView(int gameScreenWidth, int gameScreenHeight) {

		super();

		int unroundedHeight = gameScreenHeight * 98 / 100;
		int unroundedWidth = gameScreenHeight * 8 * 15 / 100;
		int roundedWidth = unroundedWidth - (unroundedWidth % 48);

		Dimension gameSceneSize = new Dimension(roundedWidth, unroundedHeight);
		setPreferredSize(gameSceneSize);
		setBackground(Colors.vlblue);
		
		setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(roundedWidth, unroundedHeight * 5 / 100));
		topPanel.setBackground(Colors.dgreen);
		add(topPanel);
		
		ButtonedPanel combatPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight / 10, Colors.blue);
		add(combatPanel);
		
		ButtonedPanel managementPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight / 10, Colors.blue);
		add(managementPanel);
		
		ButtonedPanel conceptsPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight / 10, Colors.blue);
		add(conceptsPanel);		
		
		ButtonedPanel fluffPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight / 10, Colors.blue);
		add(fluffPanel);
		
		ButtonedPanel creditsPanel = new ButtonedPanel(roundedWidth / 5, unroundedHeight / 10, Colors.blue);
		add(creditsPanel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(roundedWidth, unroundedHeight * 85 / 100));
		mainPanel.setBackground(Colors.dgreen);
		add(mainPanel);
		
		
		
		
	}

}
