package main.battle.tactics;

import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class Adjacency {
	
	public static boolean isNotAdjacenctToFriend(Regiment regiment, Army army) {

		int regimentPanelLength = regiment.panels.length;
		int armyRosterSize = army.roster.size();

		for (int i = 0; i < regimentPanelLength; i++) {
			for (int ii = 0; ii < armyRosterSize; ii++) {
				for (int iii = 0; iii < army.roster.get(ii).panels.length; iii++) {
					if (regiment.panels[i] == army.roster.get(ii).panels[iii] - 1) { return false; }
					else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 1) { return false; }
					else if (regiment.panels[i] == army.roster.get(ii).panels[iii] - 48) { return false; }
					else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 48) { return false; }
					else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 47) { return false; }
					else if (regiment.panels[i] == army.roster.get(ii).panels[iii] - 47) { return false; }
					else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 49) { return false; }
					else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 49) { return false; }
				}
			}
		}
		
		return true;
		
	}
	
	public static boolean isAdjacentToEnemy(Regiment regiment) {
		
		return false;
		
	}


}
