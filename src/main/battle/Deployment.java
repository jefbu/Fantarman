package main.battle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import main.Main;
import main.components.Colour;
import main.components.Popup;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;
import main.graphics.battleScreen.RightAggregatePanel;
import main.utility.Who;

public class Deployment {
	
	BattleOrchestrator battleOrchestrator;

	int playerCounter = 0;
	int enemyCounter = 0;
	ArrayList<Who> deployOrder;
	DeploymentZone playerDeploymentZone;
	DeploymentZone enemyDeploymentZone;

	int attackGreen;
	int attackRed;
	int defenceGreen;
	int defenceRed;
	int chargeGreen;
	int chargeRed;
	int ballisticGreen;
	int ballisticRed;
	int moraleGreen;
	int moraleRed;

	public Deployment(BattleOrchestrator battleOrchestrator) {
		
		this.battleOrchestrator = battleOrchestrator;

		playerDeploymentZone = new DeploymentZone(24);
		enemyDeploymentZone = new DeploymentZone(0);

		deployOrder = new ArrayList<Who>();

		decideDeploymentOrder();

		for (int i = 0; i < deployOrder.size(); i++) {
			deploy();
		}
		
	}

	private void deploy() {

		System.out.println(deployOrder.size());
		if (deployOrder.size() == 0) {
			playerDeploymentZone.removeDeploymentZone();
			enemyDeploymentZone.removeDeploymentZone();
				for (int i = 0; i < BattleScreen.battleScene.indexedPanels.size(); i++) {
					BattleScreen.battleScene.indexedPanels.get(i).button.removeActionListener(
							BattleScreen.battleScene.indexedPanels.get(i).button.getActionListeners()[0]);
				}
			Popup popup = new Popup(400, 180, Colour.BLUE);
			popup.setVisible(true);
			battleOrchestrator.orchestrateBattle();
		}
		else if (deployOrder.get(0) == Who.ENEMY)
			deployEnemyRegiment();
		else
			deployPlayerRegiment();

	}

	private void deployPlayerRegiment() {

		fillInfoTextPanel();

		for (int i = 0; i < BattleScreen.battleScene.indexedPanels.size(); i++) {

			int index = i;
			BattleScreen.battleScene.indexedPanels.get(i).button
					.removeActionListener(BattleScreen.battleScene.indexedPanels.get(i).button.getActionListeners()[0]);
			BattleScreen.battleScene.indexedPanels.get(i).button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					
					if (checkLegalDeployment(index, playerDeploymentZone, Main.yourArmy, playerCounter) == true) {
						
						Main.yourArmy.roster.get(playerCounter).setIndices(index);
						BattleScreen.battleScene.refreshMap();
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
		
		Random random = new Random();
		int roll = 0;
		int roll2 = 0;

		boolean keepGoing = true;
		
		while (keepGoing) {
			roll = random.nextInt(7);
			roll2 = random.nextInt(20);
			if (checkNotAdjacent (roll * 48 + 12 + roll2, Main.opponentArmy, enemyCounter)) { keepGoing = false; }
		}

		Main.opponentArmy.roster.get(enemyCounter).setIndices(roll * 48 + 12 + roll2);

		for (int i = 0; i < Main.opponentArmy.roster.get(enemyCounter).panels.length; i++) {
			BattleScreen.battleScene.refreshMap();
		}

		BattleScreen.battleScene.indexedPanels.get(0).applyColor();
		deployOrder.remove(0);
		enemyCounter++;
		deploy();

	}

	private boolean checkLegalDeployment(int index, DeploymentZone zone, Army army, int counter) {

		if ((checkWithinDeploymentZone(index, zone)) && (checkNotAdjacent(index, army, counter))) {
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
			for (int columnIndex = 0; columnIndex < ((army.roster
					.get(counter).columns)); columnIndex++) {

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

	private void decideDeploymentOrder() {
		int yourDeployed = 0;
		int enemyDeployed = 0;
		for (int i = 0; i < calculateTotalRegiments(); i++) {
			if (Main.yourArmy.roster.size() - yourDeployed > Main.opponentArmy.roster.size() - enemyDeployed) {
				yourDeployed++;
				deployOrder.add(Who.PLAYER);
			} else {
				enemyDeployed++;
				deployOrder.add(Who.ENEMY);
			}

		}

	}

	private int calculateTotalRegiments() {
		return Main.yourArmy.roster.size() + Main.opponentArmy.roster.size();
	}

	private void fillInfoTextPanel() {

		applyStatColours();

		String intro = "<font color = 'rgb(220, 220, 220)'>" + "Please deploy the following regiment: <br>";
		String name = "<font color = #EEE000>" + Main.yourArmy.roster.get(playerCounter).name + "<br>";
		String attack = "<font color = 'rgb(220, 220, 220)'> Attack: ";
		String attackStat = "<font color = rgb(" + attackRed + "," + attackGreen + ", 30)>"
				+ Integer.toString(Main.yourArmy.roster.get(playerCounter).attack) + "<br>";
		String charge = "<font color = 'rgb(220, 220, 220)'> Charge: ";
		String chargeStat = "<font color = rgb(" + chargeRed + "," + chargeGreen + ", 30)>"
				+ Integer.toString(Main.yourArmy.roster.get(playerCounter).charge) + "<br>";
		String defence = "<font color = 'rgb(220, 220, 220)'> Defence: ";
		String defenceStat = "<font color = rgb(" + defenceRed + "," + defenceGreen + ", 30)>"
				+ Integer.toString(Main.yourArmy.roster.get(playerCounter).defence) + "<br>";
		String ballistic = "<font color = 'rgb(220, 220, 220)'> Ballistic: ";
		String ballisticStat = "<font color = rgb(" + ballisticRed + "," + ballisticGreen + ", 30)>"
				+ Integer.toString(Main.yourArmy.roster.get(playerCounter).missile) + "<br>";
		String morale = "<font color = 'rgb(220, 220, 220)'> Morale: ";
		String moraleStat = "<font color = rgb(" + moraleRed + "," + moraleGreen + ", 30)>"
				+ Integer.toString(Main.yourArmy.roster.get(playerCounter).morale) + "<br>";

		RightAggregatePanel.infoTextPanel.textArea.setText(intro + name + attack + attackStat + charge + chargeStat
				+ defence + defenceStat + ballistic + ballisticStat + morale + moraleStat);
	}

	private void applyStatColours() {

		attackGreen = 50 + 2 * Main.yourArmy.roster.get(playerCounter).attack;
		attackRed = 250 - 2 * Main.yourArmy.roster.get(playerCounter).attack;
		defenceGreen = 50 + 2 * Main.yourArmy.roster.get(playerCounter).defence;
		defenceRed = 250 - 2 * Main.yourArmy.roster.get(playerCounter).defence;
		chargeGreen = 50 + 2 * Main.yourArmy.roster.get(playerCounter).charge;
		chargeRed = 250 - 2 * Main.yourArmy.roster.get(playerCounter).charge;
		ballisticGreen = 50 + 2 * Main.yourArmy.roster.get(playerCounter).missile;
		ballisticRed = 250 - 2 * Main.yourArmy.roster.get(playerCounter).missile;
		moraleGreen = 50 + 2 * Main.yourArmy.roster.get(playerCounter).morale;
		moraleRed = 250 - 2 * Main.yourArmy.roster.get(playerCounter).morale;

	}

}
