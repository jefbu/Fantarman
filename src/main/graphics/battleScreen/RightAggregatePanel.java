package main.graphics.battleScreen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import main.utility.Colors;

public class RightAggregatePanel extends JPanel {
	
	public static InfoTextPanel infoTextPanel;
	public static SpeedButtonPanel speedButtonPanel;
	Dimension dimension;
	
	private static final long serialVersionUID = 1L;
	
	public RightAggregatePanel(int battleScreenWidth, int battleScreenHeight) {
		
		super();
		
		adjustDimensions(battleScreenWidth, battleScreenHeight);		
		setBackground(Colors.vdgrey);
		setLayout(new FlowLayout(FlowLayout.LEADING, 2, 2));
		
		infoTextPanel = new InfoTextPanel(dimension);
		speedButtonPanel = new SpeedButtonPanel(dimension);
		
		add(infoTextPanel);
		add(speedButtonPanel);
				
		
	}

	
	
	
	
	
	
	public void adjustDimensions(int battleScreenWidth, int battleScreenHeight) {
		
		int unroundedHeight = battleScreenHeight * 8 / 10;
		int roundedHeight = unroundedHeight - (unroundedHeight%48);
		
		int unroundedSceneWidth = battleScreenHeight * 8 * 15 / 100;
		int roundedSceneWidth = unroundedSceneWidth - (unroundedSceneWidth%48);
		
		int roundedWidth = battleScreenWidth - roundedSceneWidth;
		dimension = new Dimension(roundedWidth, roundedHeight);
		
		setPreferredSize(dimension);
	}
	

}
