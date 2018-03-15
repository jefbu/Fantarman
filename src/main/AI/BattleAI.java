package main.AI;

import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class BattleAI {
	
	public static GlobalBattleStrategy decideGlobalBattleStrategy(Army opponentArmy, Army yourBattleArmy) {
		
		int attack = 0;
		int missile = 0;
		int yourAttack = 0;
		int yourMissile = 0;
		
		for (Regiment regiment: opponentArmy.roster) {
			attack += regiment.totalAttack;
			missile += regiment.totalMissile;
		}
		for (Regiment regiment: yourBattleArmy.roster) {
			yourAttack += regiment.totalAttack;
			yourMissile += regiment.totalMissile;
		}
		
		int attackRatio = attack * 100 / yourAttack;
		int missileRatio = missile * 100 / yourMissile;
		
		if (attackRatio > missileRatio) { return GlobalBattleStrategy.AGGRESSIVE; }
		else { return GlobalBattleStrategy.CAUTIOUS; }
		
		
	}

}
