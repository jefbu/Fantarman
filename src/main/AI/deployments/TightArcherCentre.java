package main.AI.deployments;

import main.entity.armies.Army;

public abstract class TightArcherCentre {
	
	
	public static void deploy(Army opponentBattleArmy) {
		AlternateArcherDefender.deploy(opponentBattleArmy);
	}

}
