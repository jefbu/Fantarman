package main.battle.tactics;

import main.entity.regiments.Regiment;

public class ConditionChecker {
	
	public static Tactic checkConditions(Regiment regiment) {
		
		for (Tactic tactic : regiment.instructions) {
			switch (tactic.condition) {

			case Life_full:
				if (regiment.battleLife == regiment.totalLife) {
					return tactic;
				} else {
					break;
				}
			
			case Life_under_100:
				if (regiment.battleLife < regiment.totalLife) {
					return tactic;
				} else { 
					break; 
				}
				
			case Life_under_75:
				if (regiment.battleLife < regiment.totalLife * 3 / 4) {
					return tactic;
				} else { 
					break; 
				}
				
			case Life_under_50:
				if (regiment.battleLife < regiment.totalLife / 2) {
					return tactic;
				} else { 
					break; 
				}
				
			case Life_under_25:
				if (regiment.battleLife < regiment.totalLife / 4) {
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
