package main.entity.regiments;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

import main.battle.tactics.ConditionChecker;
import main.battle.tactics.MoraleChecker;
import main.battle.tactics.Order;
import main.battle.tactics.OrderMethods;
import main.battle.tactics.Tactic;
import main.battle.tactics.TargetChecker;
import main.entity.armies.Army;
import main.entity.captains.Captain;
import main.entity.equipment.Armour;
import main.entity.equipment.Weapons;
import main.entity.lieutenants.Lieutenant;
import main.entity.races.Race;
import main.graphics.battleScreen.BattleScreen;
import main.utility.ImageLoader;
import main.utility.Trophies;

public abstract class Regiment implements Serializable {

	private static final long serialVersionUID = 1L;

	public Captain captain;
	public ArrayList<Tactic> instructions;
	public ArrayList<Lieutenant> lieutenants;
	public ArrayList<Weapons> weapons;
	public ArrayList<Armour> armours;
	public Weapons weapon;
	public Armour armour;
	public int lieutenantsSize;

	public int value;
	public int upkeep;
	public int level;

	public Role role;
	public Race race;

	public int baseAttack;
	public int baseDefence;
	public int baseMove;
	public int baseCharge;
	public int baseRun;
	public int baseRange;
	public int baseMissile;
	public int baseMorale;
	public int baseSpeed;
	public int baseSpeedVariation;
	public int baseLife;

	public int totalAttack;
	public int totalDefence;
	public int totalMove;
	public int totalCharge;
	public int totalRun;
	public int totalRange;
	public int totalMissile;
	public int totalMorale;
	public int totalSpeed;
	public int totalSpeedVariation;
	public int totalLife;
	
	public int totalMaxLife;
	public int injuries;

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
	public String regiment;
	public RegimentType type;

	public int rows;
	public int columns;

	public int x;
	public int y;

	public int[] panels;

	protected ImageLoader imageLoader = new ImageLoader();
	public ImageIcon icon;
	public ImageIcon largeIcon;

	protected int width = BattleScreen.battleScene.roundedWidth / 48 - 8;
	protected int height = BattleScreen.battleScene.roundedHeight / 32 - 8;

	public boolean inCombat;
	public boolean defeated;
	public Regiment combatOpponent;

	public int hiddenIndex;
	public int randomNumber;
	
	public int battlesFought;
	public int enemiesDefeated;
	public int timesDefeated;
	public int timesMVP;

	public Regiment() {

		this.instructions = new ArrayList<Tactic>();
		this.lieutenants = new ArrayList<Lieutenant>();
		this.weapons = new ArrayList<Weapons>();
		this.armours = new ArrayList<Armour>();
		level = 1;
		inCombat = false;
		defeated = false;
		role = Role.TRAINING;
		
		battlesFought = 0;
		enemiesDefeated = 0;
		timesDefeated = 0;
		timesMVP = 0;
		injuries = 0;

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
		return random.nextInt(totalSpeedVariation);

	}

	public void attributeBattleSpeed() {
		battleSpeed = totalSpeed + rollSpeedVariation();
	}

	public void attributeBattleLife() {
		this.battleLife = totalLife;
	}

	public void attributeBattleStats() {

		this.battleAttack = totalAttack;
		this.battleCharge = totalCharge;
		this.battleDefence = totalDefence;
		this.battleMissile = totalMissile;
		this.battleMorale = totalMorale;
		this.battleSpeed = totalSpeed;
		this.battleSpeedVariation = totalSpeedVariation;
		this.battleMove = totalMove;
		this.battleRange = totalRange;
		this.battleRun = totalRun;
		this.defeated = false;
		
	}

	public void calculateValue() {
		this.value = totalAttack + totalDefence + totalMissile + totalMorale + totalCharge / 2 + totalLife * 3
				+ totalSpeed * 10 + totalSpeedVariation * 5 + totalRun * 20 + totalMove * 30 + totalRange * 30
				+ lieutenantsSize * 40;
		this.upkeep = value / 10 + weapon.upkeep + armour.upkeep;
	}

	public void calculateTotalStats() {

		totalAttack = baseAttack + captain.attackBonus + weapon.attackBonus;
		totalDefence = baseDefence + captain.defenceBonus + armour.defenceBonus;
		if (Trophies.calcium) { totalDefence++; }
		totalMove = baseMove - armour.movPenalty;
		totalCharge = baseCharge + captain.chargeBonus + weapon.chargeBonus;
		if (Trophies.stag) { totalCharge++; }
		totalRun = baseRun;
		totalRange = baseRange + weapon.rangeBonus;
		totalMissile = baseMissile + captain.missileBonus + weapon.missileBonus;
		totalMorale = baseMorale + captain.moraleBonus + armour.moraleBonus;
		if (Trophies.wonLeague) { totalMorale++; }
		totalSpeed = baseSpeed + captain.speedBonus - weapon.spdPenalty - armour.spdPenalty;
		totalSpeedVariation = baseSpeedVariation;
		totalMaxLife = baseLife;
		totalLife = totalMaxLife - injuries;
		

	}

	public void haveTurn(Army activeArmy, int activeRegimentIndex, Army yourBattleArmy, Army opponentBattleArmy,
			int turn) {
		
		if(MoraleChecker.breaks(this)) {
			
			this.defeated = true;
			this.timesDefeated++;
			this.injuries = this.battleLife;
			
			if(this.inCombat) {
				combatOpponent.inCombat = false;
				this.inCombat = false;
			}
			
			if (activeArmy == yourBattleArmy) {
				yourBattleArmy.roster.remove(this);
			} else {
				opponentBattleArmy.roster.remove(this);
			}
			
		} else if (inCombat) {

			OrderMethods.combat(this, combatOpponent, 0, activeArmy, yourBattleArmy, opponentBattleArmy);

		} else {

			Tactic tactic = ConditionChecker.checkConditions(this, turn, activeArmy, opponentBattleArmy, yourBattleArmy);
			Regiment target = TargetChecker.checkTarget(this, tactic.target, activeArmy, yourBattleArmy,
					opponentBattleArmy);
			executeOrder(tactic.order, target, activeArmy, activeRegimentIndex, yourBattleArmy, opponentBattleArmy);

		}

	}

	private void executeOrder(Order order, Regiment target, Army activeArmy, int activeRegimentIndex,
			Army yourBattleArmy, Army opponentBattleArmy) {
		switch (order) {

		case CHARGE:
			OrderMethods.chargeTarget(this, target, activeArmy, activeRegimentIndex, yourBattleArmy,
					opponentBattleArmy);
			break;
		case Move_to:
			OrderMethods.moveTo(this, target, activeArmy, activeRegimentIndex, yourBattleArmy, opponentBattleArmy);
			break;
		case RECOVER:
			OrderMethods.recover(this);
			break;
		case FIRE:
			OrderMethods.fire(this, target, activeArmy, yourBattleArmy, opponentBattleArmy);
			break;
		case Move_Forward:
			OrderMethods.moveForward(this, activeArmy, activeRegimentIndex, yourBattleArmy, opponentBattleArmy);
			break;
		default:
			System.out.println("Error at executeOrder method in regiment.haveturn");
			break;
		}
	}

}
