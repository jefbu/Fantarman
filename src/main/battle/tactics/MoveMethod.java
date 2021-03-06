package main.battle.tactics;

import java.util.Random;

import main.entity.armies.Army;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;

public abstract class MoveMethod {

	public static void moveForward(Regiment regiment, int movement, Army activeArmy, int activeRegimentIndex,
			Army yourBattleArmy, Army opponentBattleArmy) {
		
		Random random = new Random();
		int roll;
		Army tempArmy = new Army();
		for (Regiment tempRegiment : activeArmy.roster) {
			tempArmy.roster.add(tempRegiment);
		}
		tempArmy.roster.remove(activeRegimentIndex);
		
		if (regiment.panels[0] > 767) {
			
			for (int i = 0; i < movement; i++) {
				roll = random.nextInt(10);
				
				if (roll < (4 + getTerrainBonus(regiment, -48))) {
					regiment.setIndices(regiment.panels[0] - 48);
				
					if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
						regiment.setIndices(regiment.panels[0] + 48);
					}
				}
				Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
						opponentBattleArmy);
				if (opponent != null) {
					regiment.inCombat = true;
					regiment.combatOpponent = opponent;
					regiment.defender = false;
					opponent.inCombat = true;
					opponent.combatOpponent = regiment;
					opponent.defender = true;
					i = movement;
					OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
							opponentBattleArmy);
				}
			}	
		}
		
		else {
			
			for (int i = 0; i < movement; i++) {
				roll = random.nextInt(10);
				
				if (roll < (4 + getTerrainBonus(regiment, 48))) {
					regiment.setIndices(regiment.panels[0] + 48);
				
					if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
						regiment.setIndices(regiment.panels[0] - 48);
					}
				}
				Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
						opponentBattleArmy);
				if (opponent != null) {
					regiment.inCombat = true;
					regiment.combatOpponent = opponent;
					opponent.inCombat = true;
					opponent.combatOpponent = regiment;
					opponent.defender = true;
					i = movement;
					OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
							opponentBattleArmy);
				}
			}
			
			
		}
		
		
		
		
	}

	public static void move(Regiment regiment, int movement, Regiment target, Army activeArmy, int activeRegimentIndex,
			Army yourBattleArmy, Army opponentBattleArmy) {

		Random random = new Random();
		int roll;
		int roll2;
		Army tempArmy = new Army();
		for (Regiment tempRegiment : activeArmy.roster) {
			tempArmy.roster.add(tempRegiment);
		}
		tempArmy.roster.remove(activeRegimentIndex);

		for (int i = 0; i < movement; i++) {
			roll = random.nextInt(10);
			roll2 = random.nextInt(10);
			int verticalDistance = DistanceChecker.checkVerticalDistance(regiment, target);
			int horizontalDistance = DistanceChecker.checkHorizontalDistance(regiment, target);

			if (Math.abs(verticalDistance) < 2 && Math.abs(horizontalDistance) < 2) {
				i = movement;
				regiment.inCombat = true;
				regiment.combatOpponent = target;
				target.inCombat = true;
				target.combatOpponent = regiment;
				target.defender = true;
				OrderMethods.combat(regiment, target, regiment.battleCharge, activeArmy, yourBattleArmy,
						opponentBattleArmy);
			} else {
				if (Math.abs(verticalDistance) > Math.abs(horizontalDistance)) {
					if (verticalDistance < 0) {
						if (roll < (4 + getTerrainBonus(regiment, -48))) {
							regiment.setIndices(regiment.panels[0] - 48);
							if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
								regiment.setIndices(regiment.panels[0] + 48);
							}

							Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
									opponentBattleArmy);
							if (opponent != null) {
								regiment.inCombat = true;
								regiment.combatOpponent = opponent;
								opponent.inCombat = true;
								opponent.combatOpponent = regiment;
								opponent.defender = true;
								i = movement;
								OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
										opponentBattleArmy);
							}
						}
					}
					if (verticalDistance > 0) {
						if (roll < (4 + getTerrainBonus(regiment, 48))) {
							regiment.setIndices(regiment.panels[0] + 48);
							if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
								regiment.setIndices(regiment.panels[0] - 48);
							}
							Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
									opponentBattleArmy);
							if (opponent != null) {
								regiment.inCombat = true;
								regiment.combatOpponent = opponent;
								opponent.inCombat = true;
								opponent.combatOpponent = regiment;
								opponent.defender = true;
								i = movement;
								OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
										opponentBattleArmy);
							}
						}
					}
					if (horizontalDistance < 0) {
						if (roll2 < (1 + getTerrainBonus(regiment, -1))) {
							regiment.setIndices(regiment.panels[0] - 1);
							if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
								regiment.setIndices(regiment.panels[0] + 1);
							}
							Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
									opponentBattleArmy);
							if (opponent != null) {
								regiment.inCombat = true;
								regiment.combatOpponent = opponent;
								opponent.inCombat = true;
								opponent.combatOpponent = regiment;
								opponent.defender = true;
								i = movement;
								OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
										opponentBattleArmy);
							}
						}
					}
					if (horizontalDistance > 0) {
						if (roll2 < (1 + getTerrainBonus(regiment, 1))) {
							regiment.setIndices(regiment.panels[0] + 1);
							if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
								regiment.setIndices(regiment.panels[0] - 1);
							}
							Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
									opponentBattleArmy);
							if (opponent != null) {
								regiment.inCombat = true;
								regiment.combatOpponent = opponent;
								opponent.inCombat = true;
								opponent.combatOpponent = regiment;
								opponent.defender = true;
								i = movement;
								OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
										opponentBattleArmy);
							}
						}
					}
				} else {
					if (verticalDistance < 0) {
						if (roll < (1 + getTerrainBonus(regiment, -48))) {
							regiment.setIndices(regiment.panels[0] - 48);
							if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
								regiment.setIndices(regiment.panels[0] + 48);
							}
							Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
									opponentBattleArmy);
							if (opponent != null) {
								regiment.inCombat = true;
								regiment.combatOpponent = opponent;
								opponent.inCombat = true;
								opponent.combatOpponent = regiment;
								opponent.defender = true;
								i = movement;
								OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
										opponentBattleArmy);
							}
						}
					}
					if (verticalDistance > 0) {
						if (roll < (1 + getTerrainBonus(regiment, 48))) {
							regiment.setIndices(regiment.panels[0] + 48);
							if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
								regiment.setIndices(regiment.panels[0] - 48);
							}
							Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
									opponentBattleArmy);
							if (opponent != null) {
								regiment.inCombat = true;
								regiment.combatOpponent = opponent;
								opponent.inCombat = true;
								opponent.combatOpponent = regiment;
								opponent.defender = true;
								i = movement;
								OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
										opponentBattleArmy);
							}
						}
					}
					if (horizontalDistance < 0) {
						if (roll2 < (4 + getTerrainBonus(regiment, -1))) {
							regiment.setIndices(regiment.panels[0] - 1);
							if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
								regiment.setIndices(regiment.panels[0] + 1);
							}
							Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
									opponentBattleArmy);
							if (opponent != null) {
								regiment.inCombat = true;
								regiment.combatOpponent = opponent;
								opponent.inCombat = true;
								opponent.combatOpponent = regiment;
								opponent.defender = true;
								i = movement;
								OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
										opponentBattleArmy);
							}
						}
					}
					if (horizontalDistance > 0) {
						if (roll2 < (4 + getTerrainBonus(regiment, 1))) {
							regiment.setIndices(regiment.panels[0] + 1);
							if (Adjacency.isAdjacenctToFriend(regiment, tempArmy)) {
								regiment.setIndices(regiment.panels[0] - 1);
							}
							Regiment opponent = Adjacency.isAdjacentToEnemy(regiment, activeArmy, yourBattleArmy,
									opponentBattleArmy);
							if (opponent != null) {
								regiment.inCombat = true;
								regiment.combatOpponent = opponent;
								opponent.inCombat = true;
								opponent.combatOpponent = regiment;
								opponent.defender = true;
								i = movement;
								OrderMethods.combat(regiment, opponent, regiment.battleCharge, activeArmy, yourBattleArmy,
										opponentBattleArmy);
							}
						}
					}
				}

			}
		}

	}

	private static int getTerrainBonus(Regiment regiment, int direction) {
		switch (BattleScreen.battleScene.indexedPanels.get(regiment.panels[0] + direction).terrain) {
		case DESERT:
			return 3;
		case FOREST:
			return 2;
		case GRASS:
			return 4;
		case HILL:
			return 2;
		case MOUNTAIN:
			return 1;
		case RIVER:
			return 1;
		case ROAD:
			return 5;
		}
		return 0;
	}

}
