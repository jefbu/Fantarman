package graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class BattleScreen extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	
	private int battleScreenWidth;
	private int battleScreenHeight;
	
	BattleMenu leftBattleMenu;
	BattleMenu rightBattleMenu;
	BattleScene battleScene;
	SpeedSlider speedSlider;

	public BattleScreen(int width, int height) {
		
		super();
		
		battleScreenWidth = width - 11;
		battleScreenHeight = height - 11;
		
		setPreferredSize (new Dimension(battleScreenWidth, battleScreenHeight));
		setBackground (new Color (41, 40, 39));
		
		leftBattleMenu = new BattleMenu(battleScreenWidth, battleScreenHeight);
		battleScene = new BattleScene(battleScreenWidth, battleScreenHeight);
		speedSlider = new SpeedSlider(battleScreenWidth, battleScreenHeight);
		rightBattleMenu = new BattleMenu(battleScreenWidth, battleScreenHeight);
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		add(leftBattleMenu);
		add(battleScene);
		add(speedSlider);
		add(rightBattleMenu);
		
	}
	

}
