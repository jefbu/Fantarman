package main.battle.tactics;

import main.entity.regiments.Regiment;

public class ConditionChecker {
	
	public static Tactic checkConditions(Regiment regiment, int turn) {
		
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

			case After_1_Turn:
				if (turn > 0) {
					return tactic;
				} else {
					break;
				}
				
			case After_2_Turns:
				if (turn > 1) {
					return tactic;
				} else {
				break;
				}
				
			case After_3_Turns:
				if (turn > 2) {
					return tactic;
				} else {
				break;
				}
				
			case After_4_Turns:
				if (turn > 3) {
					return tactic;
				} else {
				break;
				}

			case After_5_Turns:
				if (turn > 4) {
					return tactic;
				} else {
				break;
				}
				
			case Life_above_25:
				if (regiment.battleLife > regiment.totalLife / 4) {
					return tactic;
				} else {
				break;
				}
				
			case Life_above_50:
				if (regiment.battleLife > regiment.totalLife / 2) {
					return tactic;
				} else {
				break;
				}
				
			case Life_above_75:
				if (regiment.battleLife > regiment.totalLife * 3 / 4) {
					return tactic;
				} else {
				break;
				}
				
			case Target_in_Range:
				break;
			case Any_in_Range:
				break;
				
				
			case ALWAYS:
				return tactic;
				
			default:
				break;
			}
		}
		return new Tactic(Condition.ALWAYS, Target.SELF, Order.RECOVER);
		
	}

}
