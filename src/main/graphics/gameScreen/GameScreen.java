package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class GameScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public MenuPanel menuPanel;
	public MainPanel mainPanel;
	RightAggregatePanel rightAggregatePanel;
	
	int gameScreenWidth;
	int gameScreenHeight;
	

	public GameScreen(int mainPanelWidth, int mainPanelHeight) {
		
		super();
		
		createGameScreen(mainPanelWidth, mainPanelHeight);
		
		menuPanel = new MenuPanel(gameScreenWidth, gameScreenHeight);
		mainPanel = new MainPanel(gameScreenWidth, gameScreenHeight);
		rightAggregatePanel = new RightAggregatePanel(gameScreenWidth, gameScreenHeight);
		
		addPanels();
				
	}
		
	
	private void createGameScreen(int mainPanelWidth, int mainPanelHeight) {
		
		gameScreenWidth = mainPanelWidth - 11;
		gameScreenHeight = mainPanelHeight - 11;
		
		setPreferredSize (new Dimension(gameScreenWidth, gameScreenHeight));
		setBackground (new Color (41, 40, 39));
				
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
	}
	
	private void addPanels() {
		
		add(menuPanel);
		add(mainPanel);
		add(rightAggregatePanel);
		
	}

}
