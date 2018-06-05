package main.battle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import main.AI.DeployAI;
import main.components.Colour;
import main.components.TextPopup;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;
import main.graphics.battleScreen.RightAggregatePanel;
import main.strings.BattleStartStrings;
import main.utility.Who;

public class Deployment {

	BattleOrchestrator battleOrchestrator;

	int playerCounter = 0;
	int enemyCounter = 0;
	ArrayList<Who> deployOrder;
	DeploymentZone playerDeploymentZone;
	DeploymentZone enemyDeploymentZone;

	Army yourBattleArmy;
	Army opponentBattleArmy;

	int lifeRed;
	int lifeGreen;
	int moveRed;
	int moveGreen;
	int runRed;
	int runGreen;
	int speedRed;
	int speedGreen;
	int attackGreen;
	int attackRed;
	int defenceGreen;
	int defenceRed;
	int chargeGreen;
	int chargeRed;
	int ballisticGreen;
	int ballisticRed;
	int rangeRed;
	int rangeGreen;
	int moraleGreen;
	int moraleRed;

	int errorCheck;

	public Deployment(BattleOrchestrator battleOrchestrator, Army yourBattleArmy, Army opponentBattleArmy) {

		errorCheck = 0;

		this.battleOrchestrator = battleOrchestrator;
		this.yourBattleArmy = yourBattleArmy;
		this.opponentBattleArmy = opponentBattleArmy;

		playerDeploymentZone = new DeploymentZone(24);
		enemyDeploymentZone = new DeploymentZone(0);

		DeployAI.setOpponentDeploymentIndices(opponentBattleArmy);

		for (Regiment regiment : opponentBattleArmy.roster) {
			Random random = new Random();
			regiment.randomNumber = random.nextInt(1000);
		}

		deployOrder = new ArrayList<Who>();

		decideDeploymentOrder();

		for (int i = 0; i < deployOrder.size(); i++) {
			deploy();
		}

	}

	private void deploy() {

		if (deployOrder.size() == 0) {
			playerDeploymentZone.removeDeploymentZone();
			enemyDeploymentZone.removeDeploymentZone();
			for (int i = 0; i < BattleScreen.battleScene.indexedPanels.size(); i++) {

				try {
					BattleScreen.battleScene.indexedPanels.get(i).button.removeActionListener(
							BattleScreen.battleScene.indexedPanels.get(i).button.getActionListeners()[0]);
				} catch (Exception e) {
				}

			}
			TextPopup popup = new TextPopup(BattleScreen.battleScene.roundedWidth / 3,
					BattleScreen.battleScene.roundedHeight / 4, Colour.GREEN, false);
			popup.writeText(BattleStartStrings.rollQuote());
			popup.setVisible(true);
			battleOrchestrator.orchestrateBattle();
		} else if (deployOrder.get(0) == Who.ENEMY)
			deployEnemyRegiment();
		else
			deployPlayerRegiment();

	}

	private void deployPlayerRegiment() {

		fillInfoTextPanel();

		for (int i = 0; i < BattleScreen.battleScene.indexedPanels.size(); i++) {

			int index = i;

			try {
				BattleScreen.battleScene.indexedPanels.get(i).button.removeActionListener(
						BattleScreen.battleScene.indexedPanels.get(i).button.getActionListeners()[0]);
			} catch (Exception e1) {
			}

			BattleScreen.battleScene.indexedPanels.get(i).button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (checkLegalDeployment(index, playerDeploymentZone, yourBattleArmy, playerCounter) == true) {

						errorCheck++;
						yourBattleArmy.roster.get(playerCounter).setIndices(index);
						battleOrchestrator.refreshMap();
						playerCounter++;
						BattleScreen.battleScene.indexedPanels.get(0).applyColor();
						deployOrder.remove(0);
						deploy();
					}
				}
			});
		}
	}

	private void deployEnemyRegiment() {

		opponentBattleArmy.roster.get(enemyCounter).setIndices(opponentBattleArmy.roster.get(enemyCounter).hiddenIndex);

		battleOrchestrator.refreshMap();

		BattleScreen.battleScene.indexedPanels.get(0).applyColor();
		deployOrder.remove(0);
		enemyCounter++;
		deploy();

	}

	private boolean checkLegalDeployment(int index, DeploymentZone zone, Army army, int counter) {

		if ((checkWithinDeploymentZone(index, zone)) && (checkNotAdjacent(index, army, counter))
				&& (checkNotBorder(index, army, counter))) {
			return true;
		} else
			return false;
	}

	private boolean checkWithinDeploymentZone(int index, DeploymentZone zone) {

		boolean illegalDeployment = false;
		for (int ii = 0; ii < zone.panels.length; ii++) {
			if (zone.panels[ii] == index) {
				illegalDeployment = true;
			}
		}
		return illegalDeployment;
	}

	private boolean checkNotAdjacent(int index, Army army, int counter) {

		boolean notAdjacent = true;
		ArrayList<Regiment> tempArmy = new ArrayList<Regiment>();
		for (int i = 0; i < army.roster.size(); i++) {
			tempArmy.add(army.roster.get(i));
		}
		tempArmy.remove(counter);

		for (int rowIndex = 0; rowIndex < ((army.roster.get(counter).rows)); rowIndex++) {
			for (int columnIndex = 0; columnIndex < ((army.roster.get(counter).columns)); columnIndex++) {

				for (int i = 0; i < tempArmy.size(); i++) {
					for (int ii = 0; ii < tempArmy.get(i).panels.length; ii++) {
						if (tempArmy.get(i).panels[ii] == index)
							notAdjacent = false;
						if (tempArmy.get(i).panels[ii] == index - 1)
							notAdjacent = false;
						if (tempArmy.get(i).panels[ii] == index + 1)
							notAdjacent = false;
						if (tempArmy.get(i).panels[ii] == index - 48)
							notAdjacent = false;
						if (tempArmy.get(i).panels[ii] == index + 48)
							notAdjacent = false;
						if (tempArmy.get(i).panels[ii] == index + 49)
							notAdjacent = false;
						if (tempArmy.get(i).panels[ii] == index - 49)
							notAdjacent = false;
						if (tempArmy.get(i).panels[ii] == index - 47)
							notAdjacent = false;
						if (tempArmy.get(i).panels[ii] == index + 47)
							notAdjacent = false;
					}
				}
				index++;
			}
			index = index + 48 - army.roster.get(counter).columns;

		}

		return notAdjacent;
	}

	private boolean checkNotBorder(int index, Army army, int counter) {
		int bottomLimit = 1582 - army.roster.get(counter).rows * 48;
		if (index > bottomLimit) {
			return false;
		} else {
			int rightLimit = 48 - army.roster.get(counter).columns - 8;
			int check = index % 48;
			if (check > rightLimit) {
				return false;
			} else {
				return true;
			}
		}
	}

	private void decideDeploymentOrder() {
		int yourDeployed = 0;
		int enemyDeployed = 0;
		for (int i = 0; i < calculateTotalRegiments(); i++) {
			if (yourBattleArmy.roster.size() - yourDeployed > opponentBattleArmy.roster.size() - enemyDeployed) {
				yourDeployed++;
				deployOrder.add(Who.PLAYER);
			} else {
				enemyDeployed++;
				deployOrder.add(Who.ENEMY);
			}

		}

	}

	private int calculateTotalRegiments() {
		return yourBattleArmy.roster.size() + opponentBattleArmy.roster.size();
	}

	private void fillInfoTextPanel() {

		applyStatColours();

		String intro = "<font color = 'rgb(220, 220, 220)'>" + "Please deploy the following regiment: <br>";
		String name = "<font color = #EEE000>" + yourBattleArmy.roster.get(playerCounter).name + "<br>";

		String life = "<font color = 'rgb(220, 220, 220)'> Life: ";
		String lifeStat = "<font color = rgb(" + lifeRed + "," + lifeGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalLife) + "<br>";

		String move = "<font color = 'rgb(220, 220, 220)'> Move: ";
		String moveStat = "<font color = rgb(" + moveRed + "," + moveGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalMove) + "<br>";

		String run = "<font color = 'rgb(220, 220, 220)'> Run: ";
		String runStat = "<font color = rgb(" + runRed + "," + runGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalRun) + "<br>";

		String speed = "<font color = 'rgb(220, 220, 220)'> Speed: ";
		String speedStat = "<font color = rgb(" + speedRed + "," + speedGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalSpeed) + "<br>";

		String attack = "<font color = 'rgb(220, 220, 220)'> Attack: ";
		String attackStat = "<font color = rgb(" + attackRed + "," + attackGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalAttack) + "<br>";

		String charge = "<font color = 'rgb(220, 220, 220)'> Charge: ";
		String chargeStat = "<font color = rgb(" + chargeRed + "," + chargeGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalCharge) + "<br>";

		String defence = "<font color = 'rgb(220, 220, 220)'> Defence: ";
		String defenceStat = "<font color = rgb(" + defenceRed + "," + defenceGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalDefence) + "<br>";

		String range = "<font color = 'rgb(220, 220, 220)'> Range: ";
		String rangeStat = "<font color = rgb(" + rangeRed + "," + rangeGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalMove) + "<br>";

		String ballistic = "<font color = 'rgb(220, 220, 220)'> Missile: ";
		String ballisticStat = "<font color = rgb(" + ballisticRed + "," + ballisticGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalMissile) + "<br>";

		String morale = "<font color = 'rgb(220, 220, 220)'> Morale: ";
		String moraleStat = "<font color = rgb(" + moraleRed + "," + moraleGreen + ", 30)>"
				+ Integer.toString(yourBattleArmy.roster.get(playerCounter).totalMorale) + "<br>";

		RightAggregatePanel.infoTextPanel.textArea.setText(intro + name + life + lifeStat + move + moveStat + run
				+ runStat + speed + speedStat + attack + attackStat + charge + chargeStat + defence + defenceStat
				+ range + rangeStat + ballistic + ballisticStat + morale + moraleStat);
	}

	private void applyStatColours() {

		lifeGreen = 50 + 6 * yourBattleArmy.roster.get(playerCounter).totalLife;
		lifeRed = 250 - 6 * yourBattleArmy.roster.get(playerCounter).totalLife;
		moveGreen = 50 + 30 * yourBattleArmy.roster.get(playerCounter).totalMove;
		moveRed = 250 - 30 * yourBattleArmy.roster.get(playerCounter).totalMove;
		runGreen = 50 + 20 * yourBattleArmy.roster.get(playerCounter).totalRun;
		runRed = 250 - 20 * yourBattleArmy.roster.get(playerCounter).totalRun;
		speedGreen = 50 + 10 * yourBattleArmy.roster.get(playerCounter).totalSpeed;
		speedRed = 250 - 10 * yourBattleArmy.roster.get(playerCounter).totalSpeed;
		attackGreen = 50 + 2 * yourBattleArmy.roster.get(playerCounter).totalAttack;
		attackRed = 250 - 2 * yourBattleArmy.roster.get(playerCounter).totalAttack;
		defenceGreen = 50 + 2 * yourBattleArmy.roster.get(playerCounter).totalDefence;
		defenceRed = 250 - 2 * yourBattleArmy.roster.get(playerCounter).totalDefence;
		chargeGreen = 50 + 2 * yourBattleArmy.roster.get(playerCounter).totalCharge;
		chargeRed = 250 - 2 * yourBattleArmy.roster.get(playerCounter).totalCharge;
		rangeGreen = 50 + 20 * yourBattleArmy.roster.get(playerCounter).totalRange;
		rangeRed = 250 - 20 * yourBattleArmy.roster.get(playerCounter).totalRange;
		ballisticGreen = 50 + 2 * yourBattleArmy.roster.get(playerCounter).totalMissile;
		ballisticRed = 250 - 2 * yourBattleArmy.roster.get(playerCounter).totalMissile;
		moraleGreen = 50 + 2 * yourBattleArmy.roster.get(playerCounter).totalMorale;
		moraleRed = 250 - 2 * yourBattleArmy.roster.get(playerCounter).totalMorale;

	}

}
