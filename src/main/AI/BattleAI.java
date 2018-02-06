package main.AI;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Target;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class BattleAI {
	
	public static GlobalBattleStrategy decideGlobalBattleStrategy(Army army) {
		int cautiousCount = 0;
		int aggressiveCount = 0;
		
		for(Regiment regiment: army.roster) {
			
			switch(regiment.type) {
			case ARCHERS: cautiousCount++; break;
			case ARTILLERY: cautiousCount++; break;
			case COMBINED_ARMS: break;
			case FLYING: break;
			case HEAVY_CAVALRY: aggressiveCount++; break;
			case HEAVY_INFANTRY: aggressiveCount++; break;
			case LIGHT_CAVALRY: break;
			case LIGHT_INFANTRY: break;
			case MONSTER: break;			
			}
		}
		
		if (aggressiveCount > cautiousCount) { return GlobalBattleStrategy.AGGRESSIVE; }
		else return GlobalBattleStrategy.CAUTIOUS;
	}
	
	
	public static void decideRegimentBattleStrategy(Regiment regiment) {
		switch(regiment.type) {
		case ARCHERS: 
			regiment.instructions.get(0).condition = Condition.ALWAYS;
			regiment.instructions.get(0).order = Order.FIRE;
			regiment.instructions.get(0).target = Target.ENEMY_WEAKEST;
			break;
		case ARTILLERY:
			regiment.instructions.get(0).condition = Condition.ALWAYS;
			regiment.instructions.get(0).order = Order.FIRE;
			regiment.instructions.get(0).target = Target.ENEMY_STRONGEST;
			break;
		case COMBINED_ARMS:
			regiment.instructions.get(0).condition = Condition.Life_full;
			regiment.instructions.get(0).order = Order.FIRE;
			regiment.instructions.get(0).target = Target.ENEMY_NEAREST;
			regiment.instructions.get(1).condition = Condition.ALWAYS;
			regiment.instructions.get(1).order = Order.CHARGE;
			regiment.instructions.get(1).target = Target.ENEMY_NEAREST;
			break;
		case FLYING: 
			regiment.instructions.get(0).condition = Condition.ALWAYS;
			regiment.instructions.get(0).order = Order.CHARGE;
			regiment.instructions.get(0).target = Target.ENEMY_WEAKEST;
			break;
		case HEAVY_CAVALRY:
			regiment.instructions.get(0).condition = Condition.ALWAYS;
			regiment.instructions.get(0).order = Order.CHARGE;
			regiment.instructions.get(0).target = Target.ENEMY_STRONGEST;
			break;
		case HEAVY_INFANTRY:
			regiment.instructions.get(0).condition = Condition.ALWAYS;
			regiment.instructions.get(0).order = Order.CHARGE;
			regiment.instructions.get(0).target = Target.ENEMY_STRONGEST;
			break;
		case LIGHT_CAVALRY:
			regiment.instructions.get(0).condition = Condition.Life_full;
			regiment.instructions.get(0).order = Order.FIRE;
			regiment.instructions.get(0).target = Target.ENEMY_NEAREST;
			regiment.instructions.get(0).condition = Condition.ALWAYS;
			regiment.instructions.get(0).order = Order.CHARGE;
			regiment.instructions.get(0).target = Target.ENEMY_NEAREST;
			break;
		case LIGHT_INFANTRY:
			regiment.instructions.get(0).condition = Condition.ALWAYS;
			regiment.instructions.get(0).order = Order.CHARGE;
			regiment.instructions.get(0).target = Target.ENEMY_WEAKEST;
			break;
		case MONSTER:
			regiment.instructions.get(0).condition = Condition.ALWAYS;
			regiment.instructions.get(0).order = Order.CHARGE;
			regiment.instructions.get(0).target = Target.ENEMY_STRONGEST;
			break;
		}
	}
	
	
	
	
	

}
