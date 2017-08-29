package main;

import java.util.ArrayList;

import main.battle.Battle;
import main.entity.armies.Army;
import main.entity.captains.Captain;
import main.entity.regiments.DoveMasters;
import main.entity.regiments.FireMages;
import main.entity.regiments.Harvesters;
import main.graphics.Screen;
import main.graphics.TileImages;
import main.graphics.battleScreen.BattleScreen;

public class Main {

	public static Screen screen;
	public static FireMages fireMages;
	public static DoveMasters pigeonPoop;
	public static DoveMasters pidgeotto;
	public static DoveMasters colombe;
	public static FireMages boomBox;
	public static Harvesters harvesters;

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
		boomBox = new FireMages("BoomBomx", new Captain("x", 0, 0, 0, 0, 0, 1));
		harvesters = new Harvesters("Harvest Lads", new Captain("x", 2, 1, 1, 0, 0, 0));

		
		yourArmy.roster.add(pidgeotto);
		yourArmy.roster.add(fireMages);
		yourArmy.roster.add(harvesters);
		
		yourArmy.calculateValue();
		
		opponentArmy.roster.add(pigeonPoop);
		opponentArmy.roster.add(colombe);
		opponentArmy.roster.add(boomBox);
		
		opponentArmy.calculateValue();
						
		battles.add(new Battle());
		

		
	}

}
