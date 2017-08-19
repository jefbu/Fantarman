package main.battle.tactics;

import main.Main;
import main.entity.regiments.Regiment;

public class TargetChecker {
	
	
	
	public static Regiment checkTarget(Regiment regiment, Target target) {

		switch (target) {

		case ENEMY_STRONGEST:
			return Main.opponentArmy.roster.get(0);
		case ENEMY_WEAKEST:
			return Main.opponentArmy.roster.get(0);
		case ENEMY_NEAREST:
			return Main.opponentArmy.roster.get(0);
		case SELF:
			return regiment;

		}

		return regiment;

	}

}
