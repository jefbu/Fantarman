package main.entity.regiments;

import java.util.ArrayList;

import main.components.IndexedPanel;

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
	
	public ArrayList<IndexedPanel> panels = new ArrayList<IndexedPanel>();
	
	
	public Regiment() {
		
		
		
	}
	
	public void setIndices(int upperLeftIndex) {
		
		for(int yCoordinate = 0; yCoordinate < rows; yCoordinate++) {
			
			for (int xCoordinate = 0; xCoordinate < columns; xCoordinate++) {
			
				panels.get(xCoordinate + yCoordinate * columns).index = upperLeftIndex + xCoordinate + yCoordinate * 48;
				
			}
			
		}
		
	}

}
