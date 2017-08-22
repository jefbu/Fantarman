package main.battle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import javax.swing.Timer;

import main.Main;
import main.components.Colour;
import main.entity.armies.Army;
import main.entity.regiments.Regiment;

public class BattleOrchestrator {

	public static Timer timer;
	public ActionListener actionListener;
	private int totalTurns;
	private int counter;
	private Army activeArmy;

	public BattleOrchestrator() {
		
		counter = 0;
		activeArmy = Main.yourArmy;


		for (Regiment regiment : Main.yourArmy.roster) {
			regiment.attributeBattleSpeed();
			regiment.attributeBattleLife();
			regiment.attributeBattleStats();
		}
		for (Regiment regiment : Main.opponentArmy.roster) {
			regiment.attributeBattleSpeed();
			regiment.attributeBattleLife();
			regiment.attributeBattleStats();
		}



		actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Main.yourArmy.roster.size() == 0 || Main.opponentArmy.roster.size() == 0) {
					BattleConclusion battleConclusion = new BattleConclusion(Colour.RED);
					battleConclusion.setVisible(true);	
					timer.stop();
				} else if (counter == totalTurns) { 
					timer.stop(); 
					System.out.println("Battle finished");
				} else {
				Regiment activeRegiment = decideActiveRegiment();
				if (activeRegiment.battleSpeed <= 0) {
					counter++;
					for (Regiment regiment : Main.yourArmy.roster) {
						regiment.attributeBattleSpeed();
						regiment.attributeBattleStats();
					}
					for (Regiment regiment : Main.opponentArmy.roster) {
						regiment.attributeBattleSpeed();
						regiment.attributeBattleStats();
					}
				} else {
				activeRegiment.haveTurn(activeArmy);
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
		return 6 + random.nextInt(2);
	}

	private Regiment decideActiveRegiment() {

		Collections.sort(Main.yourArmy.roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment p1, Regiment p2) {
				return p2.battleSpeed - p1.battleSpeed;
			}
		});
		Collections.sort(Main.opponentArmy.roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment p1, Regiment p2) {
				return p2.battleSpeed - p1.battleSpeed;
			}
		});
		if (Main.yourArmy.roster.get(0).battleSpeed >= Main.opponentArmy.roster.get(0).battleSpeed) {
			activeArmy = Main.yourArmy;
			return Main.yourArmy.roster.get(0);
		} else {
			activeArmy = Main.opponentArmy;
			return Main.opponentArmy.roster.get(0);
		}

	}

}

