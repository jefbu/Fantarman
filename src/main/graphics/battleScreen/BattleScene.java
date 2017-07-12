package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import main.components.IndexedPanel;
import main.entity.Border;
import main.entity.Direction;
import main.entity.TerrainType;

public class BattleScene extends JPanel {


	private static final long serialVersionUID = 1L;
	boolean alreadyDrawn;
	public Dimension battleSceneSize;
	public int roundedWidth;
	public int roundedHeight;
	public ArrayList<IndexedPanel> indexedPanels = new ArrayList<IndexedPanel>();
	private int startingPoint;
	private Border startingBorder;
	private Direction direction;
	private int averageWidth;
	private TerrainType baseTerrain;
	
	private boolean goOn;
	
	public BattleScene(int battleScreenWidth, int battleScreenHeight) {
		
		super();
		createBattleScene(battleScreenWidth, battleScreenHeight);			
		for (int i = 0; i < 48 * 32; i++) {
			indexedPanels.add(new IndexedPanel(roundedWidth, roundedHeight));
		}
		for (IndexedPanel panel: indexedPanels) {	
			add(panel);
		}
		
		
	}
	
	private void createBattleScene(int battleScreenWidth, int battleScreenHeight) {
		
		int unroundedHeight = battleScreenHeight * 8 / 10;
		int unroundedWidth = battleScreenHeight * 8 * 15 / 100;
		
		roundedHeight = unroundedHeight - (unroundedHeight%48);
		roundedWidth = unroundedWidth - (unroundedWidth%48);

		battleSceneSize = new Dimension(roundedWidth, roundedHeight);
		setPreferredSize(battleSceneSize);
		setBackground (new Color(150, 200, 150));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
	}
	
	
	public void createMap() {
		

		
		
		for (int i = 0; i < indexedPanels.size(); i++) {
			
		}
		
		for (IndexedPanel panel: indexedPanels) {
			
			panel.setBackground(new Color(30,20,20));
			
		}
	
		
		baseTerrain = checkBaseTerrainType();
		
		for (IndexedPanel panel: indexedPanels) {
			switch (baseTerrain) {
			case GRASS: panel.terrain = TerrainType.GRASS; break;
			case HILL: panel.terrain = TerrainType.GRASS; break;
			case MOUNTAIN: panel.terrain = TerrainType.GRASS; break;
			case FOREST: panel.terrain = TerrainType.GRASS; break;
			case DESERT: panel.terrain = TerrainType.DESERT; break;
			case RIVER:	break;
			case ROAD:	break;
			}

			panel.applyColor();
		}
		
		
		boolean hasRiver = checkRiver(baseTerrain);
			if (hasRiver) createRiver();		
		boolean hasRoad = checkRoad(baseTerrain);
			//if (hasRoad) createRoad();
		createHills();
		createForests();
		createMountains();
		
	}
	
	private TerrainType checkBaseTerrainType() {
		
		Random random = new Random();
		int roll = random.nextInt(10) + 1;
		
		if (roll < 6) return TerrainType.GRASS;
		else if (roll < 8) return TerrainType.DESERT;
		else if (roll < 10) return TerrainType.FOREST;
		else return TerrainType.HILL;
		
	}
	
	private boolean checkRiver(TerrainType terrainType) {
		
		Random random = new Random();
		int roll = random.nextInt(10) + 1;

		switch (terrainType) {
			
		case GRASS:
			if (roll < 7) return true; else return false;			
		case DESERT:
			if (roll < 3) return true; else return false;
		case FOREST:
			if (roll < 5) return true; else return false;
		case HILL:
			if (roll < 5) return true; else return false;
		case ROAD:
			return false;
		case MOUNTAIN:
			return false;
		case RIVER:
			return false;
				
		}
		
		return false;
		
	}
	
	private boolean checkRoad(TerrainType terrainType) {
		
		Random random = new Random();
		int roll = random.nextInt(10) + 1;
		
		switch (terrainType) {
			
		case GRASS:
			if (roll < 7) return true; else return false;			
		case DESERT:
			if (roll < 5) return true; else return false;
		case FOREST:
			if (roll < 5) return true; else return false;
		case HILL:
			if (roll < 3) return true; else return false;
		case ROAD:
			return false;
		case MOUNTAIN:
			return false;
		case RIVER:
			return false;
				
		}
		
		return false;
		
	}
	
	private void createRiver() {
		
		goOn = true;
		startingPoint = createStartingPoint();
		direction = applyDirection(startingBorder);
		averageWidth = createAverageWidth();

		while(goOn) {
			
			createNextRiverSpot();
			createWidth();
			applyNewDirection();

		}
		//int endingPoint = createEndingPoint(startingPoint);
		
		
		
		//createFinalRiver(startingPoint);
		
	}
	
	private int createStartingPoint() {
		
		Random random = new Random();
		int roll = random.nextInt(4) + 1;
		startingPoint = 0;
		switch(roll) {
		case 1: startingPoint = random.nextInt(40) + 5; startingBorder = Border.NORTH; break;
		case 2: startingPoint = random.nextInt(32) * 48; startingBorder = Border.WEST; break;
		case 3: startingPoint = random.nextInt(40) + indexedPanels.size() - 48 + 5; startingBorder = Border.SOUTH; break;
		case 4: startingPoint = (random.nextInt(32) * 48) + 47; startingBorder = Border.EAST; break;
		}
		indexedPanels.get(startingPoint).applyTerrainType(TerrainType.RIVER);
		indexedPanels.get(startingPoint).applyColor();
		return startingPoint;

		
	}
	
	private Direction applyDirection(Border startingBorder) {
		
		Random random = new Random();
		int roll = random.nextInt(3) + 1;
		
		switch(startingBorder) {
		
		case NORTH:		
			switch(roll) {
			case 1: return Direction.SOUTHEAST;
			case 2: return Direction.SOUTH;
			case 3: return Direction.SOUTHWEST;
				}
			
		case EAST:
			switch(roll) {
			case 1: return Direction.WEST;
			case 2: return Direction.NORTHWEST;
			case 3: return Direction.SOUTHWEST;
				}
			
		case SOUTH:
			switch(roll) {
			case 1: return Direction.NORTH;
			case 2: return Direction.NORTHEAST;
			case 3: return Direction.NORTHWEST;
				}
			
		case WEST:
			switch(roll) {
			case 1: return Direction.EAST;
			case 2: return Direction.NORTHEAST;
			case 3: return Direction.SOUTHEAST;
				}
		}
		
		return Direction.NORTH;
		
	}
	
	private void createNextRiverSpot() {
		
		switch(direction) {
		
		case NORTH: startingPoint = startingPoint - 48; break;
		case NORTHEAST: startingPoint = startingPoint - 47; break;
		case EAST: startingPoint = startingPoint + 1; break;
		case SOUTHEAST: startingPoint = startingPoint + 49; break;
		case SOUTH: startingPoint = startingPoint + 48; break;
		case SOUTHWEST: startingPoint = startingPoint + 47; break;
		case WEST: startingPoint = startingPoint - 1; break;
		case NORTHWEST: startingPoint = startingPoint - 49; break;
		
		}
		
		
		try {
			indexedPanels.get(startingPoint).applyTerrainType(TerrainType.RIVER);
			indexedPanels.get(startingPoint).applyColor();
		} catch (Exception e) {
			goOn = false;
		}
		
	}
	
	private void createWidth() {
		
		Random random = new Random();

		for (int i = 0; i < averageWidth; i++) {
			int roll = random.nextInt(3) + 1;
			
			switch(roll) {
			
			case 1: 
			try {
				indexedPanels.get(startingPoint-1).applyTerrainType(TerrainType.RIVER);
				indexedPanels.get(startingPoint-1).applyColor();
			} catch (Exception e) {	}
			break;
			
			case 2:
			try {
				indexedPanels.get(startingPoint+1).applyTerrainType(TerrainType.RIVER);
				indexedPanels.get(startingPoint+1).applyColor();
			} catch (Exception e) {	}
			break;
			
			case 3: break;
			}
			
		}
		
	}
	
	private void applyNewDirection() {
		
		Random random = new Random();
		int roll = random.nextInt(4) + 1;
		
		switch(direction) {
		
		case NORTH:
			switch(roll) {
			case 1: direction = Direction.NORTH; break;
			case 2: direction = Direction.NORTH; break;
			case 3: direction = Direction.NORTHEAST; break;
			case 4: direction = Direction.NORTHWEST; break;
			} 
			break;
		case NORTHEAST:
			switch(roll) {
			case 1: direction = Direction.NORTHEAST; break;
			case 2: direction = Direction.NORTHEAST; break;
			case 3: direction = Direction.NORTH; break;
			case 4: direction = Direction.EAST; break;
			} 
			break;
		case EAST:
			switch(roll) {
			case 1: direction = Direction.EAST; break;
			case 2: direction = Direction.EAST; break;
			case 3: direction = Direction.NORTHEAST; break;
			case 4: direction = Direction.SOUTHEAST; break;
			} 
			break;		
		case SOUTHEAST:
			switch(roll) {
			case 1: direction = Direction.SOUTHEAST; break;
			case 2: direction = Direction.SOUTHEAST; break;
			case 3: direction = Direction.EAST; break;
			case 4: direction = Direction.SOUTH; break;
			} 
			break;
		case SOUTH:
			switch(roll) {
			case 1: direction = Direction.SOUTH; break;
			case 2: direction = Direction.SOUTH; break;
			case 3: direction = Direction.SOUTHEAST; break;
			case 4: direction = Direction.SOUTHWEST; break;
			} 
			break;
		case SOUTHWEST:
			switch(roll) {
			case 1: direction = Direction.SOUTHWEST; break;
			case 2: direction = Direction.SOUTHWEST; break;
			case 3: direction = Direction.SOUTH; break;
			case 4: direction = Direction.WEST; break;
			} 
			break;
		case WEST:
			switch(roll) {
			case 1: direction = Direction.WEST; break;
			case 2: direction = Direction.WEST; break;
			case 3: direction = Direction.SOUTHWEST; break;
			case 4: direction = Direction.NORTHWEST; break;
			} 
			break;		
		case NORTHWEST:
			switch(roll) {
			case 1: direction = Direction.NORTHWEST; break;
			case 2: direction = Direction.NORTHWEST; break;
			case 3: direction = Direction.NORTH; break;
			case 4: direction = Direction.WEST; break;
			} 
			break;
		
		}
		
	}
	
	
	private int createAverageWidth() {
		
		Random random = new Random();
		int roll = random.nextInt(10) + 1;
		
		if (roll< 6) return 4;
		else if (roll < 9) return 3;
		else return 5;
		
	}
	
	
	private void createForests() {
		
		Random random = new Random();
		int amountOfForests = random.nextInt(10) + 1;

		int direction;
		
		switch (baseTerrain) {
		
		case GRASS:
			int forests = amountOfForests / 3;
			for (int i = 0; i < forests; i++) {
				
				int forestSize = random.nextInt(30) + 20;
				int location = random.nextInt(48*32);
				
				for (int ii = 0; ii < forestSize; ii++) {
					try {indexedPanels.get(location).terrain = TerrainType.FOREST;} catch(Exception e) {}
					direction = random.nextInt(4) + 1;
					switch(direction) {
					case 1: location--;
					case 2: location = location - 48;
					case 3: location++;
					case 4: location = location + 48;
					}
					
				}

			}
			
		case FOREST:
		case HILL:
		case DESERT:
		case MOUNTAIN:
		case RIVER:
		case ROAD:
		
		}
		
		for (IndexedPanel panel: indexedPanels) {
			panel.applyColor();			
		}
		
	}
	
	private void createHills() {
		
	}
	
	private void createMountains() {
		
	}
	
	

}
