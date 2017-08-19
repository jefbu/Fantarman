package main.battle.tactics;

import java.util.Random;

import main.Main;
import main.entity.regiments.Regiment;

public abstract class OrderMethods {
	

	public static void chargeTarget(Regiment regiment, Regiment target) {		
		regiment.battleDefence -= 5;
		MoveMethod.move(regiment, regiment.battleMove + regiment.run, target);
	}
	
	public static void combat(Regiment regiment, Regiment target, int chargeBonus) {
		System.out.println(regiment.name + " currently has " + regiment.battleLife + " battleLife");
		Random random = new Random();
		int hits = 0;
		for (int i = 0; i < regiment.battleLife; i ++) {
			if (random.nextInt(100) < regiment.attack + chargeBonus) hits++;
		}
		for (int ii = 0; ii < hits; ii++) {
			if (random.nextInt(100) < target.defence) target.battleLife--;
		}
		if (regiment.battleLife <= 0) { 
			regiment.defeated = true;
			target.inCombat = false;
			Main.yourArmy.roster.remove(regiment);
		}
		if (target.battleLife <= 0) {
			target.defeated = true;
			regiment.inCombat = false;
			Main.opponentArmy.roster.remove(target);
			
		}
		System.out.println(regiment.name + " is in combat with " + target.name + " with chargebonus: " + chargeBonus);
		if (regiment.defeated || target.defeated) {
			System.out.println("combat is over");
		}
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
