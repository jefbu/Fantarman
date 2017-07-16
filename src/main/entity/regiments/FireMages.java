package main.entity.regiments;

import javax.swing.ImageIcon;

import main.graphics.battleScreen.BattleScreen;

public class FireMages extends Regiment {
	
	public FireMages() {
		
		super();
		this.rows = 2;
		this.columns = 3;
		
		this.x = 0;
		this.y = 0;
		
		icon = imageLoader.loadImageIcon("/regiments/firemages.png", width, height);
		
	}
	

}
