package main.battle.tactics;

import java.util.Random;

import main.Main;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public abstract class OrderMethods {
	

	public static void chargeTarget(Regiment regiment, Regiment target, Army activeArmy) {		
		regiment.battleDefence -= 5;
		MoveMethod.move(regiment, regiment.battleMove + regiment.run, target, activeArmy);
	}
	
	public static int combat(Regiment regiment, Regiment target, int chargeBonus, Army activeArmy) {
		
		Random random = new Random();
		int casualties = 0;
		int hits = 0;
		for (int i = 0; i < regiment.battleLife; i ++) {
			if (random.nextInt(100) < regiment.battleAttack + chargeBonus) hits++;
		}
		for (int ii = 0; ii < hits; ii++) {
			if (random.nextInt(100) + 1 > target.battleDefence) {
				target.battleLife--;
				casualties++;
			}
		}

		if (target.battleLife <= 0) {
			target.defeated = true;
			regiment.inCombat = false;
			if (activeArmy == Main.yourArmy) {
			Main.opponentArmy.roster.remove(target);
			} else {
			Main.yourArmy.roster.remove(target);
			}
		}

		if (regiment.defeated || target.defeated) {
		}
		
		return casualties;
	}
	
	
	
	public static void recover(Regiment regiment) {
		
		Random random = new Random();
		int lostLife = regiment.life - regiment.battleLife;
		for (int i = 0; i < lostLife; i++) {
			if (random.nextInt(100) < 10) regiment.battleLife++;
		}

	}
	
		
	public static void fire(Regiment regiment, Regiment target) {
		Random random = new Random();
		int hits = 0;
		for (int i = 0; i < regiment.battleLife; i++) {
			if (random.nextInt(100) < regiment.missile) hits++;
		}
		for (int ii = 0; ii < hits; ii++) {
			if (random.nextInt(100) < target.defence) target.battleLife--;
		}
	}
	
	
	

}
