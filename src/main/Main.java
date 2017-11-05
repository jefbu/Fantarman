package main;

import java.util.ArrayList;

import main.battle.Battle;
import main.entity.armies.Army;
import main.entity.armies.TestArmy;
import main.graphics.Screen;
import main.graphics.TileImages;
import main.graphics.battleScreen.BattleScreen;

public class Main {

	public static Screen screen;
	public static Army yourArmy;
	public static ArrayList<Battle> battles;
	
	

	
	public static void main(String[] args) {
		

		screen = new Screen();
		battles = new ArrayList<Battle>();
		TileImages.loadImages(BattleScreen.battleScene.roundedWidth / 48, BattleScreen.battleScene.roundedHeight / 32);
						
		yourArmy = new TestArmy();
		
	}

}
