package main.battle;

import java.util.Random;

import main.Main;
import main.entity.armies.Army;
import main.entity.captains.Captain;
import main.entity.regiments.piknin.DoveMasters;
import main.entity.regiments.piknin.Harvesters;
import main.entity.regiments.wanmen.FireMages;
import main.entity.skills.Skills;
import main.graphics.battleScreen.BattleScreen;

public class Battle {

	public Deployment deployment;
	public BattleOrchestrator battleOrchestrator;
	public static BattleConclusion battleConclusion;

	private Army yourBattleArmy;
	public Army opponentBattleArmy;

	public Battle() {

		yourBattleArmy = new Army();
		makeYourArmy();
		yourBattleArmy.calculateValue();
		opponentBattleArmy = makeRandomArmy();
		opponentBattleArmy.calculateValue();

		BattleScreen.battleScene.createMap();

		battleOrchestrator = new BattleOrchestrator(yourBattleArmy, opponentBattleArmy);
		deployment = new Deployment(battleOrchestrator, yourBattleArmy, opponentBattleArmy);

	}

	private void makeYourArmy() {

		for (int i = 0; i < Main.yourArmy.roster.size(); i++) {
			yourBattleArmy.roster.add(Main.yourArmy.roster.get(i));
		}
	}

	private Army makeRandomArmy() {

		Random random = new Random();
		int roll = random.nextInt(4) + 4;
		int roll2 = 0;
		Army opponents = new Army();

		for (int i = 0; i < roll; i++) {
			roll2 = random.nextInt(3);
			switch (roll2) {
			case 0:
				opponents.roster.add(new FireMages("FireMages" + i,
						new Captain("Blofeld", "Male", 0, 0, 0, 0, 0, 0, 1, 40, null, null, "text")));
				break;
			case 1:
				opponents.roster.add(new DoveMasters("DoveMasters" + i,
						new Captain("Spectre", "Female", 0, 0, 0, 0, 0, 0, 3, 35, null, null, "text")));
				break;
			case 2:
				opponents.roster.add(new Harvesters("Harvesters" + i,
						new Captain("Goldfinger", "Male", 0, 0, 0, 0, 0, 0, 2, 45, Skills.Deployer, null, "text")));
				break;
			}
		}

		return opponents;

	}

}
