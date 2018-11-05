package main.battle.tactics;

import java.util.Random;

import main.entity.regiments.Regiment;
import main.graphics.battleScreen.RightAggregatePanel;

public abstract class MoraleChecker {
	
	public static boolean breaks(Regiment regiment) {
		
		Random random = new Random();
		int roll = random.nextInt(100) + 1;
		
		if (roll < 50 + regiment.battleMorale) {
			return false;
		} else {
			RightAggregatePanel.infoTextPanel.textArea.setText("<font color = 'rgb(220, 220, 220)'>" 
				+ regiment.captain.name + "'s " + regiment.regiment
				+ " has decided that discretion is the better part of valour. In other words, "
				+ "they have run away and left the battlefield!");
			return true;
		}
		
		
	}

}
