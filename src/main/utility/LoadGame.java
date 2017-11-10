package main.utility;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import main.Main;
import main.entity.armies.Army;
import main.entity.armies.TestArmy;
import main.graphics.Screen;

public abstract class LoadGame {

	public static void load() {
		
		try{
			FileInputStream saveFile = new FileInputStream("saveTest.sav");

			ObjectInputStream save = new ObjectInputStream(saveFile);
			
			Army savedArmy = new TestArmy();
			
			savedArmy = (Army) save.readObject();
			Main.yourArmy = savedArmy;
			Screen.gameScreen.mainPanel.armyView.fillArmyView();
			Screen.gameScreen.setVisible(true);

			save.close(); 
			}
		
			catch(Exception exc){
			exc.printStackTrace();
			}
		
	}
	
	
}