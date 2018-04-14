package main.utility;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public abstract class LoadTrophies {

	public static void load() {
		
		try{
			FileInputStream saveFile = new FileInputStream("saveTrophies.sav");

			ObjectInputStream save = new ObjectInputStream(saveFile);
			
			boolean spaghetti;
			
			spaghetti = (boolean) save.readObject();
			
			Trophies.spaghetti = spaghetti;

			save.close(); 
			}
		
			catch(Exception exc){
			exc.printStackTrace();
			}	
	}	
}