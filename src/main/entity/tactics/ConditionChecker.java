package main.entity.tactics;

import main.entity.regiments.Regiment;

public class ConditionChecker {
	
	public static Tactic checkConditions(Regiment regiment) {
		
		for (Tactic tactic : regiment.instructions) {
			switch (tactic.condition) {

			case FULL_HEALTH:
				if (regiment.battleLife == regiment.life)
					return tactic;
			case HALF_HEALTH:
				if (regiment.battleLife > regiment.life / 2)
					return tactic;
			case ALWAYS:
				return tactic;
			}
		}
		return regiment.instructions.get(0);
		
	}

}
