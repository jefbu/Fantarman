package main;

import components.IndexedPanel;
import entity.regiments.FireMages;
import graphics.Screen;

public class Main {

	public static Screen screen;
	public static FireMages fireMages;
	
	public static void main(String[] args) {

		fireMages = new FireMages();
		fireMages.setIndices(0);

		for (IndexedPanel panel: fireMages.panels) {
			
			System.out.println(panel.index); 
			
		}
		
		screen = new Screen();

		
	}

}
