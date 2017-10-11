package main.battle.tactics;

import main.entity.regiments.Regiment;

public class ConditionChecker {
	
	public static Tactic checkConditions(Regiment regiment) {
		
		for (Tactic tactic : regiment.instructions) {
			switch (tactic.condition) {

			case Life_under_100:
				if (regiment.battleLife < regiment.life) {
					return tactic;
				} else { 
					break; 
				}
					
			case FULL_HEALTH:
				if (regiment.battleLife == regiment.life) {
					return tactic;
				} else {
					break;
				}
				
			case HALF_HEALTH:
				if (regiment.battleLife > regiment.life / 2) {
					return tactic;
				} else {
					break;
				}
				
			case ALWAYS:
				return tactic;
			}
		}
		return new Tactic(Condition.ALWAYS, Target.SELF, Order.RECOVER);
		
	}

}
