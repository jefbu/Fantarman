package main.utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import main.Main;
import main.entity.armies.Army;

public abstract class SaveGame {
	
	public static void save() {
		
		try {
		
			FileOutputStream saveFile = new FileOutputStream("saveTest.sav");
			ObjectOutputStream save = new ObjectOutputStream(saveFile);

			Army savedArmy = Main.yourArmy;
			
			save.writeObject(savedArmy);
			
			save.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
	}
	
	
	

}
