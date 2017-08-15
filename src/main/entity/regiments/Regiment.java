package main.entity.regiments;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import main.components.IndexedPanel;
import main.entity.captains.Captain;
import main.entity.tactics.ConditionChecker;
import main.entity.tactics.DistanceChecker;
import main.entity.tactics.Order;
import main.entity.tactics.Tactic;
import main.entity.tactics.TargetChecker;
import main.graphics.battleScreen.BattleScreen;
import main.graphics.battleScreen.RightAggregatePanel;
import main.utility.ImageLoader;

public abstract class Regiment {

	public Captain captain;
	public ArrayList<Tactic> instructions;

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
	public Regiment combatOpponent;

	public Regiment() {

		this.instructions = new ArrayList<Tactic>();
		inCombat = false;

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
		this.battleLife = life;

	}

	public void haveTurn() {
		
		if (inCombat) {
			combat(combatOpponent, 0);
		} else {
			Tactic tactic = ConditionChecker.checkConditions(this);
			Regiment target = TargetChecker.checkTarget(this, tactic.target);
			executeOrder(tactic.order, target);
	
			writeText(tactic, target);
			
			BattleScreen.battleScene.refreshMap();
			for (IndexedPanel indexedPanel: BattleScreen.battleScene.indexedPanels) {
			indexedPanel.setBorder(null);
			indexedPanel.button.setBorder(null);
			}
		}
	}


	private void executeOrder(Order order, Regiment target) {
		switch (order) {

		case CHARGE:
			chargeTarget(target);
			break;
		case RECOVER:
			recover();
			break;
		case FIRE:
			fire(target);
			break;
		}
	}

	private void chargeTarget(Regiment target) {
		
		battleDefence -= 5;

		move(battleMove + run, target);

	}
	
	private void move(int movement, Regiment target) {
		
		
		Random random = new Random();
		int roll;
		int roll2;
		for (int i = 0; i < movement; i++) {
			roll = random.nextInt(10);
			roll2 = random.nextInt(10);
			int verticalDistance = DistanceChecker.checkVerticalDistance(this, target);
			int horizontalDistance = DistanceChecker.checkHorizontalDistance(this, target);
			
			if (verticalDistance == 0 && horizontalDistance == 0) { 
				i = movement;
				inCombat = true;
				combatOpponent = target;
				target.inCombat = true;
				target.combatOpponent = this;
				combat(target, battleCharge);
			} else {			
				if (Math.abs(verticalDistance) > Math.abs(horizontalDistance)) {
					if (verticalDistance < 0) { if (roll < 7) setIndices(panels[0] - 48); }
					if (verticalDistance > 0) { if (roll < 7) setIndices(panels[0] + 48); }
					if (horizontalDistance < 0) { if (roll2 < 4) setIndices(panels[0] - 1); }
					if (horizontalDistance > 0) { if (roll2 < 4) setIndices(panels[0] + 1); }
				} else {
					if (verticalDistance < 0) { if (roll < 4) setIndices(panels[0] - 48); }
					if (verticalDistance > 0) { if (roll < 4) setIndices(panels[0] + 48); }
					if (horizontalDistance < 0) { if (roll2 < 7) setIndices(panels[0] - 1); }
					if (horizontalDistance > 0) { if (roll2 < 7) setIndices(panels[0] + 1); }				
				}
			}		
		}
		
	}



	private void recover() {
		
		Random random = new Random();
		int lostLife = life - battleLife;
		for (int i = 0; i < lostLife; i++) {
			if (random.nextInt(100) < 10) battleLife++;
		}

	}
	
	private void fire(Regiment target) {
		Random random = new Random();
		int hits = 0;
		for (int i = 0; i < battleLife; i++) {
			if (random.nextInt(100) < missile) hits++;
		}
		for (int ii = 0; ii < hits; ii++) {
			if (random.nextInt(100) < target.defence) target.battleLife--;
		}
	}
	
	private void combat(Regiment target, int chargeBonus) {
		System.out.println(name + " currently has " + battleLife + " battleLife");
		Random random = new Random();
		int hits = 0;
		for (int i = 0; i < battleLife; i ++) {
			if (random.nextInt(100) < attack + chargeBonus) hits++;
		}
		for (int ii = 0; ii < hits; ii++) {
			if (random.nextInt(100) < target.defence) target.battleLife--;
		}
		System.out.println(name + " is in combat with " + target.name + " with chargebonus: " + chargeBonus);
	}
	
	
	
	private void writeText(Tactic tactic, Regiment target) {
		
		RightAggregatePanel.infoTextPanel.textArea.setText("<font color = 'rgb(220, 220, 220)'>" + name
				+ " is having their turn and chooses to " + tactic.order.toString() + " " + target.name);
		
		
	}

}
