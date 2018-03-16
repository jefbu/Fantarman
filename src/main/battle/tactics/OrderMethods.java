package main.battle.tactics;

import java.util.Random;

import main.entity.armies.Army;
import main.entity.lieutenants.Lieutenant;
import main.entity.regiments.Regiment;
import main.entity.skills.Skills;
import main.graphics.battleScreen.RightAggregatePanel;

public abstract class OrderMethods {

	public static void chargeTarget(Regiment regiment, Regiment target, Army activeArmy, int activeRegimentIndex,
			Army yourBattleArmy, Army opponentBattleArmy) {
		regiment.battleDefence -= 5;
		MoveMethod.move(regiment, regiment.battleMove + regiment.battleRun, target, activeArmy, activeRegimentIndex,
				yourBattleArmy, opponentBattleArmy);
		writeBasicOrderText(Order.CHARGE, regiment, target);
	}

	public static void moveTo(Regiment regiment, Regiment target, Army activeArmy, int activeRegimentIndex,
			Army yourBattleArmy, Army opponentBattleArmy) {
		MoveMethod.move(regiment, regiment.battleMove, target, activeArmy, activeRegimentIndex, yourBattleArmy,
				opponentBattleArmy);
		writeBasicOrderText(Order.Move_to, regiment, target);
	}

	public static void combat(Regiment regiment, Regiment target, int chargeBonus, Army activeArmy, Army yourBattleArmy,
			Army opponentBattleArmy) {

		Random random = new Random();
		int casualties = 0;
		int hits = 0;
		for (int i = 0; i < regiment.battleLife; i++) {
			if (random.nextInt(100) < regiment.battleAttack + chargeBonus)
				hits++;
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
			if (activeArmy == yourBattleArmy) {
				opponentBattleArmy.roster.remove(target);
			} else {
				yourBattleArmy.roster.remove(target);
			}
		}

		if (regiment.defeated || target.defeated) {
		}

		writeCombatText(regiment, target, casualties);
	}

	public static void recover(Regiment regiment) {
		
		int healers = countSkill(regiment, "Healer");

		Random random = new Random();
		int recoveries = 0;
		int lostLife = regiment.totalLife - regiment.battleLife;
		for (int i = 0; i < lostLife; i++) {
			if (random.nextInt(100) < (10 + healers * 10)) {
				regiment.battleLife++;
				recoveries++;
			}
		}
		writeHealText(Order.RECOVER, regiment, recoveries);
	}

	public static void fire(Regiment regiment, Regiment target, Army activeArmy, Army yourBattleArmy,
			Army opponentBattleArmy) {
		
		Random random = new Random();
		int hits = 0;
		int casualties = 0;
		int roll;
		int roll2;
		for (int i = 0; i < regiment.battleLife; i++) {
			roll = random.nextInt(100);
			if (roll < regiment.battleMissile)
				hits++;
		}
		for (int ii = 0; ii < hits; ii++) {
			roll2 = random.nextInt(100);
			if (roll2 < target.battleDefence) {
				target.battleLife--;
				casualties++;
			}
		}

		if (target.battleLife <= 0) {
			target.defeated = true;
			regiment.inCombat = false;
			if (activeArmy == yourBattleArmy) {
				opponentBattleArmy.roster.remove(target);
			} else {
				yourBattleArmy.roster.remove(target);
			}
		}

		writeMissileText(Order.FIRE, regiment, target, casualties);

	}

	private static void writeCombatText(Regiment regiment, Regiment target, int casualties) {

		RightAggregatePanel.infoTextPanel.textArea.setText("<font color = 'rgb(220, 220, 220)'>" + regiment.name
				+ " is having their turn and is in combat with " + target.name + "<br>" + "They manage to inflict "
				+ decideColour(casualties, true) + casualties + "<font color = 'rgb(220, 220, 220)'>" + " casualties.");

	}

	private static void writeMissileText(Order order, Regiment regiment, Regiment target, int casualties) {

		RightAggregatePanel.infoTextPanel.textArea.setText("<font color = 'rgb(220, 220, 220)'>" + regiment.name
				+ " is having their turn and chooses to " + order.toString() + " " + target.name + ".<br>" + ""
				+ "They manage to inflict " + decideColour(casualties, true) + casualties
				+ "<font color = 'rgb(220, 220, 220)'>" + " casualties.");

	}

	private static void writeBasicOrderText(Order order, Regiment regiment, Regiment target) {

		RightAggregatePanel.infoTextPanel.textArea.setText("<font color = 'rgb(220, 220, 220)'>" + regiment.name
				+ " is having their turn and chooses to " + order.toString() + " " + target.name + ".");
	}

	private static void writeHealText(Order order, Regiment regiment, int recoveries) {

		RightAggregatePanel.infoTextPanel.textArea
				.setText("<font color = 'rgb(220, 220, 220)'>" + regiment.name + " is having their turn and chooses to "
						+ order.toString() + "." + "They manage to recover " + decideColour(recoveries, false)
						+ recoveries + "<font color = 'rgb(220, 220, 220)'>" + " casualties.");
		;
	}

	private static String decideColour(int casualties, boolean red) {
		int colour = 150 + 15 * casualties;
		if (colour > 255) {
			colour = 255;
		}
		if (red) {
			return "<font color = 'rgb(" + colour + ", 120, 80)'>";
		} else {
			return "<font color = 'rgb(60, " + colour + ", 80)'>";
		}
	}
	
	private static int countSkill(Regiment regiment, String skill) {
		
		int skillAmount = 0;
		switch(skill) {
		case "Healer": for (Lieutenant lieutenant: regiment.lieutenants) {
			if (lieutenant.bonusSkill == Skills.Healer1) { skillAmount++;}
			else if (lieutenant.bonusSkill == Skills.Healer2) { skillAmount = skillAmount + 2; }
			else if (lieutenant.bonusSkill == Skills.Healer3) { skillAmount = skillAmount + 3; }
			}
			if (regiment.captain.skill1 == Skills.Healer1) { skillAmount++; }
			else if (regiment.captain.skill1 == Skills.Healer2) { skillAmount = skillAmount + 2; }
			else if (regiment.captain.skill1 == Skills.Healer3) { skillAmount = skillAmount + 3; }
			if (regiment.captain.skill2 == Skills.Healer1) { skillAmount++; }
			else if (regiment.captain.skill2 == Skills.Healer2) { skillAmount = skillAmount + 2; }
			else if (regiment.captain.skill2 == Skills.Healer3) { skillAmount = skillAmount + 3; }
			break;
		}
		return skillAmount;
		
	}

}
