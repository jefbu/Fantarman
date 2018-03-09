package main.entity.armies;

import java.io.Serializable;
import java.util.ArrayList;

import main.AI.GlobalBattleStrategy;
import main.entity.leagues.ScoreSheet;
import main.entity.regiments.Regiment;

public class Army implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public ArrayList<Regiment> roster;
	public int value;
	public String name;
	public GlobalBattleStrategy battleStrategy;
	
	public ScoreSheet scoreSheet;
	
	public Army() {
		
		roster = new ArrayList<Regiment>();		
		scoreSheet = new ScoreSheet();
		
		
	}
	
	public void calculateValue() {
		
		for (Regiment regiment: roster) {
		value = value + regiment.value; 
		}
	}

}
