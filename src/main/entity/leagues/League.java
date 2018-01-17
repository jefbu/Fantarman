package main.entity.leagues;

import java.util.ArrayList;

import main.entity.armies.Army;

public class League {
	
	public ArrayList<Army> armies;
	
	public League() {
		
	}
	
	public void populateLeague(ArrayList<Army> armies) {
		
		this.armies = armies;
		
	}

}
