package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.graphics.battleScreen.BattleScreen;
import main.graphics.battleScreen.RightAggregatePanel;

public class Battle {

	int counter = 0;

	public Battle() {

		BattleScreen.battleScene.createMap();

		deploy();

	}

	private void deploy() {

		fillInfoTextPanel();
		DeploymentZone zone = new DeploymentZone();


		Who turn = decideOrder();
		if (turn == Who.ENEMY) {
			deployEnemy();
		} else if (turn == Who.PLAYER) {
			deployPlayer();
		} else
			finishDeployment();

		for (int i = 0; i < BattleScreen.battleScene.indexedPanels.size(); i++) {

			int index = i;
			BattleScreen.battleScene.indexedPanels.get(i).button
					.removeActionListener(BattleScreen.battleScene.indexedPanels.get(i).button.getActionListeners()[0]);
			BattleScreen.battleScene.indexedPanels.get(i).button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					Main.yourArmy.roster.get(counter).setIndices(index);
					
					if (checkWithinDeploymentZone(index, zone) == true) {
						
					for (int iii = 0; iii < Main.yourArmy.roster.get(counter).panels.length; iii++) {

						BattleScreen.battleScene.indexedPanels.get(Main.yourArmy.roster.get(counter).panels[iii]).button
								.setIcon(Main.yourArmy.roster.get(counter).icon);
						BattleScreen.battleScene.indexedPanels.get(Main.yourArmy.roster.get(counter).panels[iii])
								.setBackground(new Color(255, 255, 60));
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

				}

			});

		}

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

	private Who decideOrder() {
		if (counter % 2 == 0)
			return Who.PLAYER;
		else
			return Who.ENEMY;
	}

	private void deployEnemy() {

	}

	private void deployPlayer() {

	}

	private void finishDeployment() {

	}

	private void fillInfoTextPanel() {
		RightAggregatePanel.infoTextPanel.textArea.setText(Main.yourArmy.roster.get(counter).name);
		RightAggregatePanel.infoTextPanel.textArea.append(Integer.toString(Main.yourArmy.roster.get(counter).attack));
	}

	
}
