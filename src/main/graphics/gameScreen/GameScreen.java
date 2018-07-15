package main.graphics.gameScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class GameScreen extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public MenuPanel menuPanel;
	public MainPanel mainPanel;
	BottomPanel bottomPanel;
	
	int gameScreenWidth;
	int gameScreenHeight;
	

	public GameScreen(int mainPanelWidth, int mainPanelHeight) {
		
		super();
		
		createGameScreen(mainPanelWidth, mainPanelHeight);
		
		menuPanel = new MenuPanel(gameScreenWidth, gameScreenHeight * 2 / 100);
		mainPanel = new MainPanel(gameScreenWidth, gameScreenHeight * 75 / 100);
		bottomPanel = new BottomPanel(gameScreenWidth, gameScreenHeight * 23 / 100);
		
		addPanels();
				
	}
		
	
	private void createGameScreen(int mainPanelWidth, int mainPanelHeight) {
		
		gameScreenWidth = mainPanelWidth - 11;
		gameScreenHeight = mainPanelHeight - 11;
		
		setPreferredSize (new Dimension(gameScreenWidth, gameScreenHeight));
		setBackground (new Color (0, 0, 0));
				
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
	}
	
	private void addPanels() {
		
		add(menuPanel);
		add(mainPanel);
		add(bottomPanel);
		
	}


	public void setScreensInvisible() {
		mainPanel.armyView.setVisible(false);
		mainPanel.regimentView.setVisible(false);
		mainPanel.homeView.setVisible(false);
		mainPanel.leagueView.setVisible(false);
		mainPanel.infoView.setVisible(false);
		mainPanel.wikiView.setVisible(false);
	}

}
