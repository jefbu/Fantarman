package main.AI;

import java.util.Random;

import main.AI.deployments.AlternateArcherDefender;
import main.AI.deployments.SolidCentreCharger;
import main.AI.deployments.TightArcherCentre;
import main.entity.armies.Army;

public abstract class DeployAI {

	
	public static void setOpponentDeploymentIndices(Army opponentBattleArmy) {

		switch(opponentBattleArmy.deploymentStrategy) {
		case Alternate_archer_defender: AlternateArcherDefender.deploy(opponentBattleArmy);break;
		case Solid_centre_charge: SolidCentreCharger.deploy(opponentBattleArmy); break;
		case Tight_archer_centre: TightArcherCentre.deploy(opponentBattleArmy); break;
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
