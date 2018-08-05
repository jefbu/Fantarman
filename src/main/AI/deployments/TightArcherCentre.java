package main.AI.deployments;

import java.util.Collections;
import java.util.Comparator;

import main.AI.orders.DefensiveArcher;
import main.AI.orders.DefensiveFighter;
import main.AI.orders.DefensiveOther;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class TightArcherCentre {
	
	
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
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 68;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(0));
				break;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 73;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(1));
				break;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 258;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(2));
				break;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 267;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(3));
				break;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 205;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(4));
				break;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 223;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(5));
				break;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 200;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(6));
				break;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 228;
				DefensiveArcher.giveOrders(opponentBattleArmy.roster.get(7));
				break;
			}
		}
		
		for (int i = 0 + archers; i < archers + others; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 68;
				DefensiveOther.giveOrders(opponentBattleArmy.roster.get(0));
				break;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 73;
				DefensiveOther.giveOrders(opponentBattleArmy.roster.get(1));
				break;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 258;
				DefensiveOther.giveOrders(opponentBattleArmy.roster.get(2));
				break;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 267;
				DefensiveOther.giveOrders(opponentBattleArmy.roster.get(3));
				break;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 205;
				DefensiveOther.giveOrders(opponentBattleArmy.roster.get(4));
				break;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 223;
				DefensiveOther.giveOrders(opponentBattleArmy.roster.get(5));
				break;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 200;
				DefensiveOther.giveOrders(opponentBattleArmy.roster.get(6));
				break;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 228;
				DefensiveOther.giveOrders(opponentBattleArmy.roster.get(7));
				break;
			}
		}
		
		for (int i = 0 + archers + others; i < archers + others + defenders; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 68;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(0));
				break;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 73;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(1));
				break;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 258;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(2));
				break;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 267;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(3));
				break;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 205;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(4));
				break;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 223;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(5));
				break;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 200;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(6));
				break;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 228;
				DefensiveFighter.giveOrders(opponentBattleArmy.roster.get(7));
				break;
			}
		}
	}

}
