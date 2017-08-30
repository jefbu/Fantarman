package main.battle.tactics;

import java.util.Random;

import main.entity.armies.Army;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;

public abstract class MoveMethod {

	public static void move(Regiment regiment, int movement, Regiment target, Army activeArmy, int activeRegimentIndex) {

		Random random = new Random();
		int roll;
		int roll2;
		Army tempArmy = new Army();
		for (Regiment tempRegiment: activeArmy.roster) {
			tempArmy.roster.add(tempRegiment);
		}
		tempArmy.roster.remove(activeRegimentIndex);

		for (int i = 0; i < movement; i++) {
			roll = random.nextInt(10);
			roll2 = random.nextInt(10);
			int verticalDistance = DistanceChecker.checkVerticalDistance(regiment, target);
			int horizontalDistance = DistanceChecker.checkHorizontalDistance(regiment, target);

			if (verticalDistance == 0 && horizontalDistance == 0) {
				i = movement;
				regiment.inCombat = true;
				regiment.combatOpponent = target;
				target.inCombat = true;
				target.combatOpponent = regiment;
				OrderMethods.combat(regiment, target, regiment.battleCharge, activeArmy);
			} else {
				if (Math.abs(verticalDistance) > Math.abs(horizontalDistance)) {
					if (verticalDistance < 0) {
						if (roll < (4 + getTerrainBonus(regiment, -48))) {
							if (Adjacency.isNotAdjacenctToFriend(regiment, tempArmy)) {
								regiment.setIndices(regiment.panels[0] - 48);
							}
						}
					}
					if (verticalDistance > 0) {
						if (roll < (4 + getTerrainBonus(regiment, 48))) {
							if (Adjacency.isNotAdjacenctToFriend(regiment, tempArmy)) {
							regiment.setIndices(regiment.panels[0] + 48);
							}
						}
					}
					if (horizontalDistance < 0) {
						if (roll2 < (1 + getTerrainBonus(regiment, -1))) {
							if (Adjacency.isNotAdjacenctToFriend(regiment, tempArmy)) {
							regiment.setIndices(regiment.panels[0] - 1);
							}
						}
					}
					if (horizontalDistance > 0) {
						if (roll2 < (1 + getTerrainBonus(regiment, 1))) {
							if (Adjacency.isNotAdjacenctToFriend(regiment, tempArmy)) {
							regiment.setIndices(regiment.panels[0] + 1);
							}
						}
					}
				} else {
					if (verticalDistance < 0) {
						if (roll < (1 + getTerrainBonus(regiment, -48))) {
							if (Adjacency.isNotAdjacenctToFriend(regiment, tempArmy)) {
							regiment.setIndices(regiment.panels[0] - 48);
							}
						}
					}
					if (verticalDistance > 0) {
						if (roll < (1 + getTerrainBonus(regiment, 48))) {
							if (Adjacency.isNotAdjacenctToFriend(regiment, tempArmy)) {
							regiment.setIndices(regiment.panels[0] + 48);
							}
						}
					}
					if (horizontalDistance < 0) {
						if (roll2 < (4 + getTerrainBonus(regiment, -1))) {
							if (Adjacency.isNotAdjacenctToFriend(regiment, tempArmy)) {
							regiment.setIndices(regiment.panels[0] - 1);
							}
						}
					}
					if (horizontalDistance > 0) {
						if (roll2 < (4 + getTerrainBonus(regiment, 1))) {
							if (Adjacency.isNotAdjacenctToFriend(regiment, tempArmy)) {
							regiment.setIndices(regiment.panels[0] + 1);
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
