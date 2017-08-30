package main.battle.tactics;

import java.util.Random;

import main.Main;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.RightAggregatePanel;

public abstract class OrderMethods {

	public static void chargeTarget(Regiment regiment, Regiment target, Army activeArmy, int activeRegimentIndex) {
		regiment.battleDefence -= 5;
		MoveMethod.move(regiment, regiment.battleMove + regiment.run, target, activeArmy, activeRegimentIndex);
	}

	public static void combat(Regiment regiment, Regiment target, int chargeBonus, Army activeArmy) {

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
			if (activeArmy == Main.yourArmy) {
				Main.opponentArmy.roster.remove(target);
			} else {
				Main.yourArmy.roster.remove(target);
			}
		}

		if (regiment.defeated || target.defeated) {
		}

		writeCombatText(regiment, target, casualties);
	}

	public static void recover(Regiment regiment) {

		Random random = new Random();
		int lostLife = regiment.life - regiment.battleLife;
		for (int i = 0; i < lostLife; i++) {
			if (random.nextInt(100) < 10)
				regiment.battleLife++;
		}

	}

	public static void fire(Regiment regiment, Regiment target) {
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
		writeText(Order.FIRE, regiment, target, casualties);
	}

	private static void writeCombatText(Regiment regiment, Regiment target, int casualties) {

		RightAggregatePanel.infoTextPanel.textArea.setText(
				"<font color = 'rgb(220, 220, 220)'>" + regiment.name + " is having their turn and is in combat with "
						+ target.name + "<br>" + "They manage to inflict " + casualties + " casualties");

	}

	private static void writeText(Order order, Regiment regiment, Regiment target, int casualties) {

		RightAggregatePanel.infoTextPanel.textArea.setText("<font color = 'rgb(220, 220, 220)'>" + regiment.name
				+ " is having their turn and chooses to " + order.toString() + " " + target.name + ".<br>" + ""
						+ "They manage to inflict " + casualties + " casualties");

	}

}
