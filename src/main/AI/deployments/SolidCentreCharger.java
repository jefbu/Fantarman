package main.AI.deployments;

import java.util.Collections;
import java.util.Comparator;

import main.AI.orders.OffensiveArcher;
import main.AI.orders.OffensiveFighter;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class SolidCentreCharger {


	public static void deploy(Army opponentBattleArmy) {
		
		int archers = 0;
		int attackers = 0;
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
			case HEAVY_CAVALRY: attackers++; break;
			case HEAVY_INFANTRY: attackers++; break;
			case LIGHT_CAVALRY: others++; break;
			case LIGHT_INFANTRY: attackers++; break;
			case HERO: attackers++; break;			
			}
		}
		
		for (int i = 0; i < attackers; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 206; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(0));
				break;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 211;
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(1));
				break;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 216; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(2));
				break;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 221; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(3));
				break;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 275; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(4));
				break;
 			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 249; 
 				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(5));
 				break;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 8; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(6));	
				break;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 36; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(7));
				break;
			}
		}
		
		for (int i = 0 + attackers; i < others + attackers; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 206; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(0));
				break;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 211;
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(1));
				break;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 216; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(2));
				break;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 221; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(3));
				break;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 275; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(4));
				break;
				case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 249; 
					OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(5));
					break;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 8; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(6));	
				break;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 36; 
				OffensiveFighter.giveOrders(opponentBattleArmy.roster.get(7));
				break;
			}
		}
		
		for (int i = 0 + others + attackers; i < others + archers + attackers; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 206; 
				OffensiveArcher.giveOrders(opponentBattleArmy.roster.get(0));
				break;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 211;
				OffensiveArcher.giveOrders(opponentBattleArmy.roster.get(1));
				break;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 216; 
				OffensiveArcher.giveOrders(opponentBattleArmy.roster.get(2));
				break;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 221; 
				OffensiveArcher.giveOrders(opponentBattleArmy.roster.get(3));
				break;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 275; 
				OffensiveArcher.giveOrders(opponentBattleArmy.roster.get(4));
				break;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 249; 
				OffensiveArcher.giveOrders(opponentBattleArmy.roster.get(5));
				break;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 8; 
				OffensiveArcher.giveOrders(opponentBattleArmy.roster.get(6));	
				break;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 36; 
				OffensiveArcher.giveOrders(opponentBattleArmy.roster.get(7));
				break;
			}
		}
	}
	
	
}



