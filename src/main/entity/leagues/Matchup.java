package main.entity.leagues;

import java.io.Serializable;

import main.entity.armies.Army;

public class Matchup implements Serializable {

	private static final long serialVersionUID = 1L;
	public Army army1;
	public Army army2;
	public Result result;
	
	public Matchup(Army army1, Army army2) {
		
		this.army1 = army1;
		this.army2 = army2;
		
	}
	
	
}
