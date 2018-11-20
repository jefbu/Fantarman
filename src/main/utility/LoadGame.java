package main.utility;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import main.Main;
import main.entity.armies.Army;
import main.entity.armies.TestArmy;
import main.entity.leagues.League;
import main.graphics.Screen;

public abstract class LoadGame {

	public static void load() {
		
		try{
			FileInputStream saveFile = new FileInputStream("saveTest.sav");

			ObjectInputStream save = new ObjectInputStream(saveFile);
			
			Army savedArmy = new TestArmy();
			League savedLeague = new League();
			
			savedArmy = (Army) save.readObject();
			savedLeague = (League) save.readObject();
			Main.yourArmy = savedArmy;
			Main.league = savedLeague;
			Screen.gameScreen.mainPanel.homeView.fillHomeScreen();
			Screen.gameScreen.setScreensInvisible();
			Screen.gameScreen.mainPanel.homeView.setVisible(true);
			Screen.gameScreen.setVisible(true);

			save.close(); 
			}
		
			catch(Exception exc){
			}
		
	}
	
	
}
