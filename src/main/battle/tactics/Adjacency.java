package main.battle.tactics;

import java.util.ArrayList;

import main.Main;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class Adjacency {
	
	public static boolean isNotAdjacenctToFriend(Regiment regiment, Army army) {
		ArrayList<Regiment> tempArmy = new ArrayList<Regiment>();
		for (Regiment unit: army.roster) {
			tempArmy.add(unit);
			tempArmy.remove(regiment);
		}
		for (int i = 0; i < regiment.panels.length; i++) {
			for (int ii = 0; ii < Main.yourArmy.roster.size(); ii++) {
				for (int iii = 0; iii < Main.yourArmy.roster.get(ii).panels.length; iii++) {
					if (regiment.panels[i] == Main.yourArmy.roster.get(ii).panels[iii] - 1) { return false; }
					else if (regiment.panels[i] == Main.yourArmy.roster.get(ii).panels[iii] + 1) { return false; }
					else if (regiment.panels[i] == Main.yourArmy.roster.get(ii).panels[iii] - 48) { return false; }
					else if (regiment.panels[i] == Main.yourArmy.roster.get(ii).panels[iii] + 48) { return false; }
					else if (regiment.panels[i] == Main.yourArmy.roster.get(ii).panels[iii] + 47) { return false; }
					else if (regiment.panels[i] == Main.yourArmy.roster.get(ii).panels[iii] - 47) { return false; }
					else if (regiment.panels[i] == Main.yourArmy.roster.get(ii).panels[iii] + 49) { return false; }
					else if (regiment.panels[i] == Main.yourArmy.roster.get(ii).panels[iii] + 49) { return false; }
				}
			}
		}
		
		return true;
		
	}
	
	public static boolean isAdjacentToEnemy(Regiment regiment) {
		
		return false;
		
	}


}
