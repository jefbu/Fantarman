package main.utility;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public abstract class LoadTrophies {

	public static void load() {
		
		try{
			FileInputStream saveFile = new FileInputStream("saveTrophies.sav");

			ObjectInputStream save = new ObjectInputStream(saveFile);
			
			boolean spaghetti;
			boolean wonLeague;
			boolean calcium;
			boolean stag;
			
			spaghetti = (boolean) save.readObject();
			wonLeague = (boolean) save.readObject();
			calcium = (boolean) save.readObject();
			stag = (boolean) save.readObject();
			
			Trophies.spaghetti = spaghetti;
			Trophies.wonLeague = wonLeague;
			Trophies.calcium = calcium;
			Trophies.stag = stag;

			save.close(); 
			}
		
			catch(Exception exc){
			exc.printStackTrace();
			}	
	}	
}