package main.battle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import javax.swing.Timer;

import main.components.Colour;
import main.components.IndexedPanel;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;

public class BattleOrchestrator {

	public static Timer timer;
	public ActionListener actionListener;
	private int totalTurns;
	private int counter;
	private Army activeArmy;
	public static Army yourBattleArmy;
	private Army opponentBattleArmy;
	private int activeRegimentIndex;
	Regiment activeRegiment;

	public BattleOrchestrator(Army yourBattleArmy, Army opponentBattleArmy) {

		counter = 0;
		activeArmy = yourBattleArmy;
		BattleOrchestrator.yourBattleArmy = yourBattleArmy;
		this.opponentBattleArmy = opponentBattleArmy;

		for (Regiment regiment : yourBattleArmy.roster) {
			regiment.attributeBattleSpeed();
			regiment.attributeBattleLife();
			regiment.attributeBattleStats();
		}
		for (Regiment regiment : opponentBattleArmy.roster) {
			regiment.attributeBattleSpeed();
			regiment.attributeBattleLife();
			regiment.attributeBattleStats();
		}

		BattleScreen.informationPanel.yourPanel.fillBattleOverviewInformationPanel(yourBattleArmy);
		BattleScreen.informationPanel.enemyPanel.fillBattleOverviewInformationPanel(opponentBattleArmy);
		BattleScreen.informationPanel.yourPanel.update(yourBattleArmy);
		BattleScreen.informationPanel.enemyPanel.update(opponentBattleArmy);

		actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (yourBattleArmy.roster.size() == 0 || opponentBattleArmy.roster.size() == 0) {
					BattleConclusion battleConclusion = new BattleConclusion(Colour.DGREY, yourBattleArmy,
							opponentBattleArmy);
					battleConclusion.setVisible(true);
					timer.stop();
					refreshMap();
				} else if (counter == totalTurns) {
					BattleConclusion battleConclusion = new BattleConclusion(Colour.DGREY, yourBattleArmy,
							opponentBattleArmy);
					battleConclusion.setVisible(true);
					timer.stop();
					refreshMap();
				} else {
					activeRegiment = decideActiveRegiment();
					if (activeRegiment.battleSpeed <= 0) {
						counter++;
						for (Regiment regiment : yourBattleArmy.roster) {
							regiment.attributeBattleSpeed();
							// regiment.attributeBattleStats();
							regiment.battleMorale = regiment.battleMorale - 5;
						}
						for (Regiment regiment : opponentBattleArmy.roster) {
							regiment.attributeBattleSpeed();
							// regiment.attributeBattleStats();
							regiment.battleMorale = regiment.battleMorale - 5;
						}
					} else {
						activeRegiment.haveTurn(activeArmy, activeRegimentIndex, yourBattleArmy, opponentBattleArmy,
								counter);
						activeRegiment.battleSpeed -= 10;
						BattleScreen.informationPanel.yourPanel.update(yourBattleArmy);
						BattleScreen.informationPanel.enemyPanel.update(opponentBattleArmy);
						refreshMap();
						refreshRegimentColours();
					}
				}
			}
		};

		timer = new Timer(2000, actionListener);

	}

	public void orchestrateBattle() {
		totalTurns = decideTotalTurns();
		timer.start();
	}

	private int decideTotalTurns() {
		Random random = new Random();
		return 6 + random.nextInt(2);
	}

	private Regiment decideActiveRegiment() {

		Collections.sort(yourBattleArmy.roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment p1, Regiment p2) {
				return p2.battleSpeed - p1.battleSpeed;
			}
		});
		Collections.sort(opponentBattleArmy.roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment p1, Regiment p2) {
				return p2.battleSpeed - p1.battleSpeed;
			}
		});
		if (yourBattleArmy.roster.get(0).battleSpeed >= opponentBattleArmy.roster.get(0).battleSpeed) {
			activeArmy = yourBattleArmy;
			activeRegimentIndex = 0;
			return yourBattleArmy.roster.get(0);
		} else {
			activeArmy = opponentBattleArmy;
			activeRegimentIndex = 0;
			return opponentBattleArmy.roster.get(0);
		}

	}

	public void refreshMap() {
		for (IndexedPanel panel : BattleScreen.battleScene.indexedPanels) {
			panel.applyColor();
		}
		refreshRegimentColours();
	}

	public void refreshRegimentColours() {

		for (IndexedPanel panel : BattleScreen.battleScene.indexedPanels) {
			panel.button.setToolTipText("");
		}

		for (Regiment yourRegiment : yourBattleArmy.roster) {
			double dred = (yourRegiment.battleLife * 10 / yourRegiment.totalLife);
			dred = dred / 10;
			int red = 255 - (int) (dred * 255);
			if (red > 255) {
				red = 255;
			} else if (red < 0) {
				red = 0;
			}
			for (int i = 0; i < yourRegiment.panels.length; i++) {
				BattleScreen.battleScene.indexedPanels.get(yourRegiment.panels[i]).button.setIcon(yourRegiment.icon);
				BattleScreen.battleScene.indexedPanels.get(yourRegiment.panels[i])
						.setBackground(new Color(130, 130 - red / 2, 130 - red / 2));
				BattleScreen.battleScene.indexedPanels.get(yourRegiment.panels[i]).button
						.setToolTipText(yourRegiment.captain.name + "'s " + yourRegiment.regiment + ", " 
										+ yourRegiment.type + ", " + "total value: " + yourRegiment.value);
			}
		}

		for (Regiment enemyRegiment : opponentBattleArmy.roster) {
			double dred = (enemyRegiment.battleLife * 10 / enemyRegiment.totalLife);
			dred = dred / 10;
			int red = 255 - (int) (dred * 255);
			if (red > 255) {
				red = 255;
			} else if (red < 0) {
				red = 0;
			}
			for (int i = 0; i < enemyRegiment.panels.length; i++) {
				BattleScreen.battleScene.indexedPanels.get(enemyRegiment.panels[i]).button.setIcon(enemyRegiment.icon);
				BattleScreen.battleScene.indexedPanels.get(enemyRegiment.panels[i]).setBackground(new Color(red, 0, 0));
				BattleScreen.battleScene.indexedPanels.get(enemyRegiment.panels[i]).button
				.setToolTipText(enemyRegiment.captain.name + "'s " + enemyRegiment.regiment + ", " 
						+ enemyRegiment.type + ", " + "total value: " + enemyRegiment.value);
			}
		}

		if (activeRegiment != null) {
			for (int i = 0; i < activeRegiment.panels.length; i++) {
				BattleScreen.battleScene.indexedPanels.get(activeRegiment.panels[i])
						.setBackground(new Color(170, 190, 140));
			}
		}
	}

}
