package main.AI.deployments;

import java.util.Collections;
import java.util.Comparator;

import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class SolidCentreCharger {


	public static void deploy(Army opponentBattleArmy) {
		
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
	
	
}



