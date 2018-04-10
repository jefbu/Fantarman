package main.battle.tactics;

import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class Adjacency {

	public static boolean isAdjacenctToFriend(Regiment regiment, Army army) {

		int regimentPanelLength = regiment.panels.length;
		int armyRosterSize = army.roster.size();

		for (int i = 0; i < regimentPanelLength; i++) {
			for (int ii = 0; ii < armyRosterSize; ii++) {
				for (int iii = 0; iii < army.roster.get(ii).panels.length; iii++) {
					if (regiment.panels[i] == army.roster.get(ii).panels[iii] - 1) {
						return true;
					} else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 1) {
						return true;
					} else if (regiment.panels[i] == army.roster.get(ii).panels[iii] - 48) {
						return true;
					} else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 48) {
						return true;
					} else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 47) {
						return true;
					} else if (regiment.panels[i] == army.roster.get(ii).panels[iii] - 47) {
						return true;
					} else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 49) {
						return true;
					} else if (regiment.panels[i] == army.roster.get(ii).panels[iii] + 49) {
						return true;
					}
				}
			}
		}

		return false;

	}

	public static Regiment isAdjacentToEnemy(Regiment regiment, Army activeArmy, Army yourBattleArmy,
			Army opponentBattleArmy) {
		
		if (activeArmy == yourBattleArmy) {
			
			int regimentPanelLength = regiment.panels.length;
			int armyRosterSize = opponentBattleArmy.roster.size();

			for (int i = 0; i < regimentPanelLength; i++) {
				for (int ii = 0; ii < armyRosterSize; ii++) {
					for (int iii = 0; iii < opponentBattleArmy.roster.get(ii).panels.length; iii++) {
						if (regiment.panels[i] == opponentBattleArmy.roster.get(ii).panels[iii] - 1) {
							return opponentBattleArmy.roster.get(ii);
						} else if (regiment.panels[i] == opponentBattleArmy.roster.get(ii).panels[iii] + 1) {
							return opponentBattleArmy.roster.get(ii);
						} else if (regiment.panels[i] == opponentBattleArmy.roster.get(ii).panels[iii] - 48) {
							return opponentBattleArmy.roster.get(ii);
						} else if (regiment.panels[i] == opponentBattleArmy.roster.get(ii).panels[iii] + 48) {
							return opponentBattleArmy.roster.get(ii);
						} else if (regiment.panels[i] == opponentBattleArmy.roster.get(ii).panels[iii] + 47) {
							return opponentBattleArmy.roster.get(ii);
						} else if (regiment.panels[i] == opponentBattleArmy.roster.get(ii).panels[iii] - 47) {
							return opponentBattleArmy.roster.get(ii);
						} else if (regiment.panels[i] == opponentBattleArmy.roster.get(ii).panels[iii] + 49) {
							return opponentBattleArmy.roster.get(ii);
						} else if (regiment.panels[i] == opponentBattleArmy.roster.get(ii).panels[iii] + 49) {
							return opponentBattleArmy.roster.get(ii);
						}
					}
				}
			}
			
		} else {
				
				int regimentPanelLength = regiment.panels.length;
				int armyRosterSize = yourBattleArmy.roster.size();

				for (int i = 0; i < regimentPanelLength; i++) {
					for (int ii = 0; ii < armyRosterSize; ii++) {
						for (int iii = 0; iii < yourBattleArmy.roster.get(ii).panels.length; iii++) {
							if (regiment.panels[i] == yourBattleArmy.roster.get(ii).panels[iii] - 1) {
								return yourBattleArmy.roster.get(ii);
							} else if (regiment.panels[i] == yourBattleArmy.roster.get(ii).panels[iii] + 1) {
								return yourBattleArmy.roster.get(ii);
							} else if (regiment.panels[i] == yourBattleArmy.roster.get(ii).panels[iii] - 48) {
								return yourBattleArmy.roster.get(ii);
							} else if (regiment.panels[i] == yourBattleArmy.roster.get(ii).panels[iii] + 48) {
								return yourBattleArmy.roster.get(ii);
							} else if (regiment.panels[i] == yourBattleArmy.roster.get(ii).panels[iii] + 47) {
								return yourBattleArmy.roster.get(ii);
							} else if (regiment.panels[i] == yourBattleArmy.roster.get(ii).panels[iii] - 47) {
								return yourBattleArmy.roster.get(ii);
							} else if (regiment.panels[i] == yourBattleArmy.roster.get(ii).panels[iii] + 49) {
								return yourBattleArmy.roster.get(ii);
							} else if (regiment.panels[i] == yourBattleArmy.roster.get(ii).panels[iii] + 49) {
								return yourBattleArmy.roster.get(ii);
							}
						}
					}
				}
			}
		
		return null;

	}

}
