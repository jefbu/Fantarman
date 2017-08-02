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
	public static FireMages enemy4;
	public static FireMages enemy5;
	public static FireMages enemy6;
	public static FireMages enemy7;
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
		enemy4 = new FireMages();
		enemy5 = new FireMages();
		enemy6 = new FireMages();
		enemy7 = new FireMages();
		
		yourArmy.roster.add(fireMages);
		yourArmy.roster.add(two);
		
		opponentArmy.roster.add(enemy);
		opponentArmy.roster.add(enemy2);
		opponentArmy.roster.add(enemy3);
		opponentArmy.roster.add(enemy4);
		opponentArmy.roster.add(enemy5);
		opponentArmy.roster.add(enemy6);
		opponentArmy.roster.add(enemy7);
				
		battles.add(new Battle());
		

		
	}

}
