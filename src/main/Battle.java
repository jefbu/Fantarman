package main;

import java.awt.Color;

import main.entity.regiments.Regiment;
import main.graphics.battleScreen.BattleScreen;

public class Battle {

	public Battle() {

		BattleScreen.battleScene.createMap();
		deploy();

	}

	private void deploy() {

		for (int i = 0; i < Main.testArmy.roster.size(); i++) {

			for (int ii = 0; ii < Main.testArmy.roster.get(i).panels.length; ii++) {

				BattleScreen.battleScene.indexedPanels.get(Main.testArmy.roster.get(i).panels[ii]).button
						.setIcon(Main.testArmy.roster.get(i).icon);
				BattleScreen.battleScene.indexedPanels.get(Main.testArmy.roster.get(i).panels[ii])
						.setBackground(new Color(0, 0, 0));
				;

			}

		}

	}

}
