package entity.regiments;

import java.util.ArrayList;

import components.IndexedPanel;

public abstract class Regiment {
	
	private int attack;
	private int defence;
	private int move;
	private int charge;
	private int chargeMove;
	private int range;
	private int rangeAttack;
	private int morale;
	
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
			
				panels.get(xCoordinate + yCoordinate * columns).index = upperLeftIndex + xCoordinate + yCoordinate * 32;
				
			}
			
		}
		
	}

}
