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
	private Border startingBorder;
	private Direction direction;
	
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
	
	
	public void createMap() {
		

		
		
		for (int i = 0; i < indexedPanels.size(); i++) {
			
		}
		
		for (IndexedPanel panel: indexedPanels) {
			
			panel.setBackground(new Color(30,20,20));
			
		}
	
		
		TerrainType baseTerrain = checkBaseTerrainType();
		boolean hasRiver = checkRiver(baseTerrain);
			if (hasRiver) createRiver();		
		boolean hasRoad = checkRoad(baseTerrain);
			//if (hasRoad) createRoad();
		
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
		
		int startingPoint = createStartingPoint();
		int endingPoint = createEndingPoint(startingPoint);
		int averageWidth = createAverageWidth();
		
		
		//createFinalRiver(startingPoint);
		
	}
	
	private int createStartingPoint() {
		
		Random random = new Random();
		int roll = random.nextInt(4) + 1;
		int startingPoint = 0;
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
	
	private int createEndingPoint(int startingPoint) {
		
		Random random = new Random();
		int roll = random.nextInt(3) + 1;
		int endingPoint = 0;
		
	switch (startingBorder) {
	
	case NORTH:
		switch(roll) {
		case 1: direction = Direction.SOUTHEAST; endingPoint = (random.nextInt(32) * 48) + 47; break;
		case 2: direction = Direction.SOUTH; endingPoint = random.nextInt(40) + indexedPanels.size() - 48 + 5; break;
		case 3: direction = Direction.SOUTHWEST; endingPoint = random.nextInt(32) * 48; break;
		}
	case EAST:
		switch(roll) {
		case 1: direction = Direction.NORTH; endingPoint = random.nextInt(40) + 5; break;
		case 2: direction = Direction.WEST; endingPoint = random.nextInt(32) * 48; break;
		case 3: direction = Direction.SOUTH; endingPoint = random.nextInt(40) + indexedPanels.size() - 48 + 5; break;
		}
	case SOUTH:
		switch(roll) {
		case 1: direction = Direction.NORTHWEST; endingPoint = random.nextInt(32) * 48; break;
		case 2: direction = Direction.NORTH; endingPoint = random.nextInt(40) + 5; break;
		case 3: direction = Direction.NORTHEAST; endingPoint = (random.nextInt(32) * 48) + 47; break;
		}
	case WEST:
		switch(roll) {
		case 1: direction = Direction.NORTH; endingPoint = random.nextInt(40) + 5; break;
		case 2: direction = Direction.EAST; endingPoint = (random.nextInt(32) * 48) + 47; break;
		case 3: direction = Direction.SOUTH; endingPoint = random.nextInt(40) + indexedPanels.size() - 48 + 5; break;
		}

	}
	
	indexedPanels.get(endingPoint).applyTerrainType(TerrainType.RIVER);
	indexedPanels.get(endingPoint).applyColor();
	System.out.println(startingBorder);
	System.out.println(direction);
	
	return endingPoint;
		
	}
	
	private int createAverageWidth() {
		
		Random random = new Random();
		int roll = random.nextInt(10) + 1;
		
		if (roll< 6) return 2;
		else if (roll < 9) return 3;
		else return 1;
		
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
	
	

}
