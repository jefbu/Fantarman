package main.entity.leagues;

import java.io.Serializable;

public class ScoreSheet implements Serializable {

	private static final long serialVersionUID = 1L;

	public int bigWins;
	public int smallWins;
	public int draws;
	public int smallLosses;
	public int bigLosses;
	public int totalPoints;
	
	public ScoreSheet() {
		bigWins = 0;
		smallWins = 0;
		draws = 0;
		smallLosses = 0;
		bigLosses = 0;
		totalPoints = 0;
	}
	
	public void calculatePoints() {
		
		totalPoints = (bigWins * 3) + (smallWins * 2) + draws;
		
	}

}
