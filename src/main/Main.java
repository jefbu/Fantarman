package main;

import java.util.ArrayList;

import main.battle.Battle;
import main.entity.armies.Army;
import main.entity.captains.Captain;
import main.entity.regiments.DoveMasters;
import main.entity.regiments.FireMages;
import main.graphics.Screen;
import main.graphics.TileImages;
import main.graphics.battleScreen.BattleScreen;

public class Main {

	public static Screen screen;
	public static FireMages fireMages;
	public static DoveMasters pigeonPoop;
	public static DoveMasters pidgeotto;
	public static DoveMasters colombe;
	public static DoveMasters birdie;

	public static Army yourArmy;
	public static Army opponentArmy;
	public static ArrayList<Battle> battles;
	
	

	
	public static void main(String[] args) {

		screen = new Screen();
		battles = new ArrayList<Battle>();
		TileImages.loadImages(BattleScreen.battleScene.roundedWidth / 48, BattleScreen.battleScene.roundedHeight / 32);


		yourArmy = new Army();
		opponentArmy = new Army();
		
		fireMages = new FireMages("Infernomen", new Captain("Alec", 0, 2, 0, 100, 2, 0));
		pigeonPoop = new DoveMasters("Pigeonpoop", new Captain("Bae", 0, 0, 5, 0, -5, 0));
		pidgeotto = new DoveMasters("Pidgeotto", new Captain("x", 0, 0, 0, 0, 0, 1));
		colombe = new DoveMasters("Colombe", new Captain("x", 0, 0, 0, 0, 0, 2));
		birdie = new DoveMasters("Birdie", new Captain("x", 0, 0, 0, 0, 0, 1));

		
		yourArmy.roster.add(pidgeotto);
		yourArmy.roster.add(pigeonPoop);
		
		opponentArmy.roster.add(fireMages);
		opponentArmy.roster.add(colombe);
		opponentArmy.roster.add(birdie);
						
		battles.add(new Battle());
		

		
	}

}
