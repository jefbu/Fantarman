package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class BattleScreen extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	
	private int battleScreenWidth;
	private int battleScreenHeight;
	
	public static BattleScene battleScene;
	public static RightAggregatePanel rightAggregatePanel;
	public static InformationPanel informationPanel;
	public static ButtonPanel buttonPanel;

	public BattleScreen(int mainPanelWidth, int mainPanelHeight) {
		
		super();
		
		createBattleScreen(mainPanelWidth, mainPanelHeight);
		
		battleScene = new BattleScene(battleScreenWidth, battleScreenHeight);
		rightAggregatePanel = new RightAggregatePanel(battleScreenWidth, battleScreenHeight);
		informationPanel = new InformationPanel(battleScreenWidth, battleScreenHeight);
		buttonPanel = new ButtonPanel(battleScreenWidth, battleScreenHeight);
		
		addPanels();
				
	}
	

	
	
	
	
	public void createBattleScreen(int mainPanelWidth, int mainPanelHeight) {
		
		battleScreenWidth = mainPanelWidth - 11;
		battleScreenHeight = mainPanelHeight - 11;
		
		setPreferredSize (new Dimension(battleScreenWidth, battleScreenHeight));
		setBackground (new Color (41, 40, 39));
				
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
	}
	
	public void addPanels() {
		
		add(battleScene);
		add(rightAggregatePanel);
		add(informationPanel);
		add(buttonPanel);
		
	}
	

}
