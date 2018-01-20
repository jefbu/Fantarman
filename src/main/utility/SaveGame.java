package main.utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import main.Main;
import main.entity.armies.Army;
import main.entity.leagues.League;

public abstract class SaveGame {
	
	public static void save() {
		
		try {
		
			FileOutputStream saveFile = new FileOutputStream("saveTest.sav");
			ObjectOutputStream save = new ObjectOutputStream(saveFile);

			Army savedArmy = Main.yourArmy;
			League savedLeague = Main.league;
			
			save.writeObject(savedArmy);
			save.writeObject(savedLeague);
			
			save.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
	}
	
	
	

}
