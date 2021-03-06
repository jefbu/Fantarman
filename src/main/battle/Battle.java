package main.battle;

import java.util.Collections;
import java.util.Comparator;

import main.Main;
import main.AI.BattleAI;
import main.AI.DeployAI;
import main.entity.armies.Army;
import main.entity.leagues.Matchup;
import main.entity.regiments.Regiment;
import main.entity.regiments.Role;
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
		
		opponentBattleArmy.battleStrategy = BattleAI.decideGlobalBattleStrategy(opponentBattleArmy, yourBattleArmy);
		opponentBattleArmy.deploymentStrategy = DeployAI.decideGlobalDeployStrategy(opponentBattleArmy);
		

		BattleScreen.battleScene.createMap();
		
		Skit skit = new Skit(yourBattleArmy, opponentBattleArmy);
		skit.fillSkit(yourBattleArmy, opponentBattleArmy);

		battleOrchestrator = new BattleOrchestrator(yourBattleArmy, opponentBattleArmy);
		deployment = new Deployment(battleOrchestrator, yourBattleArmy, opponentBattleArmy);

	}

	private void makeYourArmy() {

		for (Regiment regiment: Main.yourArmy.roster) {
			if(regiment.role == Role.COMBAT) { 
				yourBattleArmy.roster.add(regiment);
				regiment.battlesFought++;
				}
		}
		yourBattleArmy.name = Main.yourArmy.name;
	}

	private Army chooseOpponentArmy() {
		
		Army tempArmy = new Army();
		
		for (Matchup matchup: Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups) {
			if (matchup.army1 == Main.yourArmy) { 
				for (Regiment regiment: matchup.army2.roster) {
					tempArmy.roster.add(regiment);
					}
				tempArmy.name = matchup.army2.name;
			}
			
			else if (matchup.army2 == Main.yourArmy) { 
				for (Regiment regiment: matchup.army1.roster) {
					tempArmy.roster.add(regiment);
					}
				tempArmy.name = matchup.army1.name;
			}
		}
		
		Army returnArmy = new Army();
		
		Collections.sort(tempArmy.roster, new Comparator<Regiment>() {
			@Override
			public int compare(Regiment p1, Regiment p2) {
				return p2.value - p1.value;
			}
		});
		
		for (int i = 0; i < 8; i++) {
			returnArmy.roster.add(tempArmy.roster.get(i));
		}
		
		returnArmy.name = tempArmy.name;

		return returnArmy;

	}

}
