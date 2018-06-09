package main.battle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import main.utility.SaveTrophies;
import main.utility.Trophies;

public class BattleConclusion extends TextPopup {

	private static final long serialVersionUID = 1L;
	private int matchResult;

	public BattleConclusion(Colour colour, Army yourBattleArmy, Army opponentBattleArmy) {
		
		super(BattleScreen.battleScene.roundedWidth / 2, BattleScreen.battleScene.roundedHeight / 2, colour, false);
		
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
		
		int yourPercentage = yourFinalValue * 100 / yourInitialValue + 1;
		int enemyPercentage = enemyFinalValue * 100 / enemyInitialValue + 1;
		
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
			
			matchResult = 5;
			
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
			
			matchResult = 4;
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
			
			matchResult = 2;
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
			
			matchResult = 1;
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
			
			matchResult = 0;
		}

		calculateOpponentResults();
		yourBattleArmy.roster.clear();
		opponentBattleArmy.roster.clear();
		
		for (Army army: Main.league.armies) {
			for (Regiment regiment: army.roster) {
			for (int i = 0; i < regiment.panels.length; i++) {
				regiment.panels[i] = 0;  
				regiment.inCombat = false;
			}
			}
		}
		
		Collections.sort(Main.league.armies, new Comparator<Army>() {
			@Override
			public int compare(Army p1, Army p2) {
				return p2.scoreSheet.totalPoints - p1.scoreSheet.totalPoints;
			}
		});
		
		Main.yourArmy.calculateBoardSatisfaction(matchResult);
		Main.yourArmy.calculateFanSatisfaction(matchResult);
		
		Screen.gameScreen.mainPanel.armyView.fillArmyView(Main.yourArmy);
		Screen.gameScreen.mainPanel.homeView.fillHomeScreen(true);;
		Screen.gameScreen.mainPanel.infoView.fillInfoView(Main.yourArmy);
		Screen.gameScreen.mainPanel.leagueView.fillLeagueView();
		
		Main.league.calendarDay++;
		
		try {
		acceptButton.removeActionListener(acceptButton.getActionListeners()[0]);
		} catch (Exception e) {}
		acceptButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Screen.battleScreen.setVisible(false);
				Screen.gameScreen.setVisible(true);
				Screen.gameScreen.setScreensInvisible();
				Screen.gameScreen.mainPanel.homeView.setVisible(true);
				
				if (Main.league.calendarDay >= Main.league.calendar.calendarDays.size()) {
					
					TextPopup popup = new TextPopup(500, 500, Colour.LRED, false);
						int leaguePosition = 0;
						String text = "";
						
						for (int i = 0; i < Main.league.armies.size(); i++) {
							if (Main.league.armies.get(i).name == Main.yourArmy.name) {
								leaguePosition = i + 1;
							}
						}
						switch(leaguePosition) {
						case 1:	Trophies.wonLeague = true;
								SaveTrophies.save();
								text = "Congratulations. You have bested the odds and come out on top of the league. "
								+ "Your glory will be sung for many years. Or at least until you decide to play again.";
								break;
						case 2: text = "Well Done. You almost made it to the top. You just needed that one roll of the dice to "
								+ "go your way, or that one opponent to lose that one crucial game. Still, second place is not "
								+ "a bad result!"; break;
						case 3: text = "You did alright. If this were the olympics, you'd still get a medal. Since it's just a "
								+ "game, you'll have to make do with these words of encouragement. Keep on trying and soon you'll"
								+ " make it to the top!"; break;
						case 4: text = "Well, the season is over, and you didn't do that great. You might not get fired, "
								+ "but that's about the best we can say. Hooray, I suppose?"; break;
						case 5: text = "You scored the fifth spot, which is on the right hand column of the table. You'll "
								+ "probably console yourself by saying it could have been worse. This is technically true, "
								+ "but it could have gone a whole lot better, also..."; break;
						case 6: text = "Oh dear. You did quite poorly, finishing in sixth place. Blame the poor game design or "
								+ "such. Or you know, try harder?"; break;
						case 7: text = "Were you even trying at all? Did you assign orders or did you just send in the troops "
								+ "willy nilly? Do you feel a sinking sense of shame in scoring the penultimate result?"; break;
						case 8: text = "I can only imagine you did this terribly because you thought there might be a trophy or "
								+ "achievement or something hanging on this abysmal result? Well, there isn't. "
								+ "Also, you're fired. For next season, we have decided to put a chimpanzee "
								+ "as general manager, expectations are it'll do a lot better than you did."; break;
						}
					
					popup.writeText(text);
					popup.acceptButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Main.screen.dispose();
						}
					});
					popup.setVisible(true);
				}
			}
		});
		

		
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
