package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class RightAggregatePanel extends JPanel {


	private static final long serialVersionUID = 1L;
	
	public RightAggregatePanel(int battleScreenWidth, int battleScreenHeight) {
		
		super();
		
		adjustDimensions(battleScreenWidth, battleScreenHeight);
		
		setBackground(new Color(240, 50, 60));
				
		
	}

	
	
	
	
	
	
	public void adjustDimensions(int battleScreenWidth, int battleScreenHeight) {
		
		int unroundedHeight = battleScreenHeight * 8 / 10;
		int roundedHeight = unroundedHeight - (unroundedHeight%48);
		
		int unroundedSceneWidth = battleScreenHeight * 8 * 15 / 100;
		int roundedSceneWidth = unroundedSceneWidth - (unroundedSceneWidth%48);
		
		int roundedWidth = battleScreenWidth - roundedSceneWidth;
		
		setPreferredSize(new Dimension(roundedWidth, roundedHeight));
	}
	

}
