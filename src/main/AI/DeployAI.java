package main.AI;

import main.entity.armies.Army;
import main.entity.regiments.Regiment;
import main.entity.regiments.RegimentType;

public abstract class DeployAI {

	public static void orderOpponentArmy(Army opponentBattleArmy) {
		
		Army tempArmy = new Army();
		
		for (Regiment regiment: opponentBattleArmy.roster) {
			if(regiment.type == RegimentType.LIGHT_INFANTRY) tempArmy.roster.add(regiment);
		}		
		for (Regiment regiment: opponentBattleArmy.roster) {
			if(regiment.type == RegimentType.LIGHT_CAVALRY) tempArmy.roster.add(regiment);
		}		
		for (Regiment regiment: opponentBattleArmy.roster) {
			if(regiment.type == RegimentType.ARCHERS) tempArmy.roster.add(regiment);
		}		
		for (Regiment regiment: opponentBattleArmy.roster) {
			if(regiment.type == RegimentType.ARTILLERY) tempArmy.roster.add(regiment);
		}		
		for (Regiment regiment: opponentBattleArmy.roster) {
			if(regiment.type == RegimentType.HEAVY_INFANTRY) tempArmy.roster.add(regiment);
		}		
		for (Regiment regiment: opponentBattleArmy.roster) {
			if(regiment.type == RegimentType.HEAVY_CAVALRY) tempArmy.roster.add(regiment);
		}		
		for (Regiment regiment: opponentBattleArmy.roster) {
			if(regiment.type == RegimentType.MONSTER) tempArmy.roster.add(regiment);
		}		
		for (Regiment regiment: opponentBattleArmy.roster) {
			if(regiment.type == RegimentType.COMBINED_ARMS) tempArmy.roster.add(regiment);
		}		
		for (Regiment regiment: opponentBattleArmy.roster) {
			if(regiment.type == RegimentType.FLYING) tempArmy.roster.add(regiment);
		}
		
		opponentBattleArmy.roster.clear();
		
		for(Regiment regiment: tempArmy.roster) {
			opponentBattleArmy.roster.add(regiment);
		}
		
	}
	
}
