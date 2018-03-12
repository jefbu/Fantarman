package main.AI;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

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
		 setIndicesAlternateArcherDefender(opponentBattleArmy);	
	}


	private static void setIndicesAlternateArcherDefender(Army opponentBattleArmy) {
		
		Collections.sort(opponentBattleArmy.roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment p1, Regiment p2) {
				return p2.totalMissile - p1.totalMissile;
			}
		});
		
		int archers = 0;
		int defenders = 0;
		int others = 0;
		
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
			case MONSTER: defenders++; break;			
			}
		}
		
		for (int i = 0; i < archers; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 36;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 26;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 16;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 11;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 21;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 31;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 248;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 277;
			}
		}
		
		for (int i = 0 + archers; i < defenders + archers; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 36;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 26;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 16;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 11;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 21;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 31;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 248;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 277;
			}
		}
		
		for (int i = 0 + archers + defenders; i < others + archers + defenders; i++) {
			switch(i) {
			case 0: opponentBattleArmy.roster.get(0).hiddenIndex = 36;
			case 1: opponentBattleArmy.roster.get(1).hiddenIndex = 26;
			case 2: opponentBattleArmy.roster.get(2).hiddenIndex = 16;
			case 3: opponentBattleArmy.roster.get(3).hiddenIndex = 11;
			case 4: opponentBattleArmy.roster.get(4).hiddenIndex = 21;
			case 5: opponentBattleArmy.roster.get(5).hiddenIndex = 31;
			case 6: opponentBattleArmy.roster.get(6).hiddenIndex = 248;
			case 7: opponentBattleArmy.roster.get(7).hiddenIndex = 277;
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
