package main.AI.deployments;

import java.util.Collections;
import java.util.Comparator;

import main.AI.orders.DefensiveArcher;
import main.AI.orders.DefensiveFighter;
import main.battle.tactics.Condition;
import main.battle.tactics.Order;
import main.battle.tactics.Target;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class AlternateArcherDefender {
	

	public static void deploy(Army opponentBattleArmy) {
		
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
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(0));
				break;
			case 1: 
				opponentBattleArmy.roster.get(1).hiddenIndex = 26;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(1));
				break;
			case 2: 
				opponentBattleArmy.roster.get(2).hiddenIndex = 16;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(2));
				break;
			case 3: 
				opponentBattleArmy.roster.get(3).hiddenIndex = 11;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(3));
				break;
			case 4: 
				opponentBattleArmy.roster.get(4).hiddenIndex = 21;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(4));
				break;
			case 5: 
				opponentBattleArmy.roster.get(5).hiddenIndex = 31;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(5));
				break;
			case 6: 
				opponentBattleArmy.roster.get(6).hiddenIndex = 248;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(6));
				break;
			case 7: 
				opponentBattleArmy.roster.get(7).hiddenIndex = 277;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(7));
				break;
			}
		}
		
		for (int i = 0 + archers; i < defenders + archers; i++) {
			switch(i) {
			case 0: 
				opponentBattleArmy.roster.get(0).hiddenIndex = 36;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(0));
				break;
			case 1: 
				opponentBattleArmy.roster.get(1).hiddenIndex = 26;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(1));
				break;
			case 2: 
				opponentBattleArmy.roster.get(2).hiddenIndex = 16;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(2));
				break;
			case 3: 
				opponentBattleArmy.roster.get(3).hiddenIndex = 11;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(3));
				break;
			case 4: 
				opponentBattleArmy.roster.get(4).hiddenIndex = 21;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(4));
				break;
			case 5: 
				opponentBattleArmy.roster.get(5).hiddenIndex = 31;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(5));
				break;
			case 6: 
				opponentBattleArmy.roster.get(6).hiddenIndex = 248;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(6));
				break;
			case 7: 
				opponentBattleArmy.roster.get(7).hiddenIndex = 277;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(7));
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
	
	

}
