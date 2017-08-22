package main.graphics.battleScreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import main.Main;
import main.components.IndexedPanel;
import main.entity.regiments.Regiment;
import main.graphics.TileImages;
import main.utility.Border;
import main.utility.Direction;
import main.utility.TerrainType;

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
		for (IndexedPanel panel : indexedPanels) {
			add(panel);
		}

	}

	private void createBattleScene(int battleScreenWidth, int battleScreenHeight) {

		int unroundedHeight = battleScreenHeight * 8 / 10;
		int unroundedWidth = battleScreenHeight * 8 * 15 / 100;

		roundedHeight = unroundedHeight - (unroundedHeight % 48);
		roundedWidth = unroundedWidth - (unroundedWidth % 48);

		battleSceneSize = new Dimension(roundedWidth, roundedHeight);
		setPreferredSize(battleSceneSize);
		setBackground(new Color(150, 200, 150));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

	}

	public void createMap() {

		Random random = new Random();
		int roll = 0;
		baseTerrain = checkBaseTerrainType();

		for (IndexedPanel panel : indexedPanels) {
			switch (baseTerrain) {
			case GRASS:
				panel.terrain = TerrainType.GRASS;
				roll = random.nextInt(10000) + 1;
				if (roll <= 5) {
				panel.icon = TileImages.grass4Icon;
			    } else if (roll <= 10) {
				panel.icon = TileImages.grass3Icon;
				} else if (roll <= 20){
				panel.icon = TileImages.grass2Icon;
				} else {
				panel.icon = TileImages.grass1Icon;
				}
				panel.button.setIcon(panel.icon);
				break;
			case HILL:
				panel.terrain = TerrainType.GRASS;
				panel.icon = TileImages.grass1Icon;
				panel.button.setIcon(panel.icon);
				break;
			case FOREST:
				panel.terrain = TerrainType.GRASS;
				panel.icon = TileImages.grass1Icon;
				panel.button.setIcon(panel.icon);
				break;
			case DESERT:
				panel.terrain = TerrainType.DESERT;
				roll = random.nextInt(1000);
				if (roll < 3) {
				panel.icon = TileImages.desert3Icon;	
				} else if (roll < 10) {
				panel.icon = TileImages.desert2Icon;
				} else {
				panel.icon = TileImages.desert1Icon;
				}
				panel.button.setIcon(panel.icon);
				break;
			case MOUNTAIN:
				break;
			case RIVER:
				break;
			case ROAD:
				break;
			}

		}

		createHills();
		createForests();
		createMountains(baseTerrain);
		boolean hasRiver = checkRiver(baseTerrain);
		if (hasRiver)
			createRiver();
		boolean hasRoad = checkRoad(baseTerrain);
		if (hasRoad)
			createRoad();

		for (IndexedPanel panel : indexedPanels) {
			panel.applyColor();
		}

	}

	private TerrainType checkBaseTerrainType() {

		Random random = new Random();
		int roll = random.nextInt(10) + 1;

		if (roll < 6)
			return TerrainType.GRASS;
		else if (roll < 8)
			return TerrainType.DESERT;
		else if (roll < 10)
			return TerrainType.FOREST;
		else
			return TerrainType.HILL;

	}

	private boolean checkRiver(TerrainType terrainType) {

		Random random = new Random();
		int roll = random.nextInt(10) + 1;

		switch (terrainType) {

		case GRASS:
			if (roll < 7)
				return true;
			else
				return false;
		case DESERT:
			if (roll < 3)
				return true;
			else
				return false;
		case FOREST:
			if (roll < 5)
				return true;
			else
				return false;
		case HILL:
			if (roll < 5)
				return true;
			else
				return false;
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
			if (roll < 7)
				return true;
			else
				return false;
		case DESERT:
			if (roll < 5)
				return true;
			else
				return false;
		case FOREST:
			if (roll < 5)
				return true;
			else
				return false;
		case HILL:
			if (roll < 3)
				return true;
			else
				return false;
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
		startingPoint = createStartingPoint(TerrainType.RIVER);
		direction = applyDirection(startingBorder);
		averageWidth = createAverageWidth();

		while (goOn) {

			createNextSpot(TerrainType.RIVER);
			createWidth(TerrainType.RIVER);
			applyNewDirection();

		}

	}

	private void createRoad() {

		goOn = true;
		startingPoint = createStartingPoint(TerrainType.ROAD);
		direction = applyDirection(startingBorder);
		averageWidth = createAverageWidth();

		while (goOn) {

			createNextSpot(TerrainType.ROAD);
			createWidth(TerrainType.ROAD);
			applyNewDirection();

		}

	}

	private int createStartingPoint(TerrainType terrain) {

		Random random = new Random();
		int roll = random.nextInt(4) + 1;
		startingPoint = 0;
		switch (roll) {
		case 1:
			startingPoint = random.nextInt(40) + 5;
			startingBorder = Border.NORTH;
			break;
		case 2:
			startingPoint = random.nextInt(32) * 48;
			startingBorder = Border.WEST;
			break;
		case 3:
			startingPoint = random.nextInt(40) + indexedPanels.size() - 48 + 5;
			startingBorder = Border.SOUTH;
			break;
		case 4:
			startingPoint = (random.nextInt(32) * 48) + 47;
			startingBorder = Border.EAST;
			break;
		}
		indexedPanels.get(startingPoint).applyTerrainType(terrain);
		if (terrain == TerrainType.RIVER) {
		indexedPanels.get(startingPoint).icon = TileImages.river1Icon;
		} else if (terrain == TerrainType.ROAD) {
		indexedPanels.get(startingPoint).icon = TileImages.road1Icon;
		}
		indexedPanels.get(startingPoint).button.setIcon(indexedPanels.get(startingPoint).icon);
		return startingPoint;

	}

	private Direction applyDirection(Border startingBorder) {

		Random random = new Random();
		int roll = random.nextInt(3) + 1;

		switch (startingBorder) {

		case NORTH:
			switch (roll) {
			case 1:
				return Direction.SOUTHEAST;
			case 2:
				return Direction.SOUTH;
			case 3:
				return Direction.SOUTHWEST;
			}

		case EAST:
			switch (roll) {
			case 1:
				return Direction.WEST;
			case 2:
				return Direction.NORTHWEST;
			case 3:
				return Direction.SOUTHWEST;
			}

		case SOUTH:
			switch (roll) {
			case 1:
				return Direction.NORTH;
			case 2:
				return Direction.NORTHEAST;
			case 3:
				return Direction.NORTHWEST;
			}

		case WEST:
			switch (roll) {
			case 1:
				return Direction.EAST;
			case 2:
				return Direction.NORTHEAST;
			case 3:
				return Direction.SOUTHEAST;
			}
		}

		return Direction.NORTH;

	}

	private void createNextSpot(TerrainType terrain) {
		
		Random random = new Random();

		switch (direction) {

		case NORTH:
			startingPoint = startingPoint - 48;
			break;
		case NORTHEAST:
			startingPoint = startingPoint - 47;
			break;
		case EAST:
			startingPoint = startingPoint + 1;
			break;
		case SOUTHEAST:
			startingPoint = startingPoint + 49;
			break;
		case SOUTH:
			startingPoint = startingPoint + 48;
			break;
		case SOUTHWEST:
			startingPoint = startingPoint + 47;
			break;
		case WEST:
			startingPoint = startingPoint - 1;
			break;
		case NORTHWEST:
			startingPoint = startingPoint - 49;
			break;

		}

		try {
			indexedPanels.get(startingPoint).applyTerrainType(terrain);
			if (terrain == TerrainType.RIVER) {
				if (random.nextInt(100) < 5) {
					indexedPanels.get(startingPoint).icon = TileImages.river2Icon;
				} else {
					indexedPanels.get(startingPoint).icon = TileImages.river1Icon;
				}
			} else if (terrain == TerrainType.ROAD) {
				indexedPanels.get(startingPoint).icon = TileImages.road1Icon;
			}
			indexedPanels.get(startingPoint).button.setIcon(indexedPanels.get(startingPoint).icon);
		} catch (Exception e) {
			goOn = false;
		}

	}

	private void createWidth(TerrainType terrain) {

		Random random = new Random();

		for (int i = 0; i < averageWidth; i++) {
			int roll = random.nextInt(3) + 1;

			switch (roll) {

			case 1:
				try {
					indexedPanels.get(startingPoint - 1).applyTerrainType(terrain);
					if (indexedPanels.get(startingPoint - 1).terrain == TerrainType.RIVER) {
						indexedPanels.get(startingPoint - 1).icon = TileImages.river1Icon;
					} else if (indexedPanels.get(startingPoint - 1).terrain == TerrainType.ROAD) {
						indexedPanels.get(startingPoint - 1).icon = TileImages.road1Icon;
					}
				} catch (Exception e) {
				}
				break;

			case 2:
				try {
					indexedPanels.get(startingPoint + 1).applyTerrainType(terrain);
					if (indexedPanels.get(startingPoint + 1).terrain == TerrainType.RIVER) {
						indexedPanels.get(startingPoint + 1).icon = TileImages.river1Icon;
					} else if (indexedPanels.get(startingPoint + 1).terrain == TerrainType.ROAD) {
						indexedPanels.get(startingPoint + 1).icon = TileImages.road1Icon;
					}				
				} catch (Exception e) {
				}
				break;

			case 3:
				break;
			}

		}

	}

	private void applyNewDirection() {

		Random random = new Random();
		int roll = random.nextInt(4) + 1;

		switch (direction) {

		case NORTH:
			switch (roll) {
			case 1:
				direction = Direction.NORTH;
				break;
			case 2:
				direction = Direction.NORTH;
				break;
			case 3:
				direction = Direction.NORTHEAST;
				break;
			case 4:
				direction = Direction.NORTHWEST;
				break;
			}
			break;
		case NORTHEAST:
			switch (roll) {
			case 1:
				direction = Direction.NORTHEAST;
				break;
			case 2:
				direction = Direction.NORTHEAST;
				break;
			case 3:
				direction = Direction.NORTH;
				break;
			case 4:
				direction = Direction.EAST;
				break;
			}
			break;
		case EAST:
			switch (roll) {
			case 1:
				direction = Direction.EAST;
				break;
			case 2:
				direction = Direction.EAST;
				break;
			case 3:
				direction = Direction.NORTHEAST;
				break;
			case 4:
				direction = Direction.SOUTHEAST;
				break;
			}
			break;
		case SOUTHEAST:
			switch (roll) {
			case 1:
				direction = Direction.SOUTHEAST;
				break;
			case 2:
				direction = Direction.SOUTHEAST;
				break;
			case 3:
				direction = Direction.EAST;
				break;
			case 4:
				direction = Direction.SOUTH;
				break;
			}
			break;
		case SOUTH:
			switch (roll) {
			case 1:
				direction = Direction.SOUTH;
				break;
			case 2:
				direction = Direction.SOUTH;
				break;
			case 3:
				direction = Direction.SOUTHEAST;
				break;
			case 4:
				direction = Direction.SOUTHWEST;
				break;
			}
			break;
		case SOUTHWEST:
			switch (roll) {
			case 1:
				direction = Direction.SOUTHWEST;
				break;
			case 2:
				direction = Direction.SOUTHWEST;
				break;
			case 3:
				direction = Direction.SOUTH;
				break;
			case 4:
				direction = Direction.WEST;
				break;
			}
			break;
		case WEST:
			switch (roll) {
			case 1:
				direction = Direction.WEST;
				break;
			case 2:
				direction = Direction.WEST;
				break;
			case 3:
				direction = Direction.SOUTHWEST;
				break;
			case 4:
				direction = Direction.NORTHWEST;
				break;
			}
			break;
		case NORTHWEST:
			switch (roll) {
			case 1:
				direction = Direction.NORTHWEST;
				break;
			case 2:
				direction = Direction.NORTHWEST;
				break;
			case 3:
				direction = Direction.NORTH;
				break;
			case 4:
				direction = Direction.WEST;
				break;
			}
			break;

		}

	}

	private int createAverageWidth() {

		Random random = new Random();
		int roll = random.nextInt(10) + 1;

		if (roll < 6)
			return 4;
		else if (roll < 9)
			return 3;
		else
			return 5;

	}

	private void createForests() {

		Random random = new Random();
		int amountOfForests = random.nextInt(10) + 1;

		int forests = 0;

		switch (baseTerrain) {

		case GRASS:
			forests = amountOfForests / 3;
			break;
		case FOREST:
			forests = amountOfForests / 2;
			break;
		case HILL:
			forests = amountOfForests / 4;
			break;
		case DESERT:
			forests = amountOfForests / 5;
			break;
		case MOUNTAIN:
			break;
		case RIVER:
			break;
		case ROAD:
			break;

		}

		for (int i = 0; i < forests; i++) {

			int forestSize = random.nextInt(10) + 5;
			int location = random.nextInt(48 * 32);

			for (int ii = 0; ii < forestSize; ii++) {

				try {
					int roll = random.nextInt(100);
					indexedPanels.get(location).terrain = TerrainType.FOREST;
					if (roll < 3) {
					indexedPanels.get(location).icon = TileImages.forest3Icon;
					} else if (roll < 10) {
					indexedPanels.get(location).icon = TileImages.forest2Icon;
					} else {
					indexedPanels.get(location).icon = TileImages.forest1Icon;
					}
					indexedPanels.get(location).button.setIcon(indexedPanels.get(location).icon);
				} catch (Exception e) {
				}
				int heightRoll = random.nextInt(10) + 1;

				if (heightRoll < 6) {
					try {
						indexedPanels.get(location - 48).terrain = TerrainType.FOREST;
						indexedPanels.get(location - 48).icon = TileImages.forest1Icon;
						indexedPanels.get(location - 48).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 48).terrain = TerrainType.FOREST;
						indexedPanels.get(location + 48).icon = TileImages.forest1Icon;
						indexedPanels.get(location + 48).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
				}

				else if (heightRoll < 9) {
					try {
						indexedPanels.get(location - 48).terrain = TerrainType.FOREST;
						indexedPanels.get(location - 48).icon = TileImages.forest1Icon;
						indexedPanels.get(location - 48).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 48).terrain = TerrainType.FOREST;
						indexedPanels.get(location + 48).icon = TileImages.forest1Icon;
						indexedPanels.get(location + 48).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 96).terrain = TerrainType.FOREST;
						indexedPanels.get(location + 96).icon = TileImages.forest1Icon;
						indexedPanels.get(location + 96).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
				}

				else {
					try {
						indexedPanels.get(location - 48).terrain = TerrainType.FOREST;
						indexedPanels.get(location - 48).icon = TileImages.forest1Icon;
						indexedPanels.get(location - 48).button.setIcon(indexedPanels.get(location).icon);						} catch (Exception e) {
					}
					try {
						indexedPanels.get(location - 96).terrain = TerrainType.FOREST;
						indexedPanels.get(location - 96).icon = TileImages.forest1Icon;
						indexedPanels.get(location - 96).button.setIcon(indexedPanels.get(location).icon);						} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 48).terrain = TerrainType.FOREST;
						indexedPanels.get(location + 48).icon = TileImages.forest1Icon;
						indexedPanels.get(location + 48).button.setIcon(indexedPanels.get(location).icon);						} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 96).terrain = TerrainType.FOREST;
						indexedPanels.get(location + 96).icon = TileImages.forest1Icon;
						indexedPanels.get(location + 96).button.setIcon(indexedPanels.get(location).icon);						} catch (Exception e) {
					}
				}

				int nextPixel = random.nextInt(4) + 1;
				switch (nextPixel) {
				case 1:
					location++;
					break;
				case 2:
					location++;
					break;
				case 3:
					location = location - 47;
					break;
				case 4:
					location = location + 49;
					break;
				}
			}

		}

	}

	private void createHills() {

		Random random = new Random();
		int amountOfHills = random.nextInt(10) + 1;

		int hills = 0;

		switch (baseTerrain) {

		case GRASS:
			hills = amountOfHills / 3;
			break;
		case FOREST:
			hills = amountOfHills / 4;
			break;
		case HILL:
			hills = amountOfHills / 2 + 1;
			break;
		case DESERT:
			hills = amountOfHills / 4;
			break;
		case MOUNTAIN:
			break;
		case RIVER:
			break;
		case ROAD:
			break;

		}

		for (int i = 0; i < hills; i++) {

			int hillSize = random.nextInt(5) + 5;
			int location = random.nextInt(48 * 32);

			for (int ii = 0; ii < hillSize; ii++) {

				try {
					indexedPanels.get(location).terrain = TerrainType.HILL;
					indexedPanels.get(location).icon = TileImages.hill1Icon;
					indexedPanels.get(location).button.setIcon(indexedPanels.get(location).icon);
				} catch (Exception e) {
				}
				int heightRoll = random.nextInt(10) + 1;

				if (heightRoll < 6) {
					try {
						indexedPanels.get(location - 48).terrain = TerrainType.HILL;
						indexedPanels.get(location - 48).icon = TileImages.hill1Icon;
						indexedPanels.get(location - 48).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 48).terrain = TerrainType.HILL;
						indexedPanels.get(location + 48).icon = TileImages.hill1Icon;
						indexedPanels.get(location + 48).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 96).terrain = TerrainType.HILL;
						indexedPanels.get(location + 96).icon = TileImages.hill1Icon;
						indexedPanels.get(location + 96).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
				}

				else if (heightRoll < 9) {
					try {
						indexedPanels.get(location - 48).terrain = TerrainType.HILL;
						indexedPanels.get(location - 48).icon = TileImages.hill1Icon;
						indexedPanels.get(location - 48).button.setIcon(indexedPanels.get(location).icon);						} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 48).terrain = TerrainType.HILL;
						indexedPanels.get(location + 48).icon = TileImages.hill1Icon;
						indexedPanels.get(location + 48).button.setIcon(indexedPanels.get(location).icon);						} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 96).terrain = TerrainType.HILL;
						indexedPanels.get(location + 96).icon = TileImages.hill1Icon;
						indexedPanels.get(location + 96).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
					try {
						indexedPanels.get(location - 96).terrain = TerrainType.HILL;
						indexedPanels.get(location - 96).icon = TileImages.hill1Icon;
						indexedPanels.get(location - 96).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
				}

				else {
					try {
						indexedPanels.get(location - 48).terrain = TerrainType.HILL;
						indexedPanels.get(location - 48).icon = TileImages.hill1Icon;
						indexedPanels.get(location - 48).button.setIcon(indexedPanels.get(location).icon);						} catch (Exception e) {
					}
					try {
						indexedPanels.get(location - 96).terrain = TerrainType.HILL;
						indexedPanels.get(location - 96).icon = TileImages.hill1Icon;
						indexedPanels.get(location - 96).button.setIcon(indexedPanels.get(location).icon);						} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 48).terrain = TerrainType.HILL;
						indexedPanels.get(location + 48).icon = TileImages.hill1Icon;
						indexedPanels.get(location + 48).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 96).terrain = TerrainType.HILL;
						indexedPanels.get(location + 96).icon = TileImages.hill1Icon;
						indexedPanels.get(location + 96).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
					try {
						indexedPanels.get(location + 144).terrain = TerrainType.HILL;
						indexedPanels.get(location + 144).icon = TileImages.hill1Icon;
						indexedPanels.get(location + 144).button.setIcon(indexedPanels.get(location).icon);					} catch (Exception e) {
					}
				}

				int nextPixel = random.nextInt(4) + 1;
				switch (nextPixel) {
				case 1:
					location++;
					break;
				case 2:
					location++;
					break;
				case 3:
					location = location - 47;
					break;
				case 4:
					location = location + 49;
					break;
				}
			}

		}

		for (IndexedPanel panel : indexedPanels) {
			panel.applyColor();
		}

	}

	private void createMountains(TerrainType terrain) {

		Random random = new Random();
		int roll = 0;

		for (IndexedPanel panel : indexedPanels) {

			if (panel.terrain == TerrainType.HILL) {
			roll = random.nextInt(10) + 1;
				if (terrain == TerrainType.HILL) {
					if (roll < 4) {
						panel.terrain = TerrainType.MOUNTAIN;
						if (roll < 2) {
							panel.icon = TileImages.mountain2Icon;
						} else {
						panel.icon = TileImages.mountain1Icon;
						}
						panel.button.setIcon(panel.icon);
					}
				} else {
					if (roll < 2) {
						panel.terrain = TerrainType.MOUNTAIN;
						panel.icon = TileImages.mountain1Icon;
						panel.button.setIcon(panel.icon);					}
				}

			}

		}

	}

	public void refreshMap() {
		for (IndexedPanel panel : indexedPanels) {
			panel.applyColor();
		}
		refreshRegimentColours();
	}
		
	public void	refreshRegimentColours() {
			
		for (Regiment yourRegiment : Main.yourArmy.roster) {
			double dred = (yourRegiment.battleLife * 10 / yourRegiment.life);
			dred = dred / 10;
			int red = 255 - (int) (dred * 255);
			for (int i = 0; i < yourRegiment.panels.length; i++) {
				BattleScreen.battleScene.indexedPanels.get(yourRegiment.panels[i]).button.setIcon(yourRegiment.icon);
				BattleScreen.battleScene.indexedPanels.get(yourRegiment.panels[i]).setBackground(new Color(red, 60, 40));
			}
		}

		for (Regiment enemyRegiment : Main.opponentArmy.roster) {
			double dred = (enemyRegiment.battleLife * 10 / enemyRegiment.life);
			dred = dred / 10;
			int red = 255 - (int) (dred * 255);
			for (int i = 0; i < enemyRegiment.panels.length; i++) {
				BattleScreen.battleScene.indexedPanels.get(enemyRegiment.panels[i]).button.setIcon(enemyRegiment.icon);
				BattleScreen.battleScene.indexedPanels.get(enemyRegiment.panels[i]).setBackground(new Color(red, 40, 60));
			}
		}
	}
}
