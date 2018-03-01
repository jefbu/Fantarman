package main.entity.leagues;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Calendar implements Serializable {

	private static final long serialVersionUID = 1L;
	public ArrayList<CalendarDay> calendarDays;
	public ArrayList<Matchup> matchups;
	
	public Calendar(League league, int year) {
		
		calendarDays = new ArrayList<CalendarDay>();
		matchups = new ArrayList<Matchup>();
		
		Collections.shuffle(league.armies);
		
		matchups.add(new Matchup(league.armies.get(0), league.armies.get(1)));
		matchups.add(new Matchup(league.armies.get(2), league.armies.get(3)));
		matchups.add(new Matchup(league.armies.get(4), league.armies.get(5)));
		matchups.add(new Matchup(league.armies.get(6), league.armies.get(7)));
		matchups.add(new Matchup(league.armies.get(0), league.armies.get(2)));
		matchups.add(new Matchup(league.armies.get(1), league.armies.get(3)));
		matchups.add(new Matchup(league.armies.get(4), league.armies.get(6)));
		matchups.add(new Matchup(league.armies.get(5), league.armies.get(7)));
		matchups.add(new Matchup(league.armies.get(0), league.armies.get(3)));
		matchups.add(new Matchup(league.armies.get(1), league.armies.get(2)));
		matchups.add(new Matchup(league.armies.get(4), league.armies.get(7)));
		matchups.add(new Matchup(league.armies.get(5), league.armies.get(6)));
		matchups.add(new Matchup(league.armies.get(0), league.armies.get(4)));
		matchups.add(new Matchup(league.armies.get(1), league.armies.get(5)));
		matchups.add(new Matchup(league.armies.get(2), league.armies.get(6)));
		matchups.add(new Matchup(league.armies.get(3), league.armies.get(7)));
		matchups.add(new Matchup(league.armies.get(0), league.armies.get(5)));
		matchups.add(new Matchup(league.armies.get(1), league.armies.get(6)));
		matchups.add(new Matchup(league.armies.get(2), league.armies.get(7)));
		matchups.add(new Matchup(league.armies.get(3), league.armies.get(4)));
		matchups.add(new Matchup(league.armies.get(0), league.armies.get(6)));
		matchups.add(new Matchup(league.armies.get(1), league.armies.get(7)));
		matchups.add(new Matchup(league.armies.get(2), league.armies.get(4)));
		matchups.add(new Matchup(league.armies.get(3), league.armies.get(5)));
		matchups.add(new Matchup(league.armies.get(0), league.armies.get(7)));
		matchups.add(new Matchup(league.armies.get(1), league.armies.get(4)));
		matchups.add(new Matchup(league.armies.get(2), league.armies.get(5)));
		matchups.add(new Matchup(league.armies.get(3), league.armies.get(6)));
		
		
		calendarDays.add(new CalendarDay(matchups.get(0), matchups.get(1), matchups.get(2), matchups.get(3)));
		calendarDays.add(new CalendarDay(matchups.get(4), matchups.get(5), matchups.get(6), matchups.get(7)));
		calendarDays.add(new CalendarDay(matchups.get(8), matchups.get(9), matchups.get(10), matchups.get(11)));
		calendarDays.add(new CalendarDay(matchups.get(12), matchups.get(13), matchups.get(14), matchups.get(15)));
		calendarDays.add(new CalendarDay(matchups.get(16), matchups.get(17), matchups.get(18), matchups.get(19)));
		calendarDays.add(new CalendarDay(matchups.get(20), matchups.get(21), matchups.get(22), matchups.get(23)));
		calendarDays.add(new CalendarDay(matchups.get(24), matchups.get(25), matchups.get(26), matchups.get(27)));
		
		int counter1 = 1;
		for (CalendarDay calendarDay: calendarDays) {
			System.out.println("Calendarday: " + counter1);
			
			for (Matchup matchup: calendarDay.matchups) {
				System.out.println(matchup.army1.name + " versus " + matchup.army2.name);
			}
			counter1++;
		}
		
	}
	
	
		
		
}
