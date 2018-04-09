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
	public int upkeep;
	public int income;
	public GlobalBattleStrategy battleStrategy;
	public DeploymentStrategy deploymentStrategy;
	
	public ScoreSheet scoreSheet;
	
	public int boardSatisfaction;
	public int expectation;
	public int fanSatisfaction;
	
	public Army() {
		
		roster = new ArrayList<Regiment>();		
		scoreSheet = new ScoreSheet();
		
		
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
	
	public void calculateBoardSatisfaction() {
		
	}
	
	public void calculateFanSatisfaction() {
		
	}

}
