package main.battle;

import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import main.Main;
import main.components.Colour;
import main.components.TextPopup;
import main.entity.armies.Army;
import main.entity.leagues.Matchup;
import main.entity.leagues.Result;
import main.entity.regiments.Regiment;
import main.graphics.Screen;
import main.graphics.battleScreen.BattleScreen;
import main.strings.Adjectives;

public class BattleConclusion extends TextPopup {

	private static final long serialVersionUID = 1L;

	public BattleConclusion(Colour colour, Army yourBattleArmy, Army opponentBattleArmy) {
		
		super(BattleScreen.battleScene.roundedWidth / 2, BattleScreen.battleScene.roundedHeight / 2, colour, true);
		
		int yourInitialValue = yourBattleArmy.value;
		int enemyInitialValue = opponentBattleArmy.value;
		
		int yourFinalValue = 0;
		for (Regiment regiment: yourBattleArmy.roster) {
			yourFinalValue = yourFinalValue + regiment.value;
		}
		
		int enemyFinalValue = 0;
		for (Regiment regiment: opponentBattleArmy.roster) {
			enemyFinalValue = enemyFinalValue + regiment.value;
		}
		
		int yourPercentage = yourFinalValue * 100 / yourInitialValue;
		int enemyPercentage = enemyFinalValue * 100 / enemyInitialValue;
		
		if (yourPercentage > enemyPercentage * 15 / 10) {
			Adjectives adjectives = new Adjectives();
			String adjective = adjectives.choosePositiveAdjective();
			writeText (adjective + " victory"); 
			Main.yourArmy.scoreSheet.bigWins++;
			Main.yourArmy.scoreSheet.calculatePoints();
			opponentBattleArmy.scoreSheet.bigLosses++;
			opponentBattleArmy.scoreSheet.calculatePoints();
			for (Matchup matchup: Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups) {
				if (matchup.army1 == Main.yourArmy) { matchup.result = Result.W; }
				else if (matchup.army2 == Main.yourArmy) {	matchup.result = Result.L; }
			}
			
		}
		else if (yourPercentage > enemyPercentage * 12 / 10) { 
			writeText ("minor victory"); 
			Main.yourArmy.scoreSheet.smallWins++;
			Main.yourArmy.scoreSheet.calculatePoints();
			opponentBattleArmy.scoreSheet.smallLosses++;
			opponentBattleArmy.scoreSheet.calculatePoints();
			for (Matchup matchup: Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups) {
				if (matchup.army1 == Main.yourArmy) { matchup.result = Result.w; }
				else if (matchup.army2 == Main.yourArmy) {	matchup.result = Result.l; }
			}
		}
		else if (yourPercentage > enemyPercentage * 8 / 10) { 
			Main.yourArmy.scoreSheet.draws++;
			Main.yourArmy.scoreSheet.calculatePoints();
			opponentBattleArmy.scoreSheet.draws++;
			opponentBattleArmy.scoreSheet.calculatePoints();
			writeText ("draw");
			for (Matchup matchup: Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups) {
				if (matchup.army1 == Main.yourArmy) { matchup.result = Result.D; }
				else if (matchup.army2 == Main.yourArmy) {	matchup.result = Result.D; }
			}
		}
		
		else if (yourPercentage > enemyPercentage * 6 / 10) { 
			Main.yourArmy.scoreSheet.smallLosses++;
			Main.yourArmy.scoreSheet.calculatePoints();
			opponentBattleArmy.scoreSheet.smallWins++;
			opponentBattleArmy.scoreSheet.calculatePoints();
			writeText ("minor loss");
			for (Matchup matchup: Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups) {
				if (matchup.army1 == Main.yourArmy) { matchup.result = Result.l; }
				else if (matchup.army2 == Main.yourArmy) {	matchup.result = Result.w; }
			}
		}
		else { 
			Main.yourArmy.scoreSheet.bigLosses++;
			Main.yourArmy.scoreSheet.calculatePoints();
			opponentBattleArmy.scoreSheet.bigWins++;
			opponentBattleArmy.scoreSheet.calculatePoints();
			writeText ("major loss"); 
			for (Matchup matchup: Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups) {
				if (matchup.army1 == Main.yourArmy) { matchup.result = Result.L; }
				else if (matchup.army2 == Main.yourArmy) {	matchup.result = Result.W; }
			}
		}

		calculateOpponentResults();
		yourBattleArmy.roster.clear();
		opponentBattleArmy.roster.clear();
		
		for (Regiment regiment: Main.yourArmy.roster) {
			for (int i = 0; i < regiment.panels.length; i++) {
				regiment.panels[i] = 0;  
				regiment.inCombat = false;
			}
		}
		
		Collections.sort(Main.league.armies, new Comparator<Army>() {
			@Override
			public int compare(Army p1, Army p2) {
				return p2.scoreSheet.totalPoints - p1.scoreSheet.totalPoints;
			}
		});
		
		Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
		Screen.gameScreen.mainPanel.homeView.fillHomeScreen();;
		Screen.gameScreen.mainPanel.infoView.fillInfoView(Main.yourArmy);
		Screen.gameScreen.mainPanel.leagueView.fillLeagueView();
		
		Main.league.calendarDay++;
		
	}
	
	
	public void calculateOpponentResults() {
		
		Random random = new Random();
		
		for (Matchup matchup: Main.league.calendar.calendarDays.get(Main.league.calendarDay).matchups) {
					
			if(matchup.army1 == Main.yourArmy || matchup.army2 == Main.yourArmy) {}
			else {
				int army1Bonus = matchup.army1.value * 100 / matchup.army2.value;
				int roll = random.nextInt(100) + 1;
				if((roll + army1Bonus) > 180) {
					matchup.army1.scoreSheet.bigWins++;
					matchup.army1.scoreSheet.calculatePoints();
					matchup.army2.scoreSheet.bigLosses++;
					matchup.army2.scoreSheet.calculatePoints();
					matchup.result = Result.W;
				}
				else if((roll + army1Bonus) > 160) {
					matchup.army1.scoreSheet.smallWins++;
					matchup.army1.scoreSheet.calculatePoints();
					matchup.army2.scoreSheet.smallLosses++;
					matchup.army2.scoreSheet.calculatePoints();
					matchup.result = Result.w;
				}
				else if((roll + army1Bonus) > 140) {
					matchup.army1.scoreSheet.draws++;
					matchup.army1.scoreSheet.calculatePoints();
					matchup.army2.scoreSheet.draws++;
					matchup.army2.scoreSheet.calculatePoints();
					matchup.result = Result.D;
				}
				else if((roll + army1Bonus) > 120) {
					matchup.army1.scoreSheet.smallLosses++;
					matchup.army1.scoreSheet.calculatePoints();
					matchup.army2.scoreSheet.smallWins++;
					matchup.army2.scoreSheet.calculatePoints();
					matchup.result = Result.l;
				}
				else {
					matchup.army1.scoreSheet.bigLosses++;
					matchup.army1.scoreSheet.calculatePoints();
					matchup.army2.scoreSheet.bigWins++;
					matchup.army2.scoreSheet.calculatePoints();
					matchup.result = Result.L;
				}
			}
			
		}
		
	}
	
	
}
