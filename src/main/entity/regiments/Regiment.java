package main.entity.regiments;

import javax.swing.ImageIcon;

import main.graphics.battleScreen.BattleScreen;
import main.utility.ImageLoader;

public abstract class Regiment {
	
	private int attack;
	private int defence;
	private int move;
	private int charge;
	private int run;
	private int range;
	private int ballistic;
	private int morale;
	private int speed;
	
	public int rows;
	public int columns;
	
	public int x;
	public int y;
	
	public int[] panels;
	
	protected ImageLoader imageLoader = new ImageLoader();
	public ImageIcon icon;
	
	protected int width = BattleScreen.battleScene.roundedWidth / 48 - 3;
	protected int height = BattleScreen.battleScene.roundedHeight / 32 - 3;
	
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
