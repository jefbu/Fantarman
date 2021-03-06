package main.utility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class SaveTrophies {
	
	public static void save() {
		
		try {
		
			FileOutputStream saveFile = new FileOutputStream("saveTrophies.sav");
			ObjectOutputStream save = new ObjectOutputStream(saveFile);
			
			boolean spaghetti = Trophies.spaghetti;
			save.writeObject(spaghetti);
			
			boolean wonLeague = Trophies.wonLeague;
			save.writeObject(wonLeague);
			
			boolean calcium = Trophies.calcium;
			save.writeObject(calcium);
			
			boolean stag = Trophies.stag;
			save.writeObject(stag);
			
			save.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}