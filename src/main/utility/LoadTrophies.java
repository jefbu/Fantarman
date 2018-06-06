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
			
			spaghetti = (boolean) save.readObject();
			wonLeague = (boolean) save.readObject();
			
			Trophies.spaghetti = spaghetti;
			Trophies.wonLeague = wonLeague;

			save.close(); 
			}
		
			catch(Exception exc){
			exc.printStackTrace();
			}	
	}	
}