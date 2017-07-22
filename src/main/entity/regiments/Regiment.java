package main.entity.regiments;

import javax.swing.ImageIcon;

import main.graphics.battleScreen.BattleScreen;
import main.utility.ImageLoader;

public abstract class Regiment {
	
	public int attack;
	public int defence;
	public int move;
	public int charge;
	public int run;
	public int range;
	public int ballistic;
	public int morale;
	public int speed;
	
	public String name;
	public RegimentType type;
	
	public int rows;
	public int columns;
	
	public int x;
	public int y;
	
	public int[] panels;
	
	protected ImageLoader imageLoader = new ImageLoader();
	public ImageIcon icon;
	
	protected int width = BattleScreen.battleScene.roundedWidth / 48 - 8;
	protected int height = BattleScreen.battleScene.roundedHeight / 32 - 8;
	
	public Regiment() {
		
		panels = new int[64];		
		
	}
	
	public void setIndices(int upperLeftIndex) {
		
		for(int yCoordinate = 0; yCoordinate < rows; yCoordinate++) {
			
			for (int xCoordinate = 0; xCoordinate < columns; xCoordinate++) {
			
				panels[xCoordinate + yCoordinate * columns] = upperLeftIndex + xCoordinate + yCoordinate * 48;
				
			}
			
		}
		
	}

}
