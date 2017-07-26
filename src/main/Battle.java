package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;
import main.graphics.battleScreen.RightAggregatePanel;

public class Battle {

	int counter = 0;
	ArrayList<Who> deployOrder;
	DeploymentZone zone;

	public Battle() {

		BattleScreen.battleScene.createMap();

		zone = new DeploymentZone();
		deployOrder = new ArrayList<Who>();

		decideDeploymentOrder();

		deploy();

	}

	private void deploy() {

		if (deployOrder.size() == 0)
			System.out.println("finished deploying");
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

					Main.yourArmy.roster.get(counter).setIndices(index);

					if (checkLegalDeployment(index, zone) == true) {

						for (int iii = 0; iii < Main.yourArmy.roster.get(counter).panels.length; iii++) {

							BattleScreen.battleScene.indexedPanels
									.get(Main.yourArmy.roster.get(counter).panels[iii]).button
											.setIcon(Main.yourArmy.roster.get(counter).icon);
							BattleScreen.battleScene.indexedPanels.get(Main.yourArmy.roster.get(counter).panels[iii])
									.setBackground(new Color(255, 255, 255));
						}

						counter++;

					}

					if (counter >= Main.yourArmy.roster.size()) {

						for (int i = 0; i < BattleScreen.battleScene.indexedPanels.size(); i++) {

							BattleScreen.battleScene.indexedPanels.get(i).button.removeActionListener(
									BattleScreen.battleScene.indexedPanels.get(i).button.getActionListeners()[0]);

							zone.removeDeploymentZone();

						}

					} else {
						fillInfoTextPanel();
					}
					BattleScreen.battleScene.indexedPanels.get(0).applyColor();
					deployOrder.remove(0);
					deploy();

				}

			});

		}

	}

	private void deployEnemyRegiment() {

		Random random = new Random();
		int roll = random.nextInt(7);
		int roll2 = random.nextInt(20);

		BattleScreen.battleScene.indexedPanels.get(roll * 48 + 12 + roll2).button
				.setIcon(Main.opponentArmy.roster.get(0).icon);
		BattleScreen.battleScene.indexedPanels.get(roll * 48 + 12 + roll2).setBackground(new Color(0, 0, 255));

		deployOrder.remove(0);
		deploy();

	}

	private boolean checkLegalDeployment(int index, DeploymentZone zone) {

		if ((checkWithinDeploymentZone(index, zone)) && (checkNotAdjacent(index))) {
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

	private boolean checkNotAdjacent(int index) {

		boolean notAdjacent = true;
		ArrayList<Regiment> tempArmy = new ArrayList<Regiment>();
		for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
			tempArmy.add(Main.yourArmy.roster.get(i));
		}
		tempArmy.remove(counter);

		for (int rowIndex = 0; rowIndex < ((Main.yourArmy.roster.get(counter).rows)); rowIndex++) {
			for (int columnIndex = 0; columnIndex < ((Main.yourArmy.roster.get(counter).columns)); columnIndex++) {

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
			index = index + 48 - Main.yourArmy.roster.get(counter).columns;

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

		int attackGreen = 50 + 2 * Main.yourArmy.roster.get(counter).attack;
		int attackRed = 250 - 2 * Main.yourArmy.roster.get(counter).attack;

		String intro = "<font color = rgb(220, 220, 220)>" + "Please deploy the following regiment: <br>";
		String name = "<font color = #EEE000>" + Main.yourArmy.roster.get(counter).name + "<br>";
		String attack = "<font color = rgb(" + attackRed + "," + attackGreen + ", 30)>"
				+ Integer.toString(Main.yourArmy.roster.get(counter).attack);

		RightAggregatePanel.infoTextPanel.textArea.setText(intro + "<font color = #EEE000>" + name + attack);
	}

}
