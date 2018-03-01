package main.entity.leagues;

import java.io.Serializable;
import java.util.ArrayList;

public class CalendarDay implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public ArrayList<Matchup> matchups;
	
	public CalendarDay(Matchup matchup1, Matchup matchup2, Matchup matchup3, Matchup matchup4) {
		
		matchups = new ArrayList<Matchup>();

		matchups.add(matchup1);
		matchups.add(matchup2);
		matchups.add(matchup3);
		matchups.add(matchup4);
		
	}

}
