package main.battle.tactics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public class TargetChecker {

	public static Regiment checkTarget(Regiment regiment, Target target, Army activeArmy, Army yourBattleArmy,
			Army opponentBattleArmy) {

		switch (target) {

		case ENEMY_STRONGEST:
			if (activeArmy == yourBattleArmy) {
				Collections.sort(opponentBattleArmy.roster, new Comparator<Regiment>() {
					@Override
					public int compare(Regiment p1, Regiment p2) {
						return p2.battleLife - p1.battleLife;
					}
				});
				return opponentBattleArmy.roster.get(0);
			} else {
				Collections.sort(yourBattleArmy.roster, new Comparator<Regiment>() {
					@Override
					public int compare(Regiment p1, Regiment p2) {
						return p2.battleLife - p1.battleLife;
					}
				});
				return yourBattleArmy.roster.get(0);
			}

		case ENEMY_WEAKEST:
			if (activeArmy == yourBattleArmy) {
				Collections.sort(opponentBattleArmy.roster, new Comparator<Regiment>() {
					@Override
					public int compare(Regiment p1, Regiment p2) {
						return p1.battleLife - p2.battleLife;
					}
				});
				return opponentBattleArmy.roster.get(0);
			} else {
				Collections.sort(yourBattleArmy.roster, new Comparator<Regiment>() {
					@Override
					public int compare(Regiment p1, Regiment p2) {
						return p1.battleLife - p2.battleLife;
					}
				});
				return yourBattleArmy.roster.get(0);
			}
		case ENEMY_NEAREST:
			if (activeArmy == yourBattleArmy) {
				int totalDistance = 0;
				Regiment finalTarget = null;
			for (Regiment opponentRegiment: opponentBattleArmy.roster) {
				int horizontalDistance = DistanceChecker.checkHorizontalDistance(regiment, opponentRegiment);
				int verticalDistance = DistanceChecker.checkVerticalDistance(regiment, opponentRegiment);
				if (Math.abs(verticalDistance) + Math.abs(horizontalDistance) > totalDistance) {
				totalDistance = horizontalDistance + verticalDistance;
				finalTarget = opponentRegiment;
				}
			}
			return finalTarget;
		} else {
				int totalDistance = 0;
				Regiment finalTarget = null;
			for (Regiment yourRegiment: yourBattleArmy.roster) {
				int horizontalDistance = DistanceChecker.checkHorizontalDistance(regiment, yourRegiment);
				int verticalDistance = DistanceChecker.checkVerticalDistance(regiment, yourRegiment);
				if (Math.abs(verticalDistance) + Math.abs(horizontalDistance) > totalDistance) {
				totalDistance = horizontalDistance + verticalDistance;
				finalTarget = yourRegiment;
				}
			}
			return finalTarget;
		}
		case SELF:
			return regiment;
		case FROM_LIST:
			ArrayList<Regiment> potentialTargets= new ArrayList<Regiment>();
			if (activeArmy == yourBattleArmy) {
				for (Regiment opponentRegiment : opponentBattleArmy.roster) {
					int horizontalDistance = DistanceChecker.checkHorizontalDistance(regiment, opponentRegiment);
					if (Math.abs(horizontalDistance) <= regiment.battleRange) {
						int verticalDistance = DistanceChecker.checkVerticalDistance(regiment, opponentRegiment);
						if (Math.abs(verticalDistance) <= regiment.battleRange) {
							potentialTargets.add(opponentRegiment);
						}
					}
				}
			} else {

				for (Regiment opponentRegiment : yourBattleArmy.roster) {
					int horizontalDistance = DistanceChecker.checkHorizontalDistance(regiment, opponentRegiment);
					if (Math.abs(horizontalDistance) <= regiment.battleRange) {
						int verticalDistance = DistanceChecker.checkVerticalDistance(regiment, opponentRegiment);
						if (Math.abs(verticalDistance) <= regiment.battleRange) {
							potentialTargets.add(opponentRegiment);
						}
					}
				}
			}
			Random random = new Random();
			return (potentialTargets.get(random.nextInt(potentialTargets.size())));

		default:
			break;

		}

		return regiment;

	}

}
