package main.battle.tactics;

import main.Main;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public class TargetChecker {
	
	
	
	public static Regiment checkTarget(Regiment regiment, Target target, Army activeArmy) {

		switch (target) {

		case ENEMY_STRONGEST:
			return Main.opponentArmy.roster.get(0);
		case ENEMY_WEAKEST:
			return Main.opponentArmy.roster.get(0);
		case ENEMY_NEAREST:
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
