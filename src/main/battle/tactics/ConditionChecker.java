package main.battle.tactics;

import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public class ConditionChecker {

	public static Tactic checkConditions(Regiment regiment, int turn, Army activeArmy, Army opponentBattleArmy,
			Army yourBattleArmy) {

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
				Target checkedTarget = null;
				for (Tactic targetTactic : regiment.instructions) {
					if (targetTactic.condition == Condition.Target_in_Range) {
						checkedTarget = targetTactic.target;
					}
				}
				Regiment targetRegiment = TargetChecker.checkTarget(regiment, checkedTarget, activeArmy, yourBattleArmy,
						opponentBattleArmy);

				int horizontalTargetInRAnceDistance = DistanceChecker.checkHorizontalDistance(regiment, targetRegiment);
				if (Math.abs(horizontalTargetInRAnceDistance) <= regiment.baseRange) {
					int verticalTargetInRangeDistance = DistanceChecker.checkVerticalDistance(regiment, targetRegiment);
					if (Math.abs(verticalTargetInRangeDistance) <= regiment.baseRange) {
						return tactic;
					}
				}
				break;

			case Any_in_Range:
				if (activeArmy == yourBattleArmy) {
					for (Regiment opponentRegiment : opponentBattleArmy.roster) {
						int horizontalDistance = DistanceChecker.checkHorizontalDistance(regiment, opponentRegiment);
						if (Math.abs(horizontalDistance) <= regiment.battleRange) {
							int verticalDistance = DistanceChecker.checkVerticalDistance(regiment, opponentRegiment);
							if (Math.abs(verticalDistance) <= regiment.battleRange) {
								return tactic;
							}
						}
					}
				} else {

					for (Regiment opponentRegiment : yourBattleArmy.roster) {
						int horizontalDistance = DistanceChecker.checkHorizontalDistance(regiment, opponentRegiment);
						if (Math.abs(horizontalDistance) <= regiment.battleRange) {
							int verticalDistance = DistanceChecker.checkVerticalDistance(regiment, opponentRegiment);
							if (Math.abs(verticalDistance) <= regiment.battleRange) {
								return tactic;
							}
						}
					}
				}
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
