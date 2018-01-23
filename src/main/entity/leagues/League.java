package main.entity.leagues;

import java.io.Serializable;
import java.util.ArrayList;

import main.entity.armies.Army;

public class League implements Serializable {

	private static final long serialVersionUID = 1L;

	public ArrayList<Army> armies;
	public Calendar calendar;
	public int calendarDay;
	
	public League() {
		
		calendarDay = 0;
		
	}
	
	public void populateLeague(ArrayList<Army> armies) {
		
		this.armies = armies;
		
	}
	
	public void createCalendar() {
		
		calendar = new Calendar(this, 1);
		
	}

}
