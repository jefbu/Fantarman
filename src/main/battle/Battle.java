package main.battle;

import main.Main;
import main.entity.armies.Army;
import main.entity.leagues.Matchup;
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
		opponentBattleArmy = chooseOpponentArmy();
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

	private Army chooseOpponentArmy() {

		for (Matchup matchup: Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups) {
			if (matchup.army1 == Main.yourArmy) { return matchup.army2; }
			else if (matchup.army2 == Main.yourArmy) { return matchup.army1; }
		}
		
		return null;

	}

}
