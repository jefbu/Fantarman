package main.utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import main.Main;

public abstract class SaveGame {
	
	public static void save() {
		
		try {
		
			FileOutputStream saveFile = new FileOutputStream("saveTest.sav");
			ObjectOutputStream save = new ObjectOutputStream(saveFile);

			save.writeObject(Main.yourArmy);
			
			save.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		
	}
	
	
	

}
