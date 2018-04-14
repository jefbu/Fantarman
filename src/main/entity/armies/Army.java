package main.entity.armies;

import java.io.Serializable;
import java.util.ArrayList;

import main.Main;
import main.AI.DeploymentStrategy;
import main.AI.GlobalBattleStrategy;
import main.entity.leagues.ScoreSheet;
import main.entity.regiments.Regiment;

public class Army implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public ArrayList<Regiment> roster;
	public int value;
	public String name;
	public int money;
	public int[] oldMoney;
	public int upkeep;
	public int income;
	public GlobalBattleStrategy battleStrategy;
	public DeploymentStrategy deploymentStrategy;
	
	public ScoreSheet scoreSheet;
	
	public int boardSatisfaction;
	public int[] previousBoardSatisfaction;
	public int[] previousFanSatisfaction;
	public int expectation;
	public int fanSatisfaction;
	
	public Army() {
		
		roster = new ArrayList<Regiment>();		
		scoreSheet = new ScoreSheet();
		
		previousBoardSatisfaction = new int[4];
		previousBoardSatisfaction[0] = 60;
		previousBoardSatisfaction[1] = 60;
		previousBoardSatisfaction[2] = 60;
		previousBoardSatisfaction[3] = 60;
		boardSatisfaction = 60;
		previousFanSatisfaction = new int[4];
		previousFanSatisfaction[0] = 60;
		previousFanSatisfaction[1] = 60;
		previousFanSatisfaction[2] = 60;
		previousFanSatisfaction[3] = 60;
		fanSatisfaction = 60;
		
		
	}
	
	public void calculateValue() {
		
		for (Regiment regiment: roster) {
		value = value + regiment.value; 
		}
	}
	
	public void calculateUpkeep() {
		
		upkeep = 0;
		for(Regiment regiment: roster) {
		regiment.calculateValue();
		upkeep = upkeep + regiment.upkeep;
		}
	}
	
	public void calculateIncome() {
		
		income = 0;
		for(Regiment regiment: roster) {
		income = income + regiment.captain.prestige * 2;
		income = income + (regiment.enemiesDefeated * 10) - (regiment.timesDefeated * 5);
		}
		switch (Main.league.armies.indexOf(this)) {
		case 0: income = income * 15 / 10; break;
		case 1: income = income * 12 / 10; break;
		case 2: income = income * 11 / 10; break;
		case 6: income = income * 9 / 10; break;
		case 7: income = income * 8 / 10; break;
		default: break;
		}
	}
	
	public void calculateBoardSatisfaction(int matchResult) {
		
		previousBoardSatisfaction[0] = previousBoardSatisfaction[1];
		previousBoardSatisfaction[1] = previousBoardSatisfaction[2];
		previousBoardSatisfaction[2] = previousBoardSatisfaction[3];
		previousBoardSatisfaction[3] = boardSatisfaction;
		boardSatisfaction = boardSatisfaction / 2;
		boardSatisfaction = boardSatisfaction + matchResult;
		boardSatisfaction = boardSatisfaction + calculateLeagueResult();
		boardSatisfaction = boardSatisfaction + (3 * calculateFinancialStability());
		System.out.println("New Board Satisfaction is " + boardSatisfaction);
		
	}
	
	public void calculateFanSatisfaction(int matchResult) {
		
		previousFanSatisfaction[0] = previousFanSatisfaction[1];
		previousFanSatisfaction[1] = previousFanSatisfaction[2];
		previousFanSatisfaction[2] = previousFanSatisfaction[3];
		previousFanSatisfaction[3] = fanSatisfaction;
		fanSatisfaction = fanSatisfaction / 2;
		fanSatisfaction = fanSatisfaction + (2 * matchResult);
		fanSatisfaction = fanSatisfaction + (2 * calculateLeagueResult());
		fanSatisfaction = fanSatisfaction + calculateFinancialStability();
		
	}
	
	private int calculateLeagueResult() {
		
		int leaguePosition = 0;
		
		for (int i = 0; i < Main.league.armies.size(); i++) {
			if (Main.league.armies.get(i) == this) {
				leaguePosition = i;
			}
		}
		
		switch (leaguePosition) {
		case 0: return 10;
		case 1: return 8;
		case 2: return 7;
		case 3: return 6;
		case 4: return 4;
		case 5: return 3;
		case 6: return 1;
		case 7: return 0;
		}
		
		return 2000;
		
	}
	
	private int calculateFinancialStability() {
		if (income > upkeep * 15 / 10) { return 10; }
		else if (income > upkeep * 125 / 100) { return 8; }
		else if (income > upkeep) { return 6; }
		else if (income > upkeep * 8 / 10) { return 4; }
		else if (income > upkeep * 6 / 10) { return 2; }
		else { return 0; }
	}
	
	

}
