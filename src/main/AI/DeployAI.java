package main.AI;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Target;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class DeployAI {

	
	public static void setOpponentDeploymentIndices(Army opponentBattleArmy) {

		switch(opponentBattleArmy.deploymentStrategy) {
		case Alternate_archer_defender: setIndicesAlternateArcherDefender(opponentBattleArmy); break;
		case Solid_centre_charge: setIndicesSolidCentreCharger(opponentBattleArmy); break;
		case Tight_archer_centre: setIndicesTightArcherCentre(opponentBattleArmy); break;
		}
	}


	private static void setIndicesTightArcherCentre(Army opponentBattleArmy) {
		setIndicesAlternateArcherDefender(opponentBattleArmy);
	}


	private static void setIndicesSolidCentreCharger(Army opponentBattleArmy) {
		
		int archers = 0;
		int defenders = 0;
		int others = 0;
		
		Collections.sort(opponentBattleArmy.roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment o1, Regiment o2) {
				return o2.totalAttack - o1.totalAttack;
			}
		});
		
		for (Regiment regiment: opponentBattleArmy.roster) {
			switch(regiment.type) {
			case ARCHERS: archers++; break;
			case ARTILLERY: archers++; break;
			case COMBINED_ARMS: archers++; break;
			case FLYING: others++; break;
			case HEAVY_CAVALRY: defenders++; break;
			case HEAVY_INFANTRY: defenders++; break;
			case LIGHT_CAVALRY: others++; break;
			case LIGHT_INFANTRY: defenders++; break;
			case HERO: defenders++; break;			
			}
		}
		
		for (int i = 0; i < defenders; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 206;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 211;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 216;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 221;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 274;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 249;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 8;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 36;
			}
		}
		
		for (int i = 0 + defenders; i < others + defenders; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 206;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 211;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 216;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 221;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 274;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 249;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 8;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 36;
			}
		}
		
		for (int i = 0 + others + defenders; i < others + archers + defenders; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 206;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 211;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 216;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 221;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 274;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 249;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 8;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 36;
			}
		}
	}


	private static void setIndicesAlternateArcherDefender(Army opponentBattleArmy) {
		
		int archers = 0;
		int defenders = 0;
		int others = 0;
		
		Collections.sort(opponentBattleArmy.roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment o1, Regiment o2) {
				return o2.totalMissile - o1.totalMissile; 
			}
		});
		
		for (Regiment regiment: opponentBattleArmy.roster) {
			switch(regiment.type) {
			case ARCHERS: archers++; break;
			case ARTILLERY: archers++; break;
			case COMBINED_ARMS: archers++; break;
			case FLYING: others++; break;
			case HEAVY_CAVALRY: defenders++; break;
			case HEAVY_INFANTRY: defenders++; break;
			case LIGHT_CAVALRY: others++; break;
			case LIGHT_INFANTRY: defenders++; break;
			case HERO: defenders++; break;			
			}
		}
		
		for (int i = 0; i < archers; i++) {
			switch(i) {
			case 0: 
				opponentBattleArmy.roster.get(0).hiddenIndex = 36;
				opponentBattleArmy.roster.get(0).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(0).instructions.get(0).target = Target.ENEMY_WEAKEST;
				opponentBattleArmy.roster.get(0).instructions.get(0).order = Order.FIRE;
				break;
			case 1: 
				opponentBattleArmy.roster.get(1).hiddenIndex = 26;
				opponentBattleArmy.roster.get(1).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(1).instructions.get(0).target = Target.ENEMY_WEAKEST;
				opponentBattleArmy.roster.get(1).instructions.get(0).order = Order.FIRE;
				break;
			case 2: 
				opponentBattleArmy.roster.get(2).hiddenIndex = 16;
				opponentBattleArmy.roster.get(2).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(2).instructions.get(0).target = Target.ENEMY_WEAKEST;
				opponentBattleArmy.roster.get(2).instructions.get(0).order = Order.FIRE;
				break;
			case 3: 
				opponentBattleArmy.roster.get(3).hiddenIndex = 11;
				opponentBattleArmy.roster.get(3).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(3).instructions.get(0).target = Target.ENEMY_WEAKEST;
				opponentBattleArmy.roster.get(3).instructions.get(0).order = Order.FIRE;
				break;
			case 4: 
				opponentBattleArmy.roster.get(4).hiddenIndex = 21;
				opponentBattleArmy.roster.get(4).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(4).instructions.get(0).target = Target.ENEMY_WEAKEST;
				opponentBattleArmy.roster.get(4).instructions.get(0).order = Order.FIRE;
				break;
			case 5: 
				opponentBattleArmy.roster.get(5).hiddenIndex = 31;
				opponentBattleArmy.roster.get(5).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(5).instructions.get(0).target = Target.ENEMY_WEAKEST;
				opponentBattleArmy.roster.get(5).instructions.get(0).order = Order.FIRE;
				break;
			case 6: 
				opponentBattleArmy.roster.get(6).hiddenIndex = 248;
				opponentBattleArmy.roster.get(6).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(6).instructions.get(0).target = Target.ENEMY_WEAKEST;
				opponentBattleArmy.roster.get(6).instructions.get(0).order = Order.FIRE;
				break;
			case 7: 
				opponentBattleArmy.roster.get(7).hiddenIndex = 277;
				opponentBattleArmy.roster.get(7).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(7).instructions.get(0).target = Target.ENEMY_WEAKEST;
				opponentBattleArmy.roster.get(7).instructions.get(0).order = Order.FIRE;
				break;
			}
		}
		
		for (int i = 0 + archers; i < defenders + archers; i++) {
			switch(i) {
			case 0: 
				opponentBattleArmy.roster.get(0).hiddenIndex = 36;
				opponentBattleArmy.roster.get(0).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(0).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(0).instructions.get(0).order = Order.CHARGE;
				break;
			case 1: 
				opponentBattleArmy.roster.get(1).hiddenIndex = 26;
				opponentBattleArmy.roster.get(1).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(1).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(1).instructions.get(0).order = Order.CHARGE;
				break;
			case 2: 
				opponentBattleArmy.roster.get(2).hiddenIndex = 16;
				opponentBattleArmy.roster.get(2).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(2).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(2).instructions.get(0).order = Order.CHARGE;
				break;
			case 3: 
				opponentBattleArmy.roster.get(3).hiddenIndex = 11;
				opponentBattleArmy.roster.get(3).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(3).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(3).instructions.get(0).order = Order.CHARGE;
				break;
			case 4: 
				opponentBattleArmy.roster.get(4).hiddenIndex = 21;
				opponentBattleArmy.roster.get(4).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(4).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(4).instructions.get(0).order = Order.CHARGE;
				break;
			case 5: 
				opponentBattleArmy.roster.get(5).hiddenIndex = 31;
				opponentBattleArmy.roster.get(5).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(5).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(5).instructions.get(0).order = Order.CHARGE;
				break;
			case 6: 
				opponentBattleArmy.roster.get(6).hiddenIndex = 248;
				opponentBattleArmy.roster.get(6).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(6).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(6).instructions.get(0).order = Order.CHARGE;
				break;
			case 7: 
				opponentBattleArmy.roster.get(7).hiddenIndex = 277;
				opponentBattleArmy.roster.get(7).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(7).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(7).instructions.get(0).order = Order.CHARGE;
				break;
			}
		}
		
		for (int i = 0 + archers + defenders; i < others + archers + defenders; i++) {
			switch(i) {
			case 0: 
				opponentBattleArmy.roster.get(0).hiddenIndex = 36;
				opponentBattleArmy.roster.get(0).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(0).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(0).instructions.get(0).order = Order.CHARGE;
				break;
			case 1: 
				opponentBattleArmy.roster.get(1).hiddenIndex = 26;
				opponentBattleArmy.roster.get(1).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(1).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(1).instructions.get(0).order = Order.CHARGE;
				break;
			case 2: 
				opponentBattleArmy.roster.get(2).hiddenIndex = 16;
				opponentBattleArmy.roster.get(2).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(2).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(2).instructions.get(0).order = Order.CHARGE;
				break;
			case 3: 
				opponentBattleArmy.roster.get(3).hiddenIndex = 11;
				opponentBattleArmy.roster.get(3).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(3).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(3).instructions.get(0).order = Order.CHARGE;
				break;
			case 4: 
				opponentBattleArmy.roster.get(4).hiddenIndex = 21;
				opponentBattleArmy.roster.get(4).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(4).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(4).instructions.get(0).order = Order.CHARGE;
				break;
			case 5: 
				opponentBattleArmy.roster.get(5).hiddenIndex = 31;
				opponentBattleArmy.roster.get(5).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(5).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(5).instructions.get(0).order = Order.CHARGE;
				break;
			case 6: 
				opponentBattleArmy.roster.get(6).hiddenIndex = 248;
				opponentBattleArmy.roster.get(6).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(6).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(6).instructions.get(0).order = Order.CHARGE;
				break;
			case 7: 
				opponentBattleArmy.roster.get(7).hiddenIndex = 277;
				opponentBattleArmy.roster.get(7).instructions.get(0).condition = Condition.ALWAYS;
				opponentBattleArmy.roster.get(7).instructions.get(0).target = Target.ENEMY_NEAREST;
				opponentBattleArmy.roster.get(7).instructions.get(0).order = Order.CHARGE;
				break;
			}
		}	
	}


	public static DeploymentStrategy decideGlobalDeployStrategy(Army opponentBattleArmy) {
		
		switch(opponentBattleArmy.battleStrategy) {
		
		case AGGRESSIVE: return DeploymentStrategy.Solid_centre_charge;
		case CAUTIOUS: Random random = new Random();
		int roll = random.nextInt(2);
		if(roll == 0) { return DeploymentStrategy.Alternate_archer_defender; }
		else { return DeploymentStrategy.Tight_archer_centre; }
		
		}
		return null;
	}	
	
}
