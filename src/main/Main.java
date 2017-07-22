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
	public static DoveMasters enemy;
	public static DoveMasters enemy2;
	public static DoveMasters enemy3;
	public static Army yourArmy;
	public static Army opponentArmy;
	public static ArrayList<Battle> battles;
	
	

	
	public static void main(String[] args) {

		screen = new Screen();
		battles = new ArrayList<Battle>();

		yourArmy = new Army();
		opponentArmy = new Army();
		
		fireMages = new FireMages();		
		two = new DoveMasters();
		enemy = new DoveMasters();
		enemy2 = new DoveMasters();
		enemy3 = new DoveMasters();
		
		yourArmy.roster.add(fireMages);
		yourArmy.roster.add(two);
		
		opponentArmy.roster.add(enemy);
		opponentArmy.roster.add(enemy2);
		opponentArmy.roster.add(enemy3);
				
		battles.add(new Battle());
		

		
	}

}
