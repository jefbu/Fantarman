package main.entity.regiments;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import main.Main;
import main.battle.tactics.ConditionChecker;
import main.battle.tactics.Order;
import main.battle.tactics.OrderMethods;
import main.battle.tactics.Tactic;
import main.battle.tactics.TargetChecker;
import main.components.IndexedPanel;
import main.entity.armies.Army;
import main.entity.captains.Captain;
import main.graphics.battleScreen.BattleScreen;
import main.graphics.battleScreen.RightAggregatePanel;
import main.utility.ImageLoader;

public abstract class Regiment {

	public Captain captain;
	public ArrayList<Tactic> instructions;

	public int value;

	public int attack;
	public int defence;
	public int move;
	public int charge;
	public int run;
	public int range;
	public int missile;
	public int morale;
	public int speed;
	public int speedVariation;
	public int life;

	public int battleAttack;
	public int battleDefence;
	public int battleMove;
	public int battleCharge;
	public int battleRun;
	public int battleRange;
	public int battleMissile;
	public int battleMorale;
	public int battleSpeed;
	public int battleSpeedVariation;
	public int battleLife;

	public String name;
	public RegimentType type;

	public int rows;
	public int columns;

	public int x;
	public int y;

	public int[] panels;

	protected ImageLoader imageLoader = new ImageLoader();
	public ImageIcon icon;

	protected int width = BattleScreen.battleScene.roundedWidth / 48 - 8;
	protected int height = BattleScreen.battleScene.roundedHeight / 32 - 8;

	public boolean inCombat;
	public boolean defeated;
	public Regiment combatOpponent;

	public Regiment() {

		this.instructions = new ArrayList<Tactic>();
		inCombat = false;
		defeated = false;

	}

	public void setIndices(int upperLeftIndex) {

		for (int yCoordinate = 0; yCoordinate < rows; yCoordinate++) {

			for (int xCoordinate = 0; xCoordinate < columns; xCoordinate++) {

				panels[xCoordinate + yCoordinate * columns] = upperLeftIndex + xCoordinate + yCoordinate * 48;
			}
		}
	}

	public int rollSpeedVariation() {

		Random random = new Random();
		return random.nextInt(speedVariation);

	}

	public void attributeBattleSpeed() {
		battleSpeed = speed + rollSpeedVariation();
	}

	public void attributeBattleLife() {
		this.battleLife = life;
	}

	public void attributeBattleStats() {

		this.battleAttack = attack;
		this.battleCharge = charge;
		this.battleDefence = defence;
		this.battleMissile = missile;
		this.battleMorale = morale;
		this.battleSpeed = speed;
		this.battleSpeedVariation = speedVariation;
		this.battleMove = move;
		this.battleRange = range;
		this.battleRun = run;
		this.defeated = false;

	}

	public void haveTurn(Army army) {

		if (inCombat) {

			int casualties = OrderMethods.combat(this, combatOpponent, 0);
			BattleScreen.battleScene.refreshMap();
			BattleScreen.battleScene.refreshRegimentColours();
			BattleScreen.informationPanel.yourPanel.update(Main.yourArmy);
			BattleScreen.informationPanel.enemyPanel.update(Main.opponentArmy);
			writeText(combatOpponent, casualties);

		} else {

			Tactic tactic = ConditionChecker.checkConditions(this);
			Regiment target = TargetChecker.checkTarget(this, tactic.target, army);
			executeOrder(tactic.order, target);

			writeText(tactic, target);

			BattleScreen.battleScene.refreshMap();
			BattleScreen.informationPanel.yourPanel.update(Main.yourArmy);
			BattleScreen.informationPanel.enemyPanel.update(Main.opponentArmy);
			for (IndexedPanel indexedPanel : BattleScreen.battleScene.indexedPanels) {
				indexedPanel.setBorder(null);
				indexedPanel.button.setBorder(null);
			}
		}
	}

	private void executeOrder(Order order, Regiment target) {
		switch (order) {

		case CHARGE:
			OrderMethods.chargeTarget(this, target);
			break;
		case RECOVER:
			OrderMethods.recover(this);
			break;
		case FIRE:
			OrderMethods.fire(this, target);
			break;
		}
	}

	private void writeText(Regiment target, int casualties) {

		RightAggregatePanel.infoTextPanel.textArea
				.setText("<font color = 'rgb(220, 220, 220)'>" + name + " is having their turn and is in combat with "
						+ target.name + "<br>" + "They manage to inflict " + casualties + " casualties");

	}

	private void writeText(Tactic tactic, Regiment target) {

		RightAggregatePanel.infoTextPanel.textArea.setText("<font color = 'rgb(220, 220, 220)'>" + name
				+ " is having their turn and chooses to " + tactic.order.toString() + " " + target.name);

	}

}
