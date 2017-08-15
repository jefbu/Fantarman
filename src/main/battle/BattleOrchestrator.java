package main.battle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import javax.swing.Timer;

import main.Main;
import main.entity.regiments.Regiment;

public class BattleOrchestrator {

	private ArrayList<Regiment> allRegiments;
	public static Timer timer;
	public ActionListener actionListener;
	private int totalTurns;
	private int counter;

	public BattleOrchestrator() {
		
		counter = 0;

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
		
		for (Regiment regiment : allRegiments) {
			regiment.attributeBattleSpeed();
		}

		actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (counter == totalTurns) { timer.stop(); } else {
				Regiment activeRegiment = decideActiveRegiment();
				if (activeRegiment.battleSpeed <= 0) {
					counter++;
					for (Regiment regiment : allRegiments) {
						regiment.attributeBattleSpeed();
					}
				} else {
				activeRegiment.haveTurn();
				activeRegiment.battleSpeed -= 10;
				}
			}
			}
		};
		
		timer = new Timer(1000, actionListener);

	}

	public void orchestrateBattle() {
		totalTurns = decideTotalTurns();
		timer.start();
	}

	private int decideTotalTurns() {
		Random random = new Random();
		return 5 + random.nextInt(2);
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

