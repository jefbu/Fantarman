package main.battle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import main.Main;
import main.entity.regiments.Regiment;
import main.graphics.battleScreen.RightAggregatePanel;

public class BattleOrchestrator {

	private ArrayList<Regiment> allRegiments;

	public BattleOrchestrator() {

		allRegiments = new ArrayList<Regiment>();

		for (Regiment regiment : Main.yourArmy.roster) {
			allRegiments.add(regiment);
		}
		for (Regiment regiment : Main.opponentArmy.roster) {
			allRegiments.add(regiment);
		}

		for (Regiment regiment : allRegiments) {
			regiment.attributeBattleStats();
		}

	}

	public void orchestrateBattle() {

		int totalTurns = decideTotalTurns();

		for (int i = 0; i < totalTurns; i++) {
			for (Regiment regiment : allRegiments) {
				regiment.attributeBattleSpeed();
				System.out.println(regiment.name + " " + regiment.battleSpeed);
			}
			executeTurn();
		}

	}

	private int decideTotalTurns() {
		Random random = new Random();
		return 6 + random.nextInt(3);
	}

	private void executeTurn() {

		boolean goOn = true;
		while (goOn) {
			Regiment activeRegiment = decideActiveRegiment();
			if (activeRegiment.battleSpeed <= 0) {
				goOn = false;
			} else {
				System.out.println(activeRegiment.name + " is having their turn");
				System.out.println(activeRegiment.speed + " " + activeRegiment.battleSpeed);
				activeRegiment.haveTurn(activeRegiment);

				activeRegiment.battleSpeed -= 10;
			}
		}
	}

	private Regiment decideActiveRegiment() {

		Collections.sort(allRegiments, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment p1, Regiment p2) {
				return p2.battleSpeed - p1.battleSpeed;
			}
		});
		return allRegiments.get(0);

	}

}
