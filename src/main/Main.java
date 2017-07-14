package main;

import java.util.ArrayList;

import main.entity.armies.Army;
import main.entity.regiments.FireMages;
import main.graphics.Screen;
import main.graphics.battleScreen.BattleScreen;

public class Main {

	public static Screen screen;
	public static FireMages fireMages;
	public static FireMages two;
	public static Army army;
	public static ArrayList<Battle> battles;
	
	

	
	public static void main(String[] args) {

		screen = new Screen();
		battles = new ArrayList<Battle>();
		
		battles.add(new Battle());


		//Screen.battleScreen.battleScene.fillBattleScene();

		
		
		
		/*fireMages = new FireMages();
		fireMages.setIndices(362);
		
		two = new FireMages();
		two.setIndices(16);
		
		army.roster.add(fireMages);
		army.roster.add(two);*/
		
	}

}
