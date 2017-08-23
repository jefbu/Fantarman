package main.battle.tactics;

import java.util.Collections;
import java.util.Comparator;

import main.Main;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public class TargetChecker {
	
	
	
	public static Regiment checkTarget(Regiment regiment, Target target, Army activeArmy) {

		switch (target) {

		case ENEMY_STRONGEST:
			if (activeArmy == Main.yourArmy) {
			Collections.sort(Main.opponentArmy.roster, new Comparator<Regiment>() {
				@Override
				public int compare(Regiment p1, Regiment p2) {
					return p2.battleLife - p1.battleLife;
				}
			});
			return Main.opponentArmy.roster.get(0);
			} else {
			Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
				@Override
				public int compare(Regiment p1, Regiment p2) {
					return p2.battleLife - p1.battleLife;
				}
			});
			return Main.yourArmy.roster.get(0);
			}
			
		case ENEMY_WEAKEST:
			if (activeArmy == Main.yourArmy) {
			Collections.sort(Main.opponentArmy.roster, new Comparator<Regiment>() {
				@Override
				public int compare(Regiment p1, Regiment p2) {
					return p1.battleLife - p2.battleLife;
				}
			});
			return Main.opponentArmy.roster.get(0);
			} else {
			Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
				@Override
				public int compare(Regiment p1, Regiment p2) {
					return p1.battleLife - p2.battleLife;
				}
			});
			return Main.yourArmy.roster.get(0);
			}		case ENEMY_NEAREST:
			if (activeArmy == Main.yourArmy) {
				return Main.opponentArmy.roster.get(0);
			} else {
				return Main.yourArmy.roster.get(0);
			}
		case SELF:
			return regiment;

		}

		return regiment;

	}

}
