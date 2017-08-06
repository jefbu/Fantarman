package main;

import java.util.ArrayList;

import main.battle.Battle;
import main.entity.armies.Army;
import main.entity.captains.Captain;
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
		
		fireMages = new FireMages("Infernomen", new Captain("Alec", 0, 2, 0, 100, 2, 0));		
		two = new DoveMasters("Pigeonpoop", new Captain("Bae", 0, 0, 5, 0, -5, 0));
		enemy = new DoveMasters("One", new Captain("x", 0, 0, 0, 0, 0, 1));
		enemy2 = new DoveMasters("Two", new Captain("x", 0, 0, 0, 0, 0, 2));
		enemy3 = new DoveMasters("Three", new Captain("x", 0, 0, 0, 0, 0, 1));

		
		yourArmy.roster.add(fireMages);
		yourArmy.roster.add(two);
		
		opponentArmy.roster.add(enemy);
		opponentArmy.roster.add(enemy2);
		opponentArmy.roster.add(enemy3);
						
		battles.add(new Battle());
		

		
	}

}
