package main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import main.battle.Battle;
import main.entity.armies.Army;
import main.entity.leagues.League;
import main.graphics.Screen;
import main.graphics.TileImages;
import main.graphics.battleScreen.BattleScreen;

public class Main {

	public static Screen screen;
	public static Army yourArmy;
	public static ArrayList<Battle> battles;
	
	public static League league;

	
	public static void main(String[] args) {
		
	try {
		
		System.out.println("print print print");
		screen = new Screen();
		battles = new ArrayList<Battle>();
		TileImages.loadImages(BattleScreen.battleScene.roundedWidth / 48, BattleScreen.battleScene.roundedHeight / 32);
						
		//yourArmy = new TestArmy();
		
		league = new League();
		
	} catch (Throwable t) {
		    JOptionPane.showMessageDialog(
		        null, t.getClass().getSimpleName() + ": " + t.getMessage());
		    throw t; // don't suppress Throwable
		  }
		
	}

}
