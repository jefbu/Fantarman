package main.battle;

import java.util.Random;

import main.Main;
import main.entity.captains.PissedOffReason;
import main.entity.regiments.Regiment;
import main.entity.regiments.Role;

public abstract class PissedOffChecker {

	public static void checkPissedOffedCaptains() {
		
		Random random = new Random();
		
		for (Regiment regiment: Main.yourArmy.roster) {
			
			if (regiment.captain.pissedOffReason != PissedOffReason.notPissedOff) {
				int roll = random.nextInt(100) + 1;
				if (roll > 66) { 
					regiment.captain.pissedOffReason = PissedOffReason.notPissedOff;
					regiment.captain.reallyPissedOff = false;
					}
			}
			else {
				if (regiment.role == Role.TRAINING) {
					int roll = random.nextInt(100) + 1;
					if (roll < regiment.captain.prestige) {
						regiment.captain.pissedOffReason = PissedOffReason.unselected;
					}
				}
				else if (regiment.totalLife < regiment.totalMaxLife) {
					int roll = random.nextInt(100) + 1;
					if (roll < ((regiment.totalMaxLife - regiment.totalLife) * 5)) {
						regiment.captain.pissedOffReason = PissedOffReason.badOrders;
					}
				}
				else {
					int roll = random.nextInt(100) + 1;
					if (roll > 90) {
						regiment.captain.pissedOffReason = PissedOffReason.noReason;
					}
				}
			}
			
		}
		
	}
	
	
}
