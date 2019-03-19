package main.battle.tactics;

import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;
import main.utility.TerrainType;

public abstract class TerrainBonus {

	public static int addTerrainBonus(Regiment regiment) {
		
		TerrainType terrain = BattleScreen.battleScene.indexedPanels.get(regiment.panels[0]).terrain;
		
		switch(terrain) {
		case DESERT: return 5;
		case FOREST: return 5;
		case GRASS: return 0;
		case HILL: return 10;
		case MOUNTAIN: return 15;
		case RIVER: return -10;
		case ROAD: return 0;
		default: return 0;
		
		}
				
	}
	
}
