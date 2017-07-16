package main;

import java.util.ArrayList;

import main.entity.armies.Army;
import main.entity.regiments.DoveMasters;
import main.entity.regiments.FireMages;
import main.graphics.Screen;

public class Main {

	public static Screen screen;
	public static FireMages fireMages;
	public static DoveMasters two;
	public static Army testArmy;
	public static ArrayList<Battle> battles;
	
	

	
	public static void main(String[] args) {

		screen = new Screen();
		battles = new ArrayList<Battle>();

		testArmy = new Army();
		
		fireMages = new FireMages();
		fireMages.setIndices(1362);
		
		two = new DoveMasters();
		two.setIndices(600);
		
		testArmy.roster.add(fireMages);
		testArmy.roster.add(two);
		
		
		battles.add(new Battle());
		

		
	}

}
